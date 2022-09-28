// package practice

// import chisel3._
// import chisel3.util._
// import chisel3.stage.ChiselStage

// class LM_IO_Interface_decoder_with_valid extends Bundle {
//     val in = Input ( UInt (4.W ) )
//     val out = Valid ( Output ( UInt (4.W ) ) )
// }
// class decoder_with_valid extends Module {
//     val io = IO (new LM_IO_Interface_decoder_with_valid )

// io.out.valid := 1.B
// when ( io.in === "b00".U ) {
//     io.out.bits := "b0001". U
// }.elsewhen ( io.in === "b01". U ) {
//     io.out.bits := "b0010". U
// }.elsewhen ( io.in === "b10". U ) {
//     io.out.bits := "b0100". U
// }.otherwise {
//     io.out.bits := "b1000". U}
// }
