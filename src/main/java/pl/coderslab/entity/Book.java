package pl.coderslab.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.transaction.Transactional;

@Getter
@Setter
@Entity
@ToString
@Transactional
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "publisher")
    private String publisher;

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
