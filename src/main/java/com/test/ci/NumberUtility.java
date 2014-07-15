package com.test.ci;

import java.util.*;

public class NumberUtility{

  private int[] arr;

public boolean isEven(int num){
    return num%2==0;
  }
  
  public int countEvens(int[] arr){
  // add sonar violatios here
    this.arr = arr;
    int evenCount = 0;
    
    for(int i=0;i<arr.length; ++i){
      if(arr[i]%2==0){
        evenCount++;
      }
    }
    
    return evenCount;
  }
  
  public void doSomethingWierd(){
    int f_f=8*6;
  }
}
