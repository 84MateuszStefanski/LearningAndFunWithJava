package wzorceprojektowe.konstrukcyjne.builder.builderwosobnejklasie;

public class ToyBuilderUsage {
    public static void main(String[] args) {
        final Toy toy = new ToyBuilder()
                .withType("Action figure")
                .withName("G.I. Joe")
                .withMadeOf("plastic")
                .build();
    }
}
