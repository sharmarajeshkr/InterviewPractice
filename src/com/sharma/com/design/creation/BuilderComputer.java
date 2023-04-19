package com.sharma.com.design.creation;

public class BuilderComputer {

    //required parameters
    private String HDD;
    private String RAM;

    //optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    private BuilderComputer(BuilderComputerBuilder builderComputerBuilder) {
        this.HDD = builderComputerBuilder.HDD;
        this.RAM = builderComputerBuilder.RAM;
        this.isGraphicsCardEnabled = builderComputerBuilder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builderComputerBuilder.isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "BuilderComputer{" +
                "HDD='" + HDD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }

    public static class BuilderComputerBuilder {

        private String HDD;
        private String RAM;

        //optional parameters
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public BuilderComputerBuilder(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public BuilderComputerBuilder isGraphicsCardEnables(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public BuilderComputerBuilder isBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }


        public BuilderComputer build() {
            return new BuilderComputer(this);
        }
    }

}
