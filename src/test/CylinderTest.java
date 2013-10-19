/***********************************************************************
Program Name: CylinderTest.java
Programmer's Name: Brandt Lareau
Program Description: Calculate some Cylinder information
***********************************************************************/
package test;

import test.TestHelper;
import app.Cylinder;

class CylinderTest {
  TestHelper test_helper = new TestHelper();
  public static Cylinder cylinder;
  
  // Returns volumn of the cylinder
  public void tests() {
    cylinder = new Cylinder(20.0, 20.0);
    test_helper.describe("Volumn", "find the volumn of the cylinder with height = 20.0 radius = 20.0");
    test_helper.should_double(cylinder.volume(), 25132.741228718343);
    
    cylinder = new Cylinder(10.0, 10.0);
    test_helper.describe("Volumn", "find the volumn of the cylinder with height = 10.0 radius = 10.0");
    test_helper.should_double(cylinder.volume(), 3141.592653589793);
    
    cylinder = new Cylinder(34.2, 23.1);
    test_helper.describe("Volumn", "find the volumn of the cylinder with height = 34.2 radius = 23.1");
    test_helper.should_double(cylinder.volume(), 57332.3757511661);
  }
  
  // Init
  public static void main(String args[]) {
    new CylinderTest();
  }
  
  
  public CylinderTest(){
    tests();
  }
}