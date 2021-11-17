package org.biodatageeks.tbd

object LevelResolver {
  def levelForIndex(index: Int): Int = {
    val binaryRepresentation = index.toBinaryString
    for(i <- binaryRepresentation.indices.reverse) {
      if (binaryRepresentation(i) == '0') {
        return binaryRepresentation.length - (i+1)
      }
    }
    binaryRepresentation.length
  }
}
