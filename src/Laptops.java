import java.util.Objects;

public class Laptops {
    private String brand;
    private String RAM;
    private String videoProcessor;
    private String color;
    private String operatingSystem;

    public Laptops(String brand, String RAM, String videoProcessor, String color, String operatingSystem){
        this.brand = brand;
        this.RAM = RAM;
        this.videoProcessor = videoProcessor;
        this.color = color;
        this.operatingSystem = operatingSystem;
    }
    public String getBrand(){
        return brand;
    }
    public String getRAM(){
        return RAM;
    }
    public String getVideoProcessor(){
        return videoProcessor;
    }
    public String getColor(){
        return color;
    }
    public String getOperatingSystem(){
        return operatingSystem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptops laptops = (Laptops) o;
        return Objects.equals(brand,laptops.brand) &&
                Objects.equals(RAM, laptops.RAM) &&
                Objects.equals(videoProcessor, laptops.videoProcessor) &&
                Objects.equals(color,laptops.color) &&
                Objects.equals(operatingSystem,laptops.operatingSystem);
    }

    @Override
    public String toString() {
        return "Бренд: " + brand + "," + "Оперативная память: " + RAM + "," + "Видео процессор" +
                videoProcessor + "," + "Цвет: " + color + "," + "Операционная система: "+ operatingSystem + "\n";
    }
}
