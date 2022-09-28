// package practice

// import chisel3._
// import chisel3.stage.ChiselStage

// class counter ( counterBits : SInt ) extends Module {
//     val io = IO (new Bundle {
//        val result = Output ( Bool () )
// })
// val counterBits1 = counterBits.asUInt
// val max = (1.U << counterBits1) - 1.U
// val count = RegInit (0.U (4.W ) )

// when ( count === max ) {
//     count := 0.U
// }.otherwise {
//     count := count + 1.U
// }
// io.result := count
// }

