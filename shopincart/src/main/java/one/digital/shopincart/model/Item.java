package one.digital.shopincart.model;


import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

@Data
@RedisHash("item")
public class Item {

    private long productId;

    private Integer amount;

}
