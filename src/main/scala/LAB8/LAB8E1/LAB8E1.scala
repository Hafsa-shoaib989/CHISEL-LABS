// package practice

// import chisel3._
// import chisel3.util._

// class MaskedReadWriteSmem extends Module {
//     val width : Int = 32
//     val io = IO (new Bundle {
//         val enable = Input ( Bool () )
//         val write = Input ( Bool () )
//         val addr = Input ( UInt (4.W ) )
//         val mask = Input ( Vec (4 , Bool () ) )
//         val dataIn = Input ( Vec (4 , UInt ( width.W ) ) )
//         val dataOut = Output ( Vec (4 , UInt ( width.W ) ) )
// })

// val mem = SyncReadMem (1024 , Vec (4 , UInt ( width.W ) ) )
// val data = Wire( Vec (4 , UInt ( width.W ) ) )
// data(0) := 0.U(width.W)
// data(1) := 0.U(width.W)
// data(2) := 0.U(width.W)
// data(3) := 0.U(width.W)

// when ( io.write === 1.B) {
//     when (io.mask(0) ) {
//         data(0) := io.dataIn(0)
//     }.otherwise {
//         data(0) := 0.U(width.W)
//     }
//     when (io.mask(1) ) {
//         data(1) := io.dataIn(1)
//     }.otherwise {
//         data(1) := 0.U(width.W)
//     }
//     when (io.mask(2) ) {
//         data(2) := io.dataIn(2)
//     }.otherwise {
//         data(2) := 0.U(width.W)
//     }
//     when (io.mask(3)) {
//         data(3) := io.dataIn(3)
//     }.otherwise {
//         data(3) := 0.U(width.W)
//     }
// mem.write ( io.addr , data )
// }
// io.dataOut := mem.read ( io.addr , io.enable )
// }
