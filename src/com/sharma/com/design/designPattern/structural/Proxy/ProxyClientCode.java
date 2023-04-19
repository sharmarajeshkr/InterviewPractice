package com.sharma.com.design.designPattern.structural.Proxy;

/*  The proxy design pattern : Is used when we want to provide controlled access of a functionality.
Example : we have a class that can run some command on the system.
         Now if we are using it, its fine but if we want to give this program to a client application,
         it can have severe issues because client program can issue command to delete some system files or
         change some settings that you don’t want.
    Basically : Allow only authenticate user (Admin,Non-Admin)to execute critical commands.

      */
public class ProxyClientCode {
    public static void main(String[] args) {
        CommandExecutor commandExecutor = new CommandExecutorProxy("abc1","pwd");
        try {
            commandExecutor.runCommand("ls -ltr");
            commandExecutor.runCommand(" rm -rf ./tmp/abc.pdf");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
