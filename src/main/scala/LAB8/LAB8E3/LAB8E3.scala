// package practice

// import chisel3._
// import chisel3.util._

// class Instruction extends Module {
//     val io = IO (new Bundle {
//         val write = Input ( Bool () )
//         val instWr = Input(UInt (4.W) ) 
//         val addr = Input ( UInt (4.W ) )
//         val instRead = Output(UInt (4.W) )
// })
// val mem = Mem (32, UInt (4.W))

// when (io.write){
//     mem.write( io.addr , io.instWr )
// }
// io.instRead := mem.read( io.addr )
// }

