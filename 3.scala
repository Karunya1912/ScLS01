object fun{
    def volume(r:Int):Double={
        val pi=3.14
        var vol=(4.0/3.0)*pi*r*r*r
        return vol
    }
    
    def main(args:Array[String]):Unit={
        println(volume(5))

    }
}