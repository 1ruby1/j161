/*************************************************************************
 * @author ruby
 * @since 20160307
 * to show the use of package
 *
 * root
 *     /src
 *     /classes
 *  javac -d classes -sourcepath src src/com/sd/HelloWorld.java
 *  java -cp .:./classes com/sd/HelloWorld
 *
*************************************************************************/

package com.sd;
public class HelloWorld {
  public void hello() {
    System.out.println("Hello World!");
  }
  public void hello(String name) {
    System.out.printf("Hello %s!", name);
  }
  public static void main(String[] args) {
    System.out.println("Hello, World--");
  }
}