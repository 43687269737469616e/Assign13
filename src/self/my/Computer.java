package self.my;

/**
 * Created by Christian on 11/6/2016.
 */
public class Computer {
    private String processor;
    private String motherboard;
    private String RAM;
    private String powerSupply;
    private String diskDrive;
    private String discreteVideo;
    private String discreteNetwork;
    private String discreteAudio;

    public Computer(String processor, String motherboard, String RAM, String powerSupply, String diskDrive) {
        this.processor = processor;
        this.motherboard = motherboard;
        this.RAM = RAM;
        this.powerSupply = powerSupply;
        this.diskDrive = diskDrive;
    }

    public Computer(String processor, String motherboard, String RAM, String powerSupply, String diskDrive, String discreteVideo, String discreteNetwork, String discreteAudio) {
        this.processor = processor;
        this.motherboard = motherboard;
        this.RAM = RAM;
        this.powerSupply = powerSupply;
        this.diskDrive = diskDrive;
        this.discreteVideo = discreteVideo;
        this.discreteNetwork = discreteNetwork;
        this.discreteAudio = discreteAudio;
    }

    public Computer(String processor, String motherboard, String RAM, String powerSupply, String diskDrive, String discreteVideo) {
        this.processor = processor;
        this.motherboard = motherboard;
        this.RAM = RAM;
        this.powerSupply = powerSupply;
        this.diskDrive = diskDrive;
        this.discreteVideo = discreteVideo;
    }

    public Computer(String processor, String motherboard, String RAM, String powerSupply, String diskDrive, String discreteVideo, String discreteNetwork) {
        this.processor = processor;
        this.motherboard = motherboard;
        this.RAM = RAM;
        this.powerSupply = powerSupply;
        this.diskDrive = diskDrive;
        this.discreteVideo = discreteVideo;
        this.discreteNetwork = discreteNetwork;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public String getDiskDrive() {
        return diskDrive;
    }

    public void setDiskDrive(String diskDrive) {
        this.diskDrive = diskDrive;
    }

    public String getDiscreteVideo() {
        return discreteVideo;
    }

    public void setDiscreteVideo(String discreteVideo) {
        this.discreteVideo = discreteVideo;
    }

    public String getDiscreteNetwork() {
        return discreteNetwork;
    }

    public void setDiscreteNetwork(String discreteNetwork) {
        this.discreteNetwork = discreteNetwork;
    }

    public String getDiscreteAudio() {
        return discreteAudio;
    }

    public void setDiscreteAudio(String discreteAudio) {
        this.discreteAudio = discreteAudio;
    }

    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", motherboard='" + motherboard + '\'' +
                ", RAM='" + RAM + '\'' +
                ", powerSupply='" + powerSupply + '\'' +
                ", diskDrive='" + diskDrive + '\'' +
                ", discreteVideo='" + discreteVideo + '\'' +
                ", discreteNetwork='" + discreteNetwork + '\'' +
                ", discreteAudio='" + discreteAudio + '\'' +
                '}';
    }
}
