// package practice

// import chisel3._
// import chisel3.util._

// class IO_Interface [ T <: Data ] ( data_type : T ) extends Bundle {
//     val in1 = Input ( data_type . cloneType )
//     val in2 = Input ( data_type . cloneType )
//     val out = Output ( data_type . cloneType )
// }
// class Adder ( size : UInt ) extends Module {
//     val io = IO (new IO_Interface ( size ) )

// io.out := io.in1 + io.in2
// }