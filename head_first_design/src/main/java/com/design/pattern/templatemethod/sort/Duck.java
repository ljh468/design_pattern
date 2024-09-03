package com.design.pattern.templatemethod.sort;

public class Duck implements Comparable<Duck> {
	String name;
	int weight;
  
	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
 
	public String toString() {
		return name + " weighs " + weight;
	}

	// 오름차순은 this가 크면 양수를 리턴, 내림차순은 this가 크면 음수를 리턴
	public int compareTo(Duck otherDuck) {
		if (this.weight < otherDuck.weight) {
			return -1;
		} else if (this.weight == otherDuck.weight) {
			return 0;
		} else { // this.weight > otherDuck.weight
			return 1;
		}
	}
}
