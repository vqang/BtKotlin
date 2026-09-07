fun main() {
    // Bài 1: In các số từ 1 đến 10
    println("BÀI 1")
    for (i in 1..10) {
        print("$i ")
    }
    println("\n")

    // Bài 2: Tính tổng 1 + 2 + ... + 100
    println("BÀI 2")
    var tong = 0
    for (i in 1..100) {
        tong += i
    }
    println("Tổng các số từ 1 đến 100 là: $tong\n")

    // Bài 3: In các số chẵn từ 1 đến 20
    println("BÀI 3")
    for (i in 2..20 step 2) {
        print("$i ")
    }
    println()
}