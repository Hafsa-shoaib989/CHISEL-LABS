// package practice

// import chisel3._
// import chisel3.util._

// class Pipe extends Module {
//     val io = IO ( new Bundle {
//         val in = Flipped ( Valid ( UInt (4.W ) ) ) 
//         val out = Valid ( UInt (4.W ) ) 
// })
// io.out := Pipe ( io.in , 5)
// }
