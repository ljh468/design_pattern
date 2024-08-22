package com.design.pattern._02_구조패턴._08_composite._02_after;

public class Character implements Component {

    private Bag bag;

    @Override
    public int getPrice() {
        return bag.getPrice();
    }

}
