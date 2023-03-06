class Animal constructor(name: String,weight: Double){
    //1: thuoc tinh
    //2: phuong thuc


     var name: String = ""
         set(value){
             if (value == "") throw Exception("Null")
             field = value
         }
         get() { return field }

     var weight: Double = weight
        get() { return  weight }
        set(value){
            field = value
        }


    fun printInfo(){
        println("Name: $name, weight: $weight")
    }




}