package practice.variableAndType

fun main() {
    // 基本的な型
    var dnum: Double = 1234.56
    var fnum: Float = 12345.6f //数値リテラル
    var lnum: Long = 12345L //数値リテラル
    var inum: Int = 123456
    var snum: Short = 32767
    var b: Byte = 0b1010
    var s: String = "Hello" //文字列は"
    var c: Char = 'A' //文字は'
    var uint: UInt = 1U //数値リテラル
    var ubyte: UByte = 255U //数値リテラル
    var ushort: UShort = 12U //数値リテラル
    var ulong: ULong  = 10UL //数値リテラル

    println(dnum)
    println(fnum)
    println(lnum)
    println(inum)
    println(snum)
    println(b)
    println(s)
    println(c)
    println(uint)
    println(ubyte)
    println(ushort)
    println(ulong)

    print("指数表現")
    dnum = 4567e10
    println(dnum)

    println("真偽値")
    val x: Boolean = true;
    val y: Boolean = false;
    println(x || y)
    println(x && y)
    println(!x)
}