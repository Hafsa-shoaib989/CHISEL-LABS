// package practice

// import chisel3._
// import chisel3.util._

// class Adder ( Width : Int ) extends Module {
//     val io = IO (new Bundle {
//         val sum = Output ( UInt (Width.W) )
//         val in0 = Input ( UInt (Width.W) )
//         val in1 = Input ( UInt (Width.W) )
//     })
// io.sum := io.in0 + io.in1
// }