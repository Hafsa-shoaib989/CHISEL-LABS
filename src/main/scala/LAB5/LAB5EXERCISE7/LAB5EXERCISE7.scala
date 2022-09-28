// package practice

// import chisel3._
// import chisel3.util._

// class Operator [ T <: Data ]( n : Int , generic : T ) ( op : (T , T ) => T ) extends Module {
//     val io = IO (new Bundle {
//         val in = Input ( Vec (n , generic ) )
//         val out = Output ( generic )
// })
// io.out := io.in.reduce ( op  )
// }
