package lk.ac.vau.fas.ict.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Workshops {
    @Id
    private int id;

    private String description;
    private String name;

    private LocalDate startDate;
    private LocalDate endDate;

    @OneToMany(mappedBy = "workshops")
    private List<Session> sessions;

}
