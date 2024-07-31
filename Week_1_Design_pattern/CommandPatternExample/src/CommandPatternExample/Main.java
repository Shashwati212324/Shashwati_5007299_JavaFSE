/*

Create a Java Project: Set up a project named CommandPatternExample.
Define Command Interface (Command): Interface with a method execute().
Implement Concrete Commands (LightOnCommand, LightOffCommand): Implement the Command interface.
Implement Invoker Class (RemoteControl): Holds a reference to a Command and a method to execute the command.
Implement Receiver Class (Light): Defines methods to turn the light on and off.
Test the Command Implementation (Main): Demonstrates using the RemoteControl to issue commands to the Light.

 */
package CommandPatternExample;

public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);
        RemoteControl remote = new RemoteControl();

        remote.setCommand(lightOn);
        remote.pressButton();

        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
