trait Formula

case class Coord(row: Int, column: Int) extends Formula {
  override def toString = ('A' + column).toChar.toString + row
}

case class Range(c1: Coord, c2: Coord) extends Formula {
  override def toString = c1.toString + ":" + c2.toString
}

case class Number(value: Double) extends Formula {
  override def toString = value.toString
}

case class Textual(value: String) extends Formula {
  override def toString = value.toString
}

case class Application(function: String, arguments: List[Formula]) extends Formula {
  override def toString = arguments.mkString("(", ",", ")")
}

object Empty extends Textual("")