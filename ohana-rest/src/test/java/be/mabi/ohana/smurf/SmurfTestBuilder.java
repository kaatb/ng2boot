package be.mabi.ohana.smurf;

import org.springframework.test.util.ReflectionTestUtils;

import java.time.LocalDate;

public class SmurfTestBuilder {

    public static final String NAME = "SnoreSmurf";
    public static final String USER_ID = "665";

    private Long id;
    private String name;
    private LocalDate creationDate;

    public static SmurfTestBuilder aSmurf() {
        return new SmurfTestBuilder();
    }

    public static SmurfTestBuilder aDefaultSmurf() {
        return new SmurfTestBuilder()
                .withoutId()
                .withName(NAME)
                .withCreationDate(LocalDate.now());
    }

    private SmurfTestBuilder() {
    }

    public Smurf build() {
        Smurf smurf = Smurf.SmurfBuilder.aSmurf()
                .withName(name)
                .withCreationDate(creationDate)
                .build();
        if (this.id != null) {
            ReflectionTestUtils.setField(smurf, "id", id);
        }
        return smurf;
    }

    public SmurfTestBuilder withoutId() {
        this.id = null;
        return this;
    }


    public SmurfTestBuilder withId(long id) {
        this.id = id;
        return this;
    }

    public SmurfTestBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public SmurfTestBuilder withCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
        return this;
    }
}