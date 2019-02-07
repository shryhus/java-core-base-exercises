package com.mathodcoast.creational;

import com.mathodcoast.model.Computer;
import com.mathodcoast.model.PC;

public class PCFactory implements AbstractCopmputerFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String ram,String hdd,String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new PC(ram,hdd,cpu);
    }
}
