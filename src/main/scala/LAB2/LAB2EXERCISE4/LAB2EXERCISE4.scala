// package practice

// import chisel3._
// import chisel3.stage.ChiselStage

// class LM_IO_Interface extends Bundle {
//     val in = Input ( UInt (8.W ) )
//     val s0 = Input ( Bool() )
//     val s1 = Input ( Bool() )
//     val s2 = Input ( Bool() )
//     val out = Output ( Bool() ) 
// }

// class Mux_8to1 extends Module {
//     val io = IO (new LM_IO_Interface )

// val Mux4_to_1_a = Mux( io.s1 , Mux( io.s0 , io.in(3) , io.in(2) ) ,Mux( io.s0 , io.in(1) , io.in(0) ) )
// val Mux4_to_1_b = Mux( io.s1 , Mux( io.s0 , io.in(7) , io . in(6) ) ,Mux( io . s0 , io.in(5) , io.in(4) ) )
// val Mux2_to_1 = Mux( io.s2 , Mux4_to_1_b , Mux4_to_1_a )

// io.out := Mux2_to_1
// }