// package practice

// import chisel3._
// import chisel3.util._

// class Round_arb extends Module {
//     val io = IO (new Bundle {
//         val in1 =  Flipped ( Decoupled ( UInt (4.W ) ) )
//         val in2 =  Flipped ( Decoupled ( UInt (4.W ) ) )
//         val in3 =  Flipped ( Decoupled ( UInt (4.W ) ) )
//         val out =  Decoupled ( UInt (4.W ) ) 
// })

// val arb_noPriority = Module (new RRArbiter ( UInt () , 3) )

// arb_noPriority.io.in (0) <> io.in1
// arb_noPriority.io.in (1) <> io.in2
// arb_noPriority.io.in (2) <> io.in3

// io.out <> arb_noPriority.io.out
// }