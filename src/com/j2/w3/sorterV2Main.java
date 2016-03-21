package com.j2.w3;

public class sorterV2Main{
  
  public static void main(String[] args){
    String[] b={"Adam", "John", "Jones", "Skrien", "Smith" };
    Comparator strComp = new StringComparator();
    Sorter.sort(b,strComp);
    Integer[] c = {new Integer(3), new Integer(1), new Integer(4), new Integer(2)};
    Comparator intComp = new IntegerComparator();
    Sorter.sort(c,intComp);
    
    for(int i=0; i<b.length; i++)
      System.out.println("B["+i+"]="+b[i]);
    for(int i=0; i<c.length; i++)
      System.out.println("C["+i+"]="+c[i]);

  }
}


class Sorter{
  public Sorter(){}
  
  public static void sort(Object[] ary, Comparator comp){
    //it is easy to generalization
    for(int i=ary.length-1;i>=1;i--){
      int indexOfMax = 0;
      
      for(int j=1;j<=i;j++){
        if(comp.compare(ary[j],ary[indexOfMax])>0) {
          indexOfMax=j;
          Object tmp = ary[i];
          ary[i]=ary[indexOfMax];
          ary[indexOfMax]=tmp;
        }
      }
      
    }
  }
}

interface Comparator {
  public int compare(Object o1,Object o2);
  public boolean equals(Object o);
}

class IntegerComparator implements Comparator{
  public IntegerComparator(){}
  public int compare(Object o1, Object o2){
    return (Integer)o1-(Integer)o2;
  }
  public boolean equals(Object o){return false;}
}

class StringComparator implements Comparator{
  public StringComparator(){}
  public int compare(Object o1, Object o2){
    return ((String)o1).compareTo((String)o2);
  }
  public boolean equals(Object o){
    return false;
  }
}

