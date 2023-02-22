fun main(){
    friends("Momy","Emmie","Stephanie","Blessing")
    cities()
    addition()
    var d = (content("Joy","Pame","Moly"))
    println(d)

}
fun friends(name1:String,name2:String,name3:String,name4:String) {
    var f = arrayOf(name1, name2, name3, name4)
    println(f.contentToString())
}
fun cities() {
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakasta")
    for (city in cities) {
        println(city.capitalize())

    }
//Create one function that given the below array:
//
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order
}fun addition() {
    var numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
    var sum = numbers[1] + numbers[4]
    println(sum)
    println(numbers.indexOf(158))
    numbers.sort()
    println(numbers.contentToString())

}
fun content(name6:String,name7:String,name8:String): String{
    var names= arrayOf(name6,name7,name8)
    return names.contentToString()
}







