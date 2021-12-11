package com.knoldus.Queue

import com.knoldus.Trait.Queue

class DoubleQueue extends Queue {

  def enqueue(list: List[Int], input: Int): List[Int] = {
    val updated = list :+ input
    updated.map(_*2)



  }

}
