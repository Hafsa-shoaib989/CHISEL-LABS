// package practice

// import chisel3._
// import chisel3.util._

// class shift_reg_with_parallel_load (val len : Int =1) extends Module {
//     val io = IO (new Bundle {
//         val load_in = Vec ( len , Input ( Bool () ) )
//         val in = Input ( Bool () )
//         val load = Input ( Bool () )
//         val out = Vec ( len , Output ( Bool () ) )
// })

// io.out(0) := Mux(io.load, io.load_in(0), io.in)
// io.out(1) := Mux(io.load, io.load_in(1), io.out(0))
// io.out(2) := Mux(io.load, io.load_in(2), io.out(1))
// }