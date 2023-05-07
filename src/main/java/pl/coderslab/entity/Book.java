package pl.coderslab.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.transaction.Transactional;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
@ToString
@Transactional
@Table(name = "books")
public class Book {
    private static final String NOT_NULL_MESSAGE = "The field cannot be empty";
    private static final String SIZE_MESSAGE = "Please enter text between 3 and 50 characters";


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotNull(message = NOT_NULL_MESSAGE)
    @Pattern(regexp = "^(978|979)[\\- ]?\\d{1,5}[\\- ]?\\d{1,7}[\\- ]?\\d{1,6}[\\- ]?\\d$", message = "Please enter correct ISBN format")
    @Column(name = "isbn")
    private String isbn;

    @NotNull(message = NOT_NULL_MESSAGE)
    @Size(min = 3, max = 50, message = SIZE_MESSAGE)
    @Column(name = "title")
    private String title;

    @NotNull(message = NOT_NULL_MESSAGE)
    @Size(min = 3, max = 50, message = SIZE_MESSAGE)
    @Column(name = "author")
    private String author;

    @NotNull(message = NOT_NULL_MESSAGE)
    @Size(min = 3, max = 50, message = SIZE_MESSAGE)
    @Column(name = "publisher")
    private String publisher;

    @NotNull(message = NOT_NULL_MESSAGE)
    @Size(min = 3, max = 50, message = SIZE_MESSAGE)
    @Column(name = "type")
    private String type;

    @JsonCreator
    public Book(@JsonProperty("id") Long id,
                @JsonProperty("isbn") String isbn,
                @JsonProperty("title") String title,
                @JsonProperty("author") String author,
                @JsonProperty("publisher") String publisher,
                @JsonProperty("type") String type) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.type = type;
    }


    public Book() {

    }
}
