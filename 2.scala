object tem{
    def tem(C:Double):Double={
         var F =C*1.8000+32.00;
         return F;
       
    }
    
    def main(args:Array[String]):Unit={
        println(tem(35));

    }
}