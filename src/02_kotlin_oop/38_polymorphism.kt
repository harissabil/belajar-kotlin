// kemampuan sebuah objek berubah bentuk menjadi bentuk lain
fun main() {
    var employee: Employee = Employee("Haris")
    employee.sayHello("Fulan")

    employee = Manager("Haris")
    employee.sayHello("Fulan")

    employee = VicePresident("Haris")
    employee.sayHello("Fulan")
}