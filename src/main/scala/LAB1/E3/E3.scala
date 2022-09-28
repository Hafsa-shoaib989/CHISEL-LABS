// package practice

// import chisel3._
// import chisel3.stage.ChiselStage

// class Counter1(size:Int , maxValue:Int) extends Module {
//     val io = IO (new Bundle {
//        val result = Output (Bool())
//     })
//     val maxValue1 = maxValue.asUInt
//     def genCounter (n:Int , max:Int) = {
//         val max1 = max.asUInt
//         val count = RegInit (0.U (n.W) )
//         when ( count === max1 ) {
//             count := 0.U
//         }.otherwise {
//             count := count + 1.U
//         }
//         count
//     }

// val counter1 = genCounter (size , maxValue )
// io.result := counter1(size -1)
// }

