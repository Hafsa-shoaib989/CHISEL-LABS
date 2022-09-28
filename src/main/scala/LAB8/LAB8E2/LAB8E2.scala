// package practice

// import chisel3._
// import chisel3.util._

// class Forwarding extends Module {
//     val io = IO (new Bundle {
//         val rdAddr = Input ( UInt (4.W ) )
//         val wrAddr = Input ( UInt (4.W ) )
//         val wrData = Input ( Vec (2 , UInt (4.W ) ) )
//         val enable = Input ( Bool () )
//         val wr_en = Input ( Bool () )
//         val mask = Input ( Vec (2 , Bool () ) )
//         val out = Output ( Vec (2 , UInt (4.W ) ) )
// })
// val memory = SyncReadMem (1024 ,  Vec (2 , UInt (4.W ) ) )
// val wrDataReg = RegNext ( io.wrData )
// val doForwardReg = RegNext ( io.wrAddr === io.rdAddr && io.wr_en )
// val memData = memory.read ( io.rdAddr , io.enable )

// when ( io.wr_en ) {
//     memory.write ( io.wrAddr , io.wrData , io.mask )
// }
// io.out(0) := Mux ( doForwardReg , wrDataReg(0) , memData(0) )
// io.out(1) := Mux ( doForwardReg , wrDataReg(1) , memData(1) )
// }