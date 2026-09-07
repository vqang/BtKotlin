import java.util.Scanner
import kotlin.math.max

fun main() {
    val scanner = Scanner(System.`in`)

    // 1. Nhập thông tin sinh viên và điểm
    print("Nhập tên sinh viên: ")
    val ten = scanner.nextLine()

    print("Nhập điểm Math: ")
    val math = scanner.nextDouble()

    print("Nhập điểm Programming: ")
    val programming = scanner.nextDouble()

    print("Nhập điểm Database: ")
    val database = scanner.nextDouble()

    // 2. Tính toán các yêu cầu
    val tongDiem = math + programming + database
    val diemTB = tongDiem / 3
    val diemCaoNhat = max(math, max(programming, database))
    val datYeuCau = if (diemTB >= 5.0) "Đạt" else "Không đạt"

    // 3. In ra màn hình kết quả
    println("\n--- THÔNG TIN SINH VIÊN ---")
    println("Tên sinh viên: $ten")
    println("Tổng điểm: $tongDiem")
    println("Điểm trung bình: ${String.format("%.2f", diemTB)}")
    println("Điểm cao nhất: $diemCaoNhat")
    println("Sinh viên có đạt không?: $datYeuCau (GPA >= 5.0)")
}