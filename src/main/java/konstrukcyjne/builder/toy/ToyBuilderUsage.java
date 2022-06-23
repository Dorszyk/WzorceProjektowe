package konstrukcyjne.builder.toy;

public class ToyBuilderUsage {
    public static void main(String[] args) {
        final Toy toy = new ToyBuilder()
                .withMadeOf("plastic")
                .withName("Resorak")
                .withType("Small car")
                .build();

        System.out.println(toy);
    }

}