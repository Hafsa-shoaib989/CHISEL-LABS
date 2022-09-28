// package practice

// import chisel3._
// import chisel3.util._

// class Priority_arb extends Module {
//     val io = IO (new Bundle {
//         val in1 =  Flipped ( Decoupled ( UInt (4.W ) ) )
//         val in2 =  Flipped ( Decoupled ( UInt (4.W ) ) )
//         val in3 =  Flipped ( Decoupled ( UInt (4.W ) ) )
//         val out =  Decoupled ( UInt (4.W ) ) 
// })
// val arb_priority = Module (new Arbiter ( UInt () , 3) )

// arb_priority.io.in (0) <> io.in1
// arb_priority.io.in (1) <> io.in2
// arb_priority.io.in (2) <> io.in3

// io.out <> arb_priority.io.out
// }