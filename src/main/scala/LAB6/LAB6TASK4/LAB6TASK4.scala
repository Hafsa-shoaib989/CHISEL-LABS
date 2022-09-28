// package practice

// import chisel3._
// import chisel3.util._

// class up_down_counter ( val max : Int = 10) extends Module {
//     val io = IO (new Bundle {
//         val out = Output ( UInt ( log2Ceil ( max ) . W ) )
//         val up_down = Input ( Bool () )
// })

// val counter = RegInit (0.U ( 4.W )) 
// val f = RegInit(0.U)

// dontTouch(counter)
// when (counter =/= max.asUInt && io.up_down === 1.B && f === 0.U) {
//       counter := counter + 1.U
// }.elsewhen(counter === max.asUInt) {
//       f := 1.U
//       counter := counter - 1.U
// }.elsewhen(counter === 0.U) {
//       f := 1.U
// }.elsewhen(f === 1.U) {
//       counter := counter - 1.U
    
// }
// io.out := counter
// }