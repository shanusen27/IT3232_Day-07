package lk.ac.vau.fas.ict.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class UnderGraduate {
    @Id
    private String id;

    private String name;
    private String email;
    private String gender;
    private String phone;
    private String degree;
    private String university;

    @ManyToMany
    @JoinTable(
        name = "under_graduate_sessions",
        joinColumns = @JoinColumn(name = "under_graduates_id"),
        inverseJoinColumns = @JoinColumn(name = "sessions_id")
    )
    private List<Session> sessions;
}
