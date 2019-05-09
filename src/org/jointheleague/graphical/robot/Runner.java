package org.jointheleague.graphical.robot;


public class Runner {
public static void main(String[] args) {
	Robot rob = new Robot();
	rob.penDown();
	rob.drawRainbowLine(100);
	rob.explode();
}
}
