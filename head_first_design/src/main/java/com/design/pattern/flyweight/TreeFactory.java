package com.design.pattern.flyweight;

public class TreeFactory {

  Tree deciduous, conifer = null;

  public TreeFactory() {
    this.deciduous = new DeciduousTree();
    this.conifer = new ConiferTree();
  }

  public Tree getTree(String type) throws Exception {
    if (type.equals("deciduous")) {
      return this.deciduous;
    } else if (type.equals("conifer")) {
      return this.conifer;
    } else {
      throw new Exception("Invalid kind of tree");
    }
  }
}