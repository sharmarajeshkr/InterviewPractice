package com.sharma.designPattern.structural.Proxy;

import java.io.IOException;

/*  The proxy design pattern is used when we want to provide controlled access of a functionality.
Example : we have a class that can run some command on the system.
         Now if we are using it, its fine but if we want to give this program to a client application,
         it can have severe issues because client program can issue command to delete some system files or
         change some settings that you don’t want.
    Basically : Allow only authenticate user (Admin,Non-Admin)to execute critical commands.

      */

public class ProxyDesignPattern {
    public static void main(String[] args){
        CommandExecutor commandExecutor = new CommandExecutorProxy("abc1","pwd");
        try {
            commandExecutor.runCommand("ls -ltr");
            commandExecutor.runCommand(" rm -rf ./tmp/abc.pdf");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

// SRS
interface CommandExecutor{
    public void runCommand(String command) throws Exception;
}
// Provide Implementation for CommandExecutor
class CommandExecutorImpl implements  CommandExecutor{
    @Override
    public void runCommand(String command) throws IOException {
        // implementation
        Runtime.getRuntime().exec(command);
        System.out.println("Command Executed "+command);
    }
}

// This will authenticate user (Admin,Non-Admin)to execute critical commands

class CommandExecutorProxy implements CommandExecutor{
    private boolean isAdmin;
    private CommandExecutor executor;

    CommandExecutorProxy(String username,String password){
        if ( ("abc".equals(username))  && ("pwd".equals(password)))
            isAdmin = true;
        executor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String command) throws Exception {
        if (isAdmin)
            executor.runCommand(command);
        else{
            if (command.trim().startsWith("rm"))
                throw new Exception("rm command is not authorized for non-admin user");
            executor.runCommand(command);
        }

    }
}




