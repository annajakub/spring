package com.sda.springstarter.demo;

import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.model.Opinion;
import com.sda.springstarter.demo.model.Shops;
import com.sda.springstarter.demo.service.BookServiceImpl;
import com.sda.springstarter.demo.service.OpinionServiceImpl;
import com.sda.springstarter.demo.service.ShopServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //mówi springowi że to klasa rozruchowa
public class DemoApplication implements CommandLineRunner {
    @Autowired
    private BookServiceImpl bookService;
    @Autowired
    private ShopServiceImpl shopService;
    @Autowired
    private OpinionServiceImpl opinionService;

    public static void main(String[] args) {


        SpringApplication.run(DemoApplication.class, args);

    }

    @Override //wykonuje się automatycznie kiedy kontekst aplikacji zostanie podniesiony
    public void run(String... args) throws Exception {

        Book book1 = new Book("Tytul", "Autor");
        Book book2 = new Book("Tytul", "Autor2");

        Shops shops = new Shops("Mohito", "Bema", "Torun");
        Opinion opinion = new Opinion("Tor", "Najlepszy sklep ever");

        bookService.saveBook(book1);
        bookService.saveBook(book2);
        shopService.addShops(shops);
        opinionService.addOpinion(opinion);


    }
}
