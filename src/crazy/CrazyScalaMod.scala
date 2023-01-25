package crazy

import arc.util.Log
import mindustry.Vars
import mindustry.mod._
import mindustry.`type`._

class CrazyScalaMod() extends Mod(){
  Log.info("Loaded ExampleScalaMod constructor.","")
  override def loadContent(): Unit = {
    Log.info("Loading some example content.","")
    val itemList:List[(Item,Short)] = Vars.content.items().toArray.toList.map(i => (i, i.id))
    val sortedList = itemList.sortWith((l1,_)=>l1._2.compareTo(l1._2)>0)
    sortedList.foreach[Unit](i => Log.info("@ is id @", i._1.asInstanceOf[AnyRef], i._2.asInstanceOf[AnyRef]))
    Log.info("RUN SCALA ON ANDROID!!!!!!!!!!!!!!!!","")
  }
}