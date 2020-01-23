package Components

import Support.FontUtils._

case class Label (text: String, x:Int, y:Int, fontSize: Int) extends Box(Dimension(x,y,0,0)) {
    val dim = stringDimension(text, fontSize)
    dimension.width = dim._1
    dimension.height = dim._2
}
