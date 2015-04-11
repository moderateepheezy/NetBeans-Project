/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structure.and.algorithm;

/**
 *
 * @author simpumind
 */
public class OrdArray {
      private double[] a;
      private int nElems;
      
      public OrdArray(int max){
          a = new double[max];
          nElems = 0;
      }
      public int size(){
          return nElems;
      }
      public int find(double search){
          int lowerbound = 0;
          int upperbound = nElems - 1;
          int curIn;
          while(true){
              curIn = (lowerbound + upperbound) / 2;
              if(a[curIn] == search){
                  return curIn;
              }
              if(lowerbound > upperbound){
                  return nElems;
              }
              else{
                  if(a[curIn] == search){
                      lowerbound = curIn + 1;
                  }
                  else{
                      upperbound = curIn - 1;
                  }
              }
          }
      }
      public void insert(double value){
          int j;
          for(j = 0; j < nElems; j++){
              if(a[j] > value){
                  break;
              }
          }
          for(int k = nElems; k > j; k--){
              a[k] = a[k-1];
              a[j] = value;
              nElems++;
          }
      }
      
      public boolean delete(double value){
          int j = find(value);
          if(j == nElems){
              return false;
          }
          else{
              for(int k = j; k < nElems; k++){
                  a[k] = a[k+1];
              }
              nElems--;
              return true;
          }
      }
      
      public void display(){
          for(int i = 0; i < nElems; i++){
              System.out.print(a[i] + " ");
              System.out.println();;
          }
      }
}
