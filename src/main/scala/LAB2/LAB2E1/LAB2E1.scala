// package practice

// import chisel3._
// import chisel3.util._
// import chisel3.stage.ChiselStage

// class Mux_2to1_IO extends Bundle {
//     val in_A = Input (UInt (4.W ) )
//     val in_B = Input (UInt (4.W ) )
//     val select = Input ( Bool() )
//     val out = Output ( UInt(4.W) )
// }

// class Mux_2to1 extends Module {
//     val io = IO (new Mux_2to1_IO() )

// val a = Fill(4, io.select)
// val b = Fill(4, io.select)
// io.out := io.in_A & a | io.in_B & ~(b)
// }

