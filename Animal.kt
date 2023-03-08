open class Animal(var name: String,open var weight: String){
    //1: thuoc tinh
    //2: phuong thuc


//     var name: String = ""
//         set(value){
//             if (value == "") throw Exception("Null")
//             field = value
//         }
//         get() { return field }
//
//     var weight: Double = weight
//        get() { return  weight }
//        set(value){
//            field = value
//        }


    open fun printInfo(){
        println("Name: $name, weight: $weight")
    }




}