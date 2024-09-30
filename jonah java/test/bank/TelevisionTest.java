package bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {

    @Test
    public void testTelevisionCanOn() {
        Television tv = new Television(1, 1);
        tv.turnOn();
        assertTrue(tv.turnOn(),"tv should be on when turned on");
    }

    @Test
    public void testTelevisionCanOff() {
        Television tv = new Television(1, 1);
        tv.turnOff();
        assertFalse(tv.turnOff(), "tv should be turn off when turn off");
    }

    @Test
    public void testTelevisionCanSetChannel() {
        Television tv = new Television(1, 1);
        tv.turnOn();
        tv.setChannel(1);
        assertEquals(1, tv.getChannel(),"expected channel should be channel 1");
    }

    @Test
    public void testTelevisionCanSetVolume(){
        Television tv = new Television(1, 1);
        tv.turnOn();
        tv.setVolumeLevel(2);
        assertEquals(2, tv.getVolumeLevel(),"expected volume should be 2");
    }

    @Test
    public void testTelevisionCanIncreaseChannel(){
        Television tv = new Television(1, 1);
        tv.turnOn();
        tv.setChannel(3);
        tv.increaseChannel(4);
        assertEquals(4, tv.getChannel(),"expected channel should be 4");
    }

    @Test
    public void testTelevisionCanDecreaseChannel(){
        Television tv = new Television(1, 1);
        tv.turnOn();
        tv.setChannel(79);
        tv.decreaseChannel(78);
        assertEquals(78, tv.getChannel(),"expected channel should be 78");
    }

    @Test
    public void testTelevisionCanIncreaseVolume(){
        Television tv = new Television(1, 1);
        tv.turnOn();
        tv.setVolumeLevel(6);
        tv.increaseVolumeLevel(7);
        assertEquals(7, tv.getVolumeLevel(),"expected volume should be 7");
    }

    @Test
    public void testTelevisionCanDecreaseVolume(){
        Television tv = new Television(1, 1);
        tv.turnOn();
        tv.setVolumeLevel(6);
        tv.decreaseVolumeLevel(5);
        assertEquals(5, tv.getVolumeLevel(),"expected volume should be 5");

    }

    @Test
    public void testTelevisionCanResetChannel(){
        Television tv = new Television(1, 1);
        tv.turnOn();
        tv.setChannel(99);
        tv.resetChannel();
        assertEquals(1, tv.getChannel(),"expected channel should be 1");
    }

    @Test
    public void testTelevisionChannelCanNotGoBeyond120(){
        Television tv = new Television(1, 1);
        tv.turnOn();
        tv.setChannel(120);
        tv.increaseChannel(121);
        assertEquals(120, tv.getChannel(),"expected channel should be 120");
    }

    @Test
    public void testTelevisionChannelCanNotGoBellow1(){
        Television tv = new Television(1, 1);
        tv.turnOn();
        tv.setChannel(1);
        tv.decreaseChannel(-23);
        assertEquals(1, tv.getChannel(),"expected channel should be 1");
    }

    @Test
    public void testTelevisionVolumeCanNotGoBellow1(){
        Television tv = new Television(1, 1);
        tv.turnOn();
        tv.setVolumeLevel(1);
        tv.decreaseVolumeLevel(-23);
        assertEquals(1, tv.getVolumeLevel(),"expected volume should be 1");
    }

    @Test
    public void testTelevisionVolumeCanNotGoAbove15(){
        Television tv = new Television(1, 1);
        tv.turnOn();
        tv.setVolumeLevel(15);
        tv.increaseVolumeLevel(24);
        assertEquals(15, tv.getVolumeLevel(),"expected volume should be 15");
    }

}
