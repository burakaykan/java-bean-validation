package me.burakaykan.javax.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
public class User implements Serializable {


    private static final long serialVersionUID = 1751002052333867947L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotEmpty
    private String username;

    @NotBlank
    private String name;

    @AssertTrue
    private boolean itsTrue;

    @AssertFalse
    private boolean itsFalse;

    @Email(message = "Email alanı email formatına uymalıdır")
    private String email;


    @Min(18)
    @Max(99)
    private int age;

    @Positive
    private int positive;

    @PositiveOrZero
    private int positiveOrZero;

    @Negative
    private int negative;

    @NegativeOrZero
    private double negativeOrZero;

    @Past
    private LocalDateTime pastDate;

    @PastOrPresent
    private LocalDateTime pastOrPresentDate;

    @Future
    private LocalDateTime futureDate;

    @FutureOrPresent
    private LocalDateTime futureOrPresentDate;

}
