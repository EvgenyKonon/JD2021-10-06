package by.it.laevskiy.jd02_02.service;

import by.it.laevskiy.jd02_02.entity.Good;

public interface ShoppingCardAction {
void takeCart(); //взял корзину
int putToCart(Good good); //положил товар в корзину(возвращает число товаров)
}