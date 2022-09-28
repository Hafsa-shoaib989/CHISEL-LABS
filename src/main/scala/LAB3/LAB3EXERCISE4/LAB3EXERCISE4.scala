// package practice

// import chisel3._
// import chisel3.util._
// import chisel3.stage.ChiselStage

// class Valid_Interf extends Module {
//     val io = IO ( new Bundle {
//         val in = Flipped ( Valid ( UInt (8.W ) ) ) 
//         val out = Valid ( UInt (8.W ) ) 
// })
// io.out := RegNext ( io.in )
// }
