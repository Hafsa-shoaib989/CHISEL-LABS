// package practice

// import chisel3._ 
// import chisel3.util._

// class timer () extends Module {
//     val io = IO (new Bundle {
//         val out = Output ( Bool() )
// })
// val timer_count = RegInit (0.U (4.W ) )
// val value = RegInit (4.U (4.W ) )

// val f = RegInit(0.U)
// io.out := 0.B
// dontTouch(timer_count)

// when (timer_count =/= value && f === 0.U) {
//       timer_count := timer_count + 1.U
// }.elsewhen(timer_count === value) {
//       f := 1.U
//       timer_count := timer_count - 1.U
// }.elsewhen(timer_count === 0.U) {
//       f := 0.U
//       io.out := 1.B
// }.elsewhen(f === 1.U) {
//       timer_count := timer_count - 1.U
//       io.out := 0.B
// }}
