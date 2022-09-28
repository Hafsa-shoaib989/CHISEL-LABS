// package practice

// import chisel3._
// import chisel3.util._

// class counter_with_xor ( val max : Int = 1) extends Module {
//     val io = IO (new Bundle {
//         val out = Output ( UInt (4.W) ) 
// })
// val count = RegInit(2.U (4.W) )
// dontTouch(count)
// io.out := count
// when (count(3) ^ max.B) {
//     count := count + 1.U
// }.otherwise {
//     count := 0.U
// }}
