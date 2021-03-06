package com.lemoulinstudio.gfa.core.cpu.instruction;

import com.lemoulinstudio.gfa.core.cpu.ArmReg;
import com.lemoulinstudio.gfa.core.memory.MemoryInterface;

public class ThumbStateUnknown extends ThumbStateInstruction {
  
  public ThumbStateUnknown(ArmReg[][] regs, MemoryInterface memory) {
    super(regs, memory);
  }

  public void execute() {
    System.out.println("ThumbState Unknown Instruction");
    throw new RuntimeException("ThumbState Unknown Instruction");
  }

  public String disassemble(int offset) {
    return "?????";
  }

}
