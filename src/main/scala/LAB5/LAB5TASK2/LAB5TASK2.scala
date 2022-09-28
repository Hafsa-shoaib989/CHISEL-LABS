// package practice

// import chisel3._
// import chisel3.util._

// class Packet [T<:Data] (tipe:T) extends Bundle{
//     val addr = UInt(10.W)
//     val data = tipe
// }
// class Router [T<:Data] (tipe:T) extends Module{
//     val io = IO(new Bundle{
//         val in = Input(new Packet(tipe))
//         val out = Output(new Packet(tipe))
// })  
// io.out <> io.in
// }





















