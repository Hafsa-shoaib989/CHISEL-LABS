// package practice

// import chisel3 . _
// import chisel3.stage.ChiselStage

// class AdderWithOffset extends Module {
//     val io = IO (new Bundle {
//     val x = Input (SInt (4.W) )
//     val y = Input (UInt (4.W) )
//     val z = Output (UInt (4.W) )
//     })

// val y1 = (8.U).asSInt
// val in1 = io.x + y1
// io.z := in1.asUInt + io.y 
// }

