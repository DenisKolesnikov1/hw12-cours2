package pro.sky.onlinestore.Service;

import java.util.List;

public interface OrderService {

    List<Integer> addItems(List<Integer> idList);

    List<Integer> getItems();
}
