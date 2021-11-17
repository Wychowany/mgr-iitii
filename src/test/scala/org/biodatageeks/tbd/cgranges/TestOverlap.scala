package org.biodatageeks.tbd.cgranges

import org.biodatageeks.sequila.rangejoins.methods.base.BaseNode
import org.biodatageeks.tbd.ImplicitIntervalTreeWithInterpolationIndex
import org.scalatest.FunSpec

import scala.collection.mutable.ArrayBuffer

class TestOverlap extends FunSpec {
  it("should work on other examples") {
    val tree = new ImplicitIntervalTreeWithInterpolationIndex[Int]
    val dummyValue = -1
    tree.put(1, 5, dummyValue)
    tree.put(6, 10, dummyValue)
    tree.put(11, 15, dummyValue)
    tree.put(16, 20, dummyValue)
    tree.put(21, 25, dummyValue)
    tree.put(26, 30, dummyValue)
    tree.put(31, 35, dummyValue)
    tree.put(36, 40, dummyValue)
    tree.put(41, 45, dummyValue)
    tree.put(46, 50, dummyValue)
    tree.put(51, 55, dummyValue)
    tree.put(55, 60, dummyValue)
    tree.put(61, 65, dummyValue)
    tree.put(66, 70, dummyValue)
    tree.put(71, 75, dummyValue)
    tree.put(76, 80, dummyValue)
    tree.put(81, 85, dummyValue)
    tree.put(86, 90, dummyValue)
    tree.put(91, 95, dummyValue)
    tree.put(96, 100, dummyValue)
    tree.postConstruct
    val i = tree.overlappers(5, 17) // 3
    val j = tree.overlappers(32, 49) // 4
    val k = tree.overlappers(60, 62) // 1
    val l = tree.overlappers(71, 90) // 4
    val m = tree.overlappers(79, 95) // 4
    val resultList = new ArrayBuffer[BaseNode[Int]]()
    i.forEachRemaining(x => resultList.append(x))
    j.forEachRemaining(x => resultList.append(x))
    k.forEachRemaining(x => resultList.append(x))
    l.forEachRemaining(x => resultList.append(x))
    m.forEachRemaining(x => resultList.append(x))
    assert(resultList.size == 16)
  }
}
