import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pizza {

    public enum Sizes {
        SMALL(5),
        MEDIUM(12),
        LARGE(15);

        private final int price;

        Sizes(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }
    }
}
