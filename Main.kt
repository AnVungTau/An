import sun.plugin2.message.Message
import kotlin.random.Random

fun main(args: Array<String>) {

    //1 khai bao bien
    //mutable, immutable

    //tu khoa khai bao bien la var

    //var name : String = "camel"
    //var so = 1.0
    //name = "camile"
    //println(name + " " + so.toInt())


    //2 kieu du lieu
    //Các kiểu dữ liệu cơ bản : Int , Long , Float , String , Hex, Binary , Char


//
//    var text = "chuoi"
//
//    var age : Int  = 10
//    var weight : Float = 1.0f
//    var db : Double = 1.0
//    println(weight)

//    var queue = """
//        a
//        b
//        c
//    """.trimIndent()
//    print(queue)

//    var isMale : Boolean = true
//    println(isMale)
//    for (item in 1..10){
//        println(item)
//    }
//    3: toan tu
//    var num1 = 1
//    var num2 = 2
//
//    var result = num1 + num2
//    sum += num1
//    println(result)
//
//    var num1 = 1
//    ++num1
//    num1++
//    println(num1)
//    var num1 = 5
//
//    println(num1)
//
//    println("num1: $num1")
//    println("num2: $num2")
//
//    var num1 = 5
//    var num2 = 7

//    var s = ++num1 - --num2 + num1++ - num2++ + num2--
//
//    println(num1)
//    println(num2)
//    println(s)
//    var a = 2
//    var b = 2




//    //4. if .. else
//    if (a > b) {
//        println("1")
//    } else if (a < b) {
//        println("-1")
//    } else if (a == b) {
//        println("0")
//    }
//
//    // tinh BMI : weight / height * height
//
//    var weight : Float = 80.0f
//    var height : Float = 1.8f
//    var message = ""
//    var bmi = weight / (height * height)
//


//
//    if (bmi < 18.5f){
//        message="Gầy"
//    } else if (bmi >= 18.5f && bmi <= 24.9f){
//        message="bình thường"
//    } else if (bmi >= 25.0f && bmi <= 29.9f){
//        message="hơi béo"
//    } else if (bmi >= 30.0f && bmi <= 34.9f){
//        message="béo phì cấp độ 1"
//    } else if (bmi >= 35.0f && bmi <= 39.9f){
//        message="béo phì cấp độ 2"
//    } else {
//        message="béo phì cấp độ 3"
//    }
//    println("chỉ số cơ thể: $bmi" )
//    println("tình trạng sức khoẻ: $message" )
//
//    var isMale = true
//    var message = if (isMale) "Male" else "Female"
//
      //Toán tử && và ||
//
//    var acc = "a"
//    var pass = "a"
        // Nếu như tài khoản và mật khẩu có giá trị thì mới cho đăng nhập
//
//    if (acc.length > 0 && pass.length > 0 ){
//        println("Xu ly dang nhap")
//    } else {
//        println("Chua truyen du thong tin de xu ly")
//    }
//
//    if (acc.length == 0 || pass.length == 0 ){
//        println("Chua truyen du thong tin de xu ly")
//    } else {
//        println("Xu ly dang nhap")
//    }


    // 5: câu điều kiện when .. else
//
//    var month = 15
//
//    var message = when (month) {
//        in 1..3 -> "Quý 1"
//        in 4..6 -> "Quý 2"
//        in 7..9 -> "Quý 3"
//        10,11,12 -> "Quý 4"
//        else -> "Khong thuoc quy nao"
//    }
//    println(message)


    //6 Mảng
//    var arrNumber = mutableListOf<Int>(1, 3, 5, 7, 9)
//

//    // them du lieu vao mang
//    arrNumber.add(11)
//
//    //In gia tri phan tu dau tien
//    println("gia tri phan tu dau tien: ${arrNumber[0]}")
//
//    //In gia tri phan tu cuoi cung
//    println("gia tri phan tu cuoi cung: ${arrNumber[arrNumber.size - 1]}")
//
//    Xoa phan tu trong mang
//    arrNumber.removeAt(0)
//    println(arrNumber)
//
//    Sua phan tu trong mang
//    arrNumber[0] = 11
//    println(arrNumber)

    //for 1 .. 10
//    for ( item in 1 ..  10)
//    {
//        print(item)
//    }
    //12345678910


    //until: be hon chu khong bang
//    for ( item in 1 until   10)
//    {
//        print(item)
//    }
    //123456789
    //

    //downTo: dem nguoc
//    for (item in 10 downTo 1){
//        print(item)
//    }
    //10987654321

//    for (item in 1..100){
//        println(item)
//        if (item == 20){
//
//            break
//        }
//    }

//    var array = arrayListOf(0,1,2)
//    for ((index, value) in array.withIndex()) {
//
//    }


//    50
//    40
//    30
//    20
//    10
//    100
//    80
//    60

    //50


    var arr1 = mutableListOf<Int>(5,4,3,2,1)
    var arr2 = mutableListOf<Int>(10,20,30,40,50)

//    var s  = 1
//    for (elementArr2 in arr2){
//
//        for (elementArr1 in arr1){
//            s = elementArr1 * elementArr2
//            println(s)
//        }

//        var s  = 1
//    loop1@ for (elementArr2 in arr2){
//        println("lap 1: $elementArr2")
//        for (elementArr1 in arr1){
//
//            println("lap 2: $elementArr1")
//            break@loop1
//        }
//    }

//    for ((index,item) in arr1.withIndex()){
//        if (item == 1){
//            continue
//        }
//        println(item)
//    }

    //7: while
//    var count = Random.nextInt(10)
//
//
//    while (count % 2 == 0){
//        println(count)
//        count = Random.nextInt(100)
//    }
//

    //8: phuong thuc

    // Unit == Void
//    showMessage("hello")


    //9: object
    //phuong thuc khoi tao

    // constructor chay truoc init(init duoc kotlin cung cap)
//    var cat = Animal("Milo","1.2 Kg")
//
//    var cat2 = Animal("Milo2", "5.0 Kg")
//
//    cat.printInfo()
//    cat2.printInfo()

//    println("Name: ${cat.name}, weight: ${cat.weight}")
//    println("Name: ${cat2.name}, weight: ${cat2.weight}")

    //Tinh dong goi: the hien viec cac thong tin cua doi tuong
    // phuong thuc getter và setter de truy cap
//    var cat = Animal("milo",1.2)
//    cat.name = "a"
//
//
//        print((cat.name))
////    cat.printInfo()

    //tinh ke thua: nang cap cac chuc nang moi
//    var cat1 = cat("kitty", "3Kg", "White" )
//    cat1.printInfo()




    //tinh da hinh
//    var cat1 = cat("kitty", "3Kg", "White" )
//    cat1.printInfo()




    //tinh truu tuong


}
//fun showMessage(message: String):Unit{
//    println(message)
//
//}