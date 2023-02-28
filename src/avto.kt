package avtom
open class avto() {
    var name1:String="Undefinded"
    var mosh:Double=0.0
    var stoimost:Int=0

    constructor(_name1:String):this()
    {
        name1=_name1
    }
    constructor(_name1:String,_mosh:Double):this(_name1)
    {
        mosh=_mosh
    }
    constructor(_name1:String,_mosh:Double,_stoimost:Int):this(_name1)
    {
        stoimost=_stoimost
    }

    open fun mosh1(mosh:String,name1:String){
        println("$name1 имеет мощность: $mosh")
    }

    open fun name1(name1:String){
        println("Марка машины $name1")
    }

    open fun Proverka(){
        if(stoimost<=500000)
        {
            println("Возможны повреждения машины или машина марки $name1 Б/у")
        }
        else
        {
            println("машина марки $name1 как новая")
        }
    }
}
