package com.beniregev.java8springh2reactapp.model;

import com.beniregev.java8springh2reactapp.repository.ContactRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoLoader implements CommandLineRunner {

    private ContactRepository contactRepository;

    public DemoLoader(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        contactRepository.save(new Contact("King", "David", "king.david@bible.com"));
    }

}
