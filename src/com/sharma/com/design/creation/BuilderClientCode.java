package com.sharma.com.design.creation;

public class BuilderClientCode {
    public static void main(String[] args) {
        BuilderComputer builderComputer =
                new BuilderComputer
                        .BuilderComputerBuilder("500 GB", "2 GB")
                        .isGraphicsCardEnables(true)
                        .isBluetoothEnabled(false)
                        .build();

        System.out.println(builderComputer);

    }
}
