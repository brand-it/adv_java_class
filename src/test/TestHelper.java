/***********************************************************************
Program Name: TestHelper.java
Programmer's Name: Brandt Lareau
Program Description: This is going to help out with testing what ever might come along
***********************************************************************/
package test;

class TestHelper {
  
  public void should_string(String result, String expectation){
    if (result == expectation){
      success(result, expectation);
    } else {
      failed(result, expectation);
    }
  }
  
  public void should_double(Double result, Double expectation){
    int retval = Double.compare(result, expectation);
    if (retval == 0){
      success(String.valueOf(result), String.valueOf(expectation));
    } else {
      failed(String.valueOf(result), String.valueOf(expectation));
    }
  }
  
  public void should_int(int result, int expectation){
    if (result == expectation){
      success(String.valueOf(result), String.valueOf(expectation));
    } else {
      failed(String.valueOf(result), String.valueOf(expectation));
    }
  }
  
  private void success(String result, String expectation){
    System.out.println("    Success \n");
  }
  
  private void failed(String result, String expectation){
    System.out.println("    Expected " + expectation + " but got " + result);
    new Exception().printStackTrace(System.out);
    System.out.println("");
    
  }
  
  public void describe(String method, String action){
    System.out.println(method + " should " + action);
  }
}