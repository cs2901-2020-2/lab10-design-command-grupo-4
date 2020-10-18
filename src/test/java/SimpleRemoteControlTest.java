import command.commands.*;
import command.requests.*;
import command.invokers.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleRemoteControlTest {

    @Test public void testKitchenLight(){
         SimpleRemoteControl remote = new SimpleRemoteControl();
         KitchenRoomLight light = new KitchenRoomLight();
         LightOnCommand lightOn = new LightOnCommand(light);

         remote.setCommand(lightOn);
         remote.executeCommand();

        Boolean StateLightFromRemote= remote.getSlot().getSelf().getState();
        Assert.assertTrue(StateLightFromRemote);

        LightOffCommand lightOff = new LightOffCommand(light);

         remote.setCommand(lightOff);
         remote.executeCommand();

        StateLightFromRemote= remote.getSlot().getSelf().getState();
        Assert.assertFalse(StateLightFromRemote);
    }

    @Test public void testLivingLight(){
         SimpleRemoteControl remote = new SimpleRemoteControl();
         LivingRoomLight light = new LivingRoomLight();
         LightOnCommand lightOn = new LightOnCommand(light);

         remote.setCommand(lightOn);
         remote.executeCommand();

         Boolean StateLightFromRemote= remote.getSlot().getSelf().getState();
         Assert.assertTrue(StateLightFromRemote);

         LightOffCommand lightOff = new LightOffCommand(light);

         remote.setCommand(lightOff);
         remote.executeCommand();

        StateLightFromRemote= remote.getSlot().getSelf().getState();
        Assert.assertFalse(StateLightFromRemote);
    }

    @Test public void testCeilingFan(){
         SimpleRemoteControl remote = new SimpleRemoteControl();
         CeilingFan ceilingFan = new CeilingFan();
         CeilingFanHighCommand fanHigh = new CeilingFanHighCommand(ceilingFan);

         remote.setCommand(fanHigh);
         remote.executeCommand();

        Boolean StateFanFromRemote= remote.getSlot().getSelf().getState();
        Assert.assertTrue(StateFanFromRemote);

        CeilingFanLowCommand fanLow = new CeilingFanLowCommand(ceilingFan);

        remote.setCommand(fanLow);
        remote.executeCommand();

        StateFanFromRemote= remote.getSlot().getSelf().getState();
        Assert.assertFalse(StateFanFromRemote);
    }

    @Test public void testGarageDoor(){
         SimpleRemoteControl remote = new SimpleRemoteControl();
         GarageDoor garageDoor = new GarageDoor();
         GarageDoorOpenCommand doorOpen = new GarageDoorOpenCommand(garageDoor);

         remote.setCommand(doorOpen);
         remote.executeCommand();

         Boolean StateDoorFromRemote= remote.getSlot().getSelf().getState();
        Assert.assertFalse(StateDoorFromRemote);

         GarageDoorCloseCommand doorClose = new GarageDoorCloseCommand(garageDoor);

         remote.setCommand(doorClose);
         remote.executeCommand();

        StateDoorFromRemote= remote.getSlot().getSelf().getState();
        Assert.assertTrue(StateDoorFromRemote);
    }

    @Test public void testStereo(){
         SimpleRemoteControl remote = new SimpleRemoteControl();
         Stereo stereo = new Stereo();
         StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);

         remote.setCommand(stereoOnCommand);
         remote.executeCommand();

         Boolean StateStereoFromRemote= remote.getSlot().getSelf().getState();
         Assert.assertTrue(StateStereoFromRemote);

         StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

         remote.setCommand(stereoOffCommand);
         remote.executeCommand();

        StateStereoFromRemote= remote.getSlot().getSelf().getState();
        Assert.assertFalse(StateStereoFromRemote);
    }
}