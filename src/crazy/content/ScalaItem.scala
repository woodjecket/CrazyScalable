package crazy.content

import arc.graphics.Color
import mindustry.`type`.Item

class ScalaItem(){
}
object ScalaItem extends ContentList{
  val electronicIron: Item = new Item("iron",Color.valueOf("123456")){
    charge = 0.1f
  }
}
