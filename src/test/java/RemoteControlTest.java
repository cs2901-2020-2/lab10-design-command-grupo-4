import command.commands.*;
import command.requests.*;
import command.invokers.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoteControlTest {
    @Test public void testCreateRemoteControl(){
        RemoteControl remoteControl = new RemoteControl();

        KitchenRoomLight light = new KitchenRoomLight();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        remoteControl.addCommand(lightOn);
        remoteControl.addCommand(lightOff);
        remoteControl.executeCommands();

        int commandsArraySize=remoteControl.getCommands().size();
        Assert.assertEquals(commandsArraySize,0);
    }
}

