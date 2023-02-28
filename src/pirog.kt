package pirogi
open class pirog()
     {
        var name:String="Undefinded"
        var testo:String="Undefinded"
        var krem:String="Undefinded"
        var ves:Double=0.0
        var kal:Double=0.0
        var cena:Int=0
         constructor(_name: String):this()
         {
             name=_name
         }
         constructor(_name: String,_testo:String):this(_name)
         {
             testo=_testo
         }
         constructor(_name: String,_testo:String,_krem:String):this(_name)
         {
             krem=_krem
         }
         constructor(_name: String,_testo:String,_krem:String,_ves:Double):this(_name)
         {
             ves=_ves
         }
         constructor(_name: String,_testo:String,_krem:String,_ves:Double,_kal:Double):this(_name)
         {
             kal=_kal
         }
         constructor(_name: String,_testo:String,_krem:String,_ves:Double,_kal:Double,_cena:Int):this(_name)
         {
             cena=_cena
         }
        open fun testo1(testo:String,name:String,ves:String){
            println("$name состоит из $testo и весит $ves")
        }

        open fun name(name:String,kal:Double){
            println("$name содержит $kal")
        }

        open fun price(cena:Int){
            println("Продаётся по цене: $cena")
            if(cena<=0)
            {
                println("Продукт продан или в дефеците")
            }
        }
    }
