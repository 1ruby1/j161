/* 
 * @author ruby
 * @since 2016_03_10
 * a simple turtle demo
 * taken from http://www.java-online.ch/lego/turtlegrafik.php
 */
package com.sd.turtle;new Tu20();

import ch.aplu.turtle.*;

class TurtleDemoMain {
  Turtle t1 = new Turtle();

  TurtleDemoMain() {
    t1.forward(100);
    t1.right(90);
    t1.forward(100);
    t1.right(90);
    t1.forward(100);
    t1.right(90);
    t1.forward(100);
    t1.right(90);
  }

  public static void main(String[] args) {
    new TurtleDemoMain();
  }
}