// package practice

// import chisel3._
// import chisel3.util._

// class Forwarding extends Module {
//     val io = IO (new Bundle {
//         val rdAddr = Input ( UInt (4.W ) )
//         val wrAddr = Input ( UInt (4.W ) )
//         val wrData = Input ( UInt (4.W ) )
//         val wr_en = Input ( Bool () )
//         val out = Output ( UInt (4.W ) )
// })
// val memory = SyncReadMem (1024 , UInt (4.W ) )
// val wrDataReg = RegNext ( io.wrData )
// val doForwardReg = RegNext ( io.wrAddr === io.rdAddr && io.wr_en )
// val memData = memory.read ( io.rdAddr )

// when ( io.wr_en ) {
//     memory.write ( io.wrAddr , io.wrData )
// }
// io.out := Mux ( doForwardReg , wrDataReg , memData )
// }
