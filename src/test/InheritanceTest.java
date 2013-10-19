/***********************************************************************
Program Name: InheritanceTest.java
Programmer's Name: Brandt Lareau
Program Description: Should test cube and squere 
***********************************************************************/
package test;

import test.TestHelper;
import app.Cube;
import app.Square;
import app.Point;

class InheritanceTest {
  TestHelper test_helper = new TestHelper();
  private static Cube cube = new Cube();
  private static Square square = new Square();
  private static Point point;
  
  public void tests(){
    cubeTest();
    squareTest();
    pointTest();
  }
  
  
  private void cubeTest(){
    int height = 0;
    int width = 0;
    
    test_helper.describe("Cube", "should have a area that is " + (width * height));
    test_helper.should_int(cube.getArea(), (width * height));
    
    
  }
  
  private void squareTest(){
    
  }
  
  private void pointTest(){
    int x = 0;
    point = new Cube();
    
    
    test_helper.describe("Cube", "should get x of " + x);
    test_helper.should_int(cube.getX(), x);
    
  }
  
  // Init
  public static void main(String args[]) {
    new InheritanceTest();
  }
  
  public InheritanceTest(){
    tests();
  }
}