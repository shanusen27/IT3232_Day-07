package lk.ac.vau.fas.ict.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity

public class Session {
    @Id
    private String id;
    
    private String name;
    private String description;
    private LocalDate date;
    private LocalTime time;

    @ManyToOne
    @JoinColumn(name = "workshop_id")
    private Workshops workshops;

    @ManyToMany(mappedBy = "sessions")
    private List<Presenter> presenters;

    @ManyToMany(mappedBy = "sessions")
    private List<PostGraduate> postGraduates;

    @ManyToMany(mappedBy = "sessions")
    private List<UnderGraduate> underGraduates;
}



