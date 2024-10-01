package hello.itemservice.domain.item;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data //@Data를 쓸 때에는 조심해야 함. @Getter, @Setter 정도만 쓰는 것이 좋음
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item(){
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
