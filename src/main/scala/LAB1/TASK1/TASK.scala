package practice

import chisel3._

class Casting extends Module{
    val io = IO(new Bundle{
       val c = Output(Bool())
})
// val a = 1.S
// val b = a.asUInt

val a = 1.U
val b = a.asSInt

// val a = 1
// val b = a.asInstanceOf[UInt]


io.c := b.asBool
}
