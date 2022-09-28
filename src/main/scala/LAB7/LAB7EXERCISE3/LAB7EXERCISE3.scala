// (skip this task)
// package practice

// import chisel3._
// import chisel3.util._

// class UART_Tx ( c : UART_Params ) extends Module {
//     val io = IO (new Bundle {
//         val en = Input ( Bool () )
//         val in = Flipped ( Decoupled ( UInt (( c.dataBits ).W ) ) )
//         val out = Output ( Bool () )
//         val div = Input ( UInt (( c.divisorBits ).W ) )
//         val nstop = Input ( UInt (( c.stopBits ).W ) )
// })
// // pulses generated at baud rate using prescaler
// val prescaler = RegInit (0.U (( c.divisorBits ).W ) )
// val pulse = ( prescaler === 0.U )
// private val n = c.dataBits + 1
// val counter = RegInit (0.U (( log2Floor ( n + c.stopBits ) + 1).W ) )
// val shifter = Reg ( UInt ( n.W ) )
// val out = RegInit ( true.B )
// io.out := out

// val busy = ( counter =/= 0.U )
// val state1 = io.en && ! busy
// val state2 = busy
// io.in.ready := state1

// when ( state1 ) {
//     shifter := Cat ( io.in.bits , false.B )
//     counter := Mux1H (
// (0 until c.stopBits ).map ( i = > ( io.nstop === i.U ) -> ( n + i + 2).U )
// )
// }
// when ( state2 ) {
//     prescaler := Mux( pulse , ( io.div - 1.U ) , prescaler - 1.U )
// when ( pulse ) {
//     counter := counter - (1.U )
//     shifter := Cat ( true.B , shifter >> 1)
//     out := shifter (0)
// }
// }
// }