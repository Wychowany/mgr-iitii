package org.biodatageeks.tbd

import org.biodatageeks.sequila.rangejoins.methods.base.BaseNode

import java.util

class AugmentedNode[V](start: Int, end: Int, value: V) extends BaseNode[V] {

  var insideMaxEnd: Int = end

  var outsideMaxEnd : Int = 0

  override def getStart: Int = start

  override def getEnd: Int = end

  override def getValue: util.ArrayList[V] = new util.ArrayList[V](java.util.List.of[V](value))
}
