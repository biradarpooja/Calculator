/*output
Enter length
45
Enter breadth
23
Area : 1035
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author biradar bharat
 */
//Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its length and breadth as parameters of its constructor and having a method named 'returnArea' which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
    import java.util.*;
class Rectangle2{
  int length;
  int breadth;
  public Rectangle2(int l, int b){
    length = l;
    breadth = b;
  }
  public int getArea(){
    return length*breadth;
  }
}

class Ans{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int l,b;

    System.out.println("Enter length");
    l = s.nextInt();
    System.out.println("Enter breadth");
    b = s.nextInt();

    Rectangle2 a = new Rectangle2(l,b);
    System.out.println("Area : "+a.getArea());
  }
}						