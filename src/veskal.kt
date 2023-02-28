package veskal
import pirogi.*
open class veskal(_name:String):
pirog(_name)
{
var _ves=(ves/1000).toString()+" г"
    var _kal="$kal%"
    fun tobuy(){
        var temp=(ves/100).toInt()
        temp=temp*cena
        println("$_ves за пирожное с кремом $krem стоит $temp")
    }
    fun price(){
        var temp=(ves/100).toInt()
        temp=temp/3*cena
        println("За пирожное с кремом $krem весом $ves можно получить прибыль $temp")
    }
    fun weight(){
        println("За пирожное с указанным кремом и тестом весом $ves количество калорий:$kal")
    }
}