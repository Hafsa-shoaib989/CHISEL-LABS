// package practice

// import chisel3._ 
// import chisel3.util._
// import ALUOP._
// import chisel3.stage.ChiselStage 

// object ALUOP {
//     val ALU_ADD = 0.U(4.W)
//     val ALU_SUB = 1.U(4.W)
//     val ALU_AND = 2.U(4.W)
//     val ALU_OR  = 3.U(4.W)
//     val ALU_XOR = 4.U(4.W)
//     // val ALU_SLT = 5.U(4.W)
//     val ALU_SLTU = 5.U(4.W)
//     val ALU_COPY_A = 6.U(4.W)
//     val ALU_XXX = 7.U(4.W) 
// }
// trait Config{
//     val WLEN = 32
//     val ALUOP_SIG_LEN = 4
// }
// class ALUIO extends Bundle with Config {
//     val in_A = Input(UInt(WLEN.W))
//     val in_B = Input(UInt(WLEN.W))
//     val alu_Op = Input(UInt(ALUOP_SIG_LEN.W))
//     val out = Output(UInt(WLEN.W))
//     val sum = Output(UInt(WLEN.W))
// }
// class ALU extends Module with Config {
//     val io = IO(new ALUIO)

// val sum = io.in_A + Mux(io.alu_Op(0), io.in_B, -io.in_B)

// val cmp = Mux(io.in_A(WLEN-1) === io.in_B(WLEN-1), sum(WLEN-1), Mux(io.alu_Op(1), io.in_A(WLEN-1), io.in_B(WLEN-1)))
// val shamt = io.in_A(4,0).asUInt
// val shin = Mux(io.alu_Op(3), Reverse(io.in_A), io.in_A)

// val out = Mux(io.alu_Op === ALU_ADD, (io.in_A + io.in_B),
//           Mux(io.alu_Op === ALU_SUB, (io.in_A - io.in_B),
//           Mux(io.alu_Op === ALU_AND, (io.in_A & io.in_B),
//           Mux(io.alu_Op === ALU_OR, (io.in_A | io.in_B),
//           Mux(io.alu_Op === ALU_XOR, (io.in_A ^ io.in_B),
//         //   Mux(io.alu_Op === ALU_SLT, (io.in_A < io.in_B),
//           Mux(io.alu_Op === ALU_SLTU, (io.in_A < io.in_B),
//           Mux(io.alu_Op === ALU_COPY_A, io.in_A, 0.U
//              )))))))

// io.out := out
// io.sum := sum
// }
