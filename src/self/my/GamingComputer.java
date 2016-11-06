package self.my;

/**
 * Created by Christian on 11/6/2016.
 */
public class GamingComputer extends Computer {
    private String SLIVideo;
    private String LEDS;

    public GamingComputer(String processor, String motherboard, String RAM, String powerSupply, String diskDrive, String discreteVideo, String discreteNetwork, String discreteAudio, String SLIVideo, String LEDS) {
        super(processor, motherboard, RAM, powerSupply, diskDrive, discreteVideo, discreteNetwork, discreteAudio);
        this.SLIVideo = SLIVideo;
        this.LEDS = LEDS;
    }

    public String getSLIVideo() {
        return SLIVideo;
    }

    public void setSLIVideo(String SLIVideoAdapter) {
        this.SLIVideo = SLIVideo;
    }

    public String getLEDS() {
        return LEDS;
    }

    public void setLEDS(String LEDS) {
        this.LEDS = LEDS;
    }

    @Override
    public String toString() {
        return super.toString() + " Gaming Additions to Computer{" +
                "SLIVideo='" + SLIVideo + '\'' +
                ", LEDS='" + LEDS + '\'' +
                '}';
    }
}
