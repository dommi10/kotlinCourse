package TravailPratique

open class Personne(){
    var nom:String?=null
    var age:Int=0
    constructor(nom:String,age:Int):this(){
        this.nom=nom
        this.age=age
    }
    init {

    }
}
class Agent():Personne(){
    var SalaireBase:Float?=0f
    var Grade:String?=null
    var Affectation:String?=null
    constructor(SalaireBase:Float,Grade:String,Affectation:String):this(){
        this.SalaireBase=SalaireBase
        this.Grade=Grade
        this.Affectation=Affectation
    }
}
class Pere():Personne(){
    var ville:String?=null
    constructor(ville:String):this(){
        this.ville=ville
    }
}
fun main(args:Array<String>){
    val personne = Personne("dom's",21)
    val agent = Agent(10f,"Secretaire","Bureau")
    val pere = Pere("Goma")
    print("La personne ${agent.SalaireBase}")
}