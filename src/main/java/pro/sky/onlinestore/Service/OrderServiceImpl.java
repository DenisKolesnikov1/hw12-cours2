package pro.sky.onlinestore.Service;


import org.springframework.stereotype.Service;
import pro.sky.onlinestore.CartItem.Cart;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final Cart cart;

    public OrderServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public List<Integer> addItems(List<Integer> idList) {
        return cart.getItems();
    }

    @Override
    public List<Integer> getItems() {
        return cart.getItems();
    }
}
