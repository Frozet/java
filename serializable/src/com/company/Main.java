package com.company;

import java.io.*;

enum Direction
{
    UP, DOWN, LEFT, RIGHT
}
class Robot implements Serializable {
    int X, Y;
    Direction dir;
    public String toString() {
        return String.format("[X:%d, Y:%d, Direction:%s]", X, Y, getDirection());
    }
    public String getDirection() {
        switch (dir) {
            case UP: return "Up";
            case DOWN: return "Down";
            case LEFT: return "Left";
            case RIGHT: return "Right";
        }
        return "";
    }
    private void writeObject(ObjectOutputStream out) throws IOException
    {
        byte[] data = new byte[12];
        // создать массив, содержащий запись состояния объекта
        // в виде массива байтов
        out.write(data);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
    {
        // считать массив байтов и задать состояние объекта
        // в соответствии с содержимым массива
    }
    Robot(int x, int y, Direction d) {
        this.X = x;
        Y = y;
        dir = d;
    }
}
public class Main {

    public static void main(String[] args)  throws IOException, ClassNotFoundException{

        Robot r1 = new Robot(1,2,Direction.DOWN);
        Robot r2 = new Robot(3,5,Direction.LEFT);
        FileOutputStream fos = new FileOutputStream("/home/student/robot.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(r1);
        oos.writeObject(r2);
        oos.close(); fos.close();

        FileInputStream fis = new FileInputStream("/home/student/robot.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Robot a = (Robot) ois.readObject();
        Robot b = (Robot) ois.readObject();
        System.out.println(a);
        System.out.println(b);
    }
}