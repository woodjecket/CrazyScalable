package crazy

import arc.util.{Log, Time}
import arc.{Core, Events}
import crazy.content._
import crazy.util.FuncImplicitConverter._
import mindustry.Vars
import mindustry.`type`.Item
import mindustry.game.EventType.ClientLoadEvent
import mindustry.mod.Mod
import mindustry.ui.dialogs.BaseDialog


class CrazyScalaMod() extends Mod(){
  Log.info("Loaded ExampleScalaMod constructor.","")
  private val itemList: List[(Item, Short)] = Vars.content.items().toArray.toList.map(i => (i, i.id))
  private val sortedList = itemList.sortWith((l1, _) => l1._2.compareTo(l1._2) > 0)
  sortedList.foreach[Unit](i => Log.info("@ is id @", i._1.asInstanceOf[AnyRef], i._2.asInstanceOf[AnyRef]))
  if (Vars.android) Log.info("RUN SCALA ON ANDROID!!!!!!!!!!!!!!!!", "")
  Events.on[ClientLoadEvent](classOf[ClientLoadEvent], (_: ClientLoadEvent) => {
    Time.run(10f, () => {
      config(new BaseDialog("frog"))(dialog => {
        config(dialog.cont)(c => {
          c.add("behold").row()
          c.image(Core.atlas.find(Vars.content.transformName("frog"))).pad(20f).row()
          c.button("I see.", lamdba2Runnable(() => {
            dialog.hide()
          })).size(100f, 50f)
          dialog.show()
        })
      })
    })
  })

  override def loadContent(): Unit = {
    Log.info("Loading some example content.","")
    ScalaItem.loadContent()

  }
}