//package ru.omsu.imit.sem5.structural.flyweight;
//
//import java.awt.*;
//
//enum State {
//    FactoryNew,
//    FieldTested,
//    Broken
//}
//
//public class TreeType {
//    private Color color;
//    private State state;
//
//    public TreeType(String name, Color color, String otherTreeData) {
//        this.name = name;
//        this.color = color;
//        this.otherTreeData = otherTreeData;
//    }
//
//    public void draw(Graphics g, int x, int y) {
//        g.setColor(Color.BLACK);
//        g.fillRect(x - 1, y, 3, 5);
//        g.setColor(color);
//        g.fillOval(x - 5, y - 10, 10, 10);
//    }
//}
