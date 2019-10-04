package com.example.cmput301lab4demo;

public abstract class Shape {
  int x;
  int y;
  String color = "turquoise";

  public Shape(int x, int y, String color) {
    this.x = x;
    this.y = y;
    this.color = color;
  }
}
