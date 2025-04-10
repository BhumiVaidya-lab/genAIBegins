package com.epam.training.gen.ai.controller;

import com.epam.training.gen.ai.model.BookInfo;
import com.epam.training.gen.ai.model.ChatResponse;
import com.epam.training.gen.ai.service.promt.BookAssistantService;
import com.epam.training.gen.ai.service.promt.BookCartService;
import com.epam.training.gen.ai.service.promt.BorrowedBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("book-assistant")
@RequiredArgsConstructor
public class BookAssistantController {

    private final BookAssistantService bookAssistantService;
    private final BookCartService bookCartService;
    private final BorrowedBookService borrowedBookService;

    /**
     * Pure output with no {@link ChatResponse} wrapper for the better view
     */
    @GetMapping("chat")
    public String retrieveAssistantHelp(@RequestParam(name = "input") String userInput) {
        return bookAssistantService.processInput(userInput);
    }

    @GetMapping("book")
    public BookInfo retrieveAssistantHelpForBookInfo(@RequestParam(name = "input") String userInput) {
        return bookAssistantService.processBook(userInput);
    }

    @GetMapping("check/cart")
    public List<BookInfo> checkCart() {
        return bookCartService.getReaderCart();
    }

    @GetMapping("check/borrowed")
    public List<BookInfo> checkBorrowedBooks() {
        return borrowedBookService.getBorrowedBooksDB();
    }
}