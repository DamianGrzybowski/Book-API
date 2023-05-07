package pl.coderslab.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.entity.Book;
import pl.coderslab.service.BookService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
@RequestMapping("admin/books")
public class MangeBookController {
    public static final String ADD_BOOK_FORM = "addBook-form";
    public static final String UPDATE_BOOK_FORM = "updateBook-form";
    private final BookService bookService;

    @GetMapping("all")
    public String showPosts(Model model) {
        List<Book> books = bookService.getBooks();
        model.addAttribute("books", books);
        return "bookAll";
    }

    @GetMapping("add")
    public String addNewBook(Model model) {
        model.addAttribute("book", new Book());
        return ADD_BOOK_FORM;
    }

    @PostMapping("add")
    public String handleAddNewBookForm(@ModelAttribute("book") @Valid Book book, BindingResult result) {
        if (result.hasErrors()) {
            return ADD_BOOK_FORM;
        }
        bookService.addBook(book);
        return "redirect:/admin/books";
    }

    @GetMapping("update")
    public String updateBook(@RequestParam("id") Long id, Model model) {
        Optional<Book> book = bookService.getBook(id);
        model.addAttribute("bookToUpdate", book.orElseThrow(() -> new IllegalArgumentException("Invalid book id: " + id)));
        return UPDATE_BOOK_FORM;
    }

    @PostMapping("update")
    public String handleUpdateBookForm(@ModelAttribute("bookToUpdate") @Valid Book book, BindingResult result) {
        if (result.hasErrors()) {
            return UPDATE_BOOK_FORM;
        }
        bookService.update(book);
        return "redirect:/admin/books";
    }


}
