public class Main {
    public static void main(String[] args) {
        // buat object CPU
        CPU myKomputer = new CPU(25000000, "ROG Zephyrus G14");

        CPU.Processor i7 = myKomputer.new Processor(8, "AMD", "R7");

        CPU.RAM rs32GB = myKomputer.new RAM(16, "ASUS");

        myKomputer.getCPUInfo();
        i7.getProcessorInfo();
        rs32GB.getInfoRAM();

        // bikin object harddisk, vga, motherboard, powersupply
        CPU.Harddisk myHarddisk = myKomputer.new Harddisk(1000, "SSD");
        CPU.VGACard myVGACard = myKomputer.new VGACard("NVIDIA RTX 3060", 8);
        CPU.Motherboard myMotherboard = myKomputer.new Motherboard("ASUS ROG  Strix b450-f", "AMD");
        CPU.PowerSupply myPowerSupply = myKomputer.new PowerSupply(850, "Corsair");

        //Memanggil metode untuk masing-masing komponen
        myHarddisk.getHarddiskInfo();
        myVGACard.getVGACardInfo();
        myMotherboard.getMotherboardInfo();
        myPowerSupply.getPowerSupplyInfo();



    }
}