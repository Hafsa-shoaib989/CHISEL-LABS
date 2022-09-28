// package practice

// import chisel3._
// import chisel3.util._
// import chisel3.util.experimental.loadMemoryFromFile
// import scala.io.Source

// trait Config{
//     val WLEN = 32
//     val INST_MEM_LEN = 32
// }
// class InstMemIO extends Bundle with Config {
//     val addr = Input ( UInt ( WLEN.W ) )
//     val inst = Output ( UInt ( WLEN.W ) )
// }
// class InstMem ( initFile : String ) extends Module with Config {
//       val io = IO (new InstMemIO )

// val imem = Mem ( INST_MEM_LEN , UInt ( WLEN.W ) )

// loadMemoryFromFile ( imem , initFile )
// io.inst := imem ( io.addr / 4.U )
// }