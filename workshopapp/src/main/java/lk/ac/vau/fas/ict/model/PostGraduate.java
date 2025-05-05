package lk.ac.vau.fas.ict.model;

import jakarta.persistence.*;

import java.util.List;

@Entity

public class PostGraduate {
    @Id
    private String id;

    private String name;
    private String email;
    private String gender;
    private String phone;
    private String institute;
    private String researchInterest;
    private String secondDegree;

    @ManyToMany
    @JoinTable(
        name = "post_graduate_sessions",
        joinColumns = @JoinColumn(name = "post_graduates_id"),
        inverseJoinColumns = @JoinColumn(name = "sessions_id")
    )
    private List<Session> sessions;
}
