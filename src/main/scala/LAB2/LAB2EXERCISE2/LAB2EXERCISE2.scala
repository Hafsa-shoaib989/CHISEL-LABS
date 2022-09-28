// package practice

// import chisel3._
// import chisel3.stage.ChiselStage

// class Mux_2to1_IO extends Bundle {
//     val in_A = Input ( UInt (4.W ) )
//     val in_B = Input ( UInt (4.W ) )
//     val select = Input ( Bool () )
//     val out = Output ( UInt () )
// }

// class Mux_2to1 extends Module {
//     val io = IO (new Mux_2to1_IO )

// io.out := Mux ( io.select , io.in_A , io.in_B )
// }