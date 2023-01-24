package crazy

import arc.util.Log
import mindustry.Vars
import mindustry.mod._

import scala.collection.IterableOnce.iterableOnceExtensionMethods
import scala.collection.mutable

class CrazyScalaMod() extends Mod(){
  Log.info("Loaded ExampleScalaMod constructor.","")
  override def loadContent(): Unit = {
    Log.info("Loading some example content.","")
    Log.info("Sort as id","")
    Vars.content.items().toArray.toList.map(i => (i, i.id)).sortWith((l1,_)=>l1._1.compareTo(l1._1)<0).foreach (i => Log.info("@ is id @", i._2, i._1))
    Log.info("Sort as name", "")
    Vars.content.items().toArray.toList.map(i => (i, i.id)).sortWith ((_, l1) => l1._1.compareTo(l1._1) < 0).foreach (i => Log.info("@ is id @", i._2, i._1))
  }
}