package wzorceprojektowe.konstrukcyjne.builder.builderlombook;

public class LombokBuilderUsage {
    public static void main(String[] args) {
        GraphicsCard graphicsCard = GraphicsCard.builder()
                .modelName("GTX6000")
                .producer("NVidia")
                .memoryInMb(2048)
                .series("1xxx")
                .build();

    }
}
