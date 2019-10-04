package com.example.cmput301lab4demo;

public abstract class Shape {
  int y;
  int x;
  String color = "purple";

  public Shape(int x, int y, String color) {
    this.x = x;
    this.y = y;
    this.color = color;
  }
}
