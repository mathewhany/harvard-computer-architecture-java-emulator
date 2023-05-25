package ca.memory;

public class InstructionMemory {
    static private Short[] memoryArray;

    public InstructionMemory(int size) {

        memoryArray = new Short[size];
    }

    public short read(int address) {

        return memoryArray[address];
    }

    public void write(int address, short value) {

        memoryArray[address] = value;
        System.out.println("Value" + value + "was written to" + "address" + address);
    }

    public void loadProgram(short[] instructions) {
        if (instructions.length > memoryArray.length) {
            System.out.println("Program too long");
            return;
        }
        clearInstructionMemory();
        for(int i = 0; i<instructions.length;i++){
            memoryArray[i] = instructions[i];
        }
    }
    public void clearInstructionMemory(){
        int size = memoryArray.length;
        memoryArray = new Short[size];
    }
    public void printDataMemory(){
        for(int i = 0; i<memoryArray.length;i++){
            System.out.println("Instruction memory address : " + i + " Value : " + read(i));
        }
    }
}
