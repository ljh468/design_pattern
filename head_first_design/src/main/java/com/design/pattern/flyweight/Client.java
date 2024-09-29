package com.design.pattern.flyweight;

public class Client {
  public static void main(String[] args) {
    int[][] deciduousLocations = {{1, 1}, {33, 50}, {100, 90}};
    int[][] coniferLocations = {{10, 87}, {24, 76}, {2, 64}};
    TreeFactory treeFactory = new TreeFactory(); // creates the two flyweights
    try {
      Tree deciduous = treeFactory.getTree("deciduous");
      Tree conifer = treeFactory.getTree("conifer");
      for (int[] location : deciduousLocations) {
        deciduous.display(location[0], location[1]);
      }
      for (int[] location : coniferLocations) {
        conifer.display(location[0], location[1]);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}