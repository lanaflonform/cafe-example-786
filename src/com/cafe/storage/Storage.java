package com.cafe.storage;

import com.cafe.Drink;
import java.util.List;

public interface Storage
{
    Drink store(Drink drink);

    Drink find(String name);

    List<Drink> getAll();
}
