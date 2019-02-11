package com.mathodcoast.creational;

import com.mathodcoast.model.Computer;
import com.mathodcoast.model.Server;

public class ServerFactory implements AbstractComputerFactory {
    private String ram;
    private String hdd;
    private String cpu;

    public ServerFactory(String ram,String hdd,String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram,hdd,cpu);
    }

}
