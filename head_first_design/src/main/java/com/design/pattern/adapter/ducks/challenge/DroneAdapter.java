package com.design.pattern.adapter.ducks.challenge;

import com.design.pattern.adapter.ducks.Duck;

public class DroneAdapter implements Duck {
  Drone drone;

  public DroneAdapter(Drone drone) {
    this.drone = drone;
  }

  public void quack() {
    drone.beep();
  }

  public void fly() {
    drone.spin_rotors();
    drone.take_off();
  }
}
