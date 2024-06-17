object  fun{
    def cost():Double={
        var discountedprice=24.95*0.6
        println("Discounted price is: "+discountedprice)

        var shippingcost=3+(0.75*10)
        println("Total shipping cost is: "+shippingcost)

        var  totalcost = (discountedprice*60)+shippingcost
        println("Total wholesale cost is:"+totalcost) 
        totalcost
        
}

    def main(args:Array[String]):Unit={
     cost();
    }

}