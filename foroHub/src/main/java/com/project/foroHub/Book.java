package com.project.foroHub;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Title is required")
    @Size(min = 2, max = 100, message = "Title should have between 2 and 100 characters")
    private String title;

    @NotEmpty(message = "Author is required")
    @Size(min = 2, max = 100, message = "Author should have between 2 and 100 characters")
    private String author;

    @NotEmpty(message = "Language is required")
    private String language;

    private String downloadUrl;

    @Column(updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();
}
