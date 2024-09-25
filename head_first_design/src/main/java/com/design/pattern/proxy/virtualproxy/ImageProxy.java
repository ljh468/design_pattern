package com.design.pattern.proxy.virtualproxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

class ImageProxy implements Icon {

  volatile ImageIcon imageIcon;

  final URL imageURL;

  Thread retrievalThread;

  boolean retrieving = false;

  public ImageProxy(URL url) {
    imageURL = url;
  }

  public int getIconWidth() {
    if (imageIcon != null) {
      return imageIcon.getIconWidth();
    } else {
      return 800;
    }
  }

  public int getIconHeight() {
    if (imageIcon != null) {
      return imageIcon.getIconHeight();
    } else {
      return 600;
    }
  }

  synchronized void setImageIcon(ImageIcon imageIcon) {
    this.imageIcon = imageIcon;
  }

  public void paintIcon(final Component c, Graphics g, int x, int y) {
    if (imageIcon != null) {
      imageIcon.paintIcon(c, g, x, y);
    } else {
      g.drawString("앨범 커버를 불러오는 중입니다. 잠시만 기다려 주세요.", x + 300, y + 190);
      if (!retrieving) {
        retrieving = true;

        // 별도의 쓰레드에서 이미지를 가져옴
        retrievalThread = new Thread(() -> {
          try {
            setImageIcon(new ImageIcon(imageURL, "Album Cover"));
            // c.repaint();
            SwingUtilities.invokeLater(() -> c.repaint());
          } catch (Exception e) {
            e.printStackTrace();
          }
        });
        retrievalThread.start();

      }
    }
  }
}
