package com.qa.projectbackend.entity;

import javax.persistence.*;

@Entity
@Table(name = "players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "firstname", nullable = false)
    private String firstname;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "graduationyear", nullable = false)
    private int graduationyear;

    @Column(name = "`group`")
    private int group;

    @Column(name = "matches")
    private int matches;

    @Column(name = "wins")
    private int wins;

    @Column(name = "losses")
    private int losses;

    @Column(name = "games")
    private int games;


    public int getId() {
        return id;
    }

    public void setId(int id) { this.id = id; }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGraduationYear() {
        return graduationyear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationyear = graduationYear;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getMatches() { return matches; }

    public void setMatches(int matches) { this.matches = matches; }

    public int getWins() { return wins; }

    public void setWins(int wins) { this.wins = wins; }

    public int getLosses() { return losses; }

    public void setLosses(int losses) { this.losses = losses; }

    public int getGames() { return games; }

    public void setGames(int games) { this.games = games; }
}
