package com.qa.projectbackend.entity;

import javax.persistence.*;

@Entity
@Table(name = "players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "firstname", nullable = false)
    private String firstName;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "graduationyear", nullable = false)
    private int graduationYear;

    @Column(name = "group")
    private int group;

    @Column(name = "matches")
    private int matches;

    @Column(name = "wins")
    private int wins;

    @Column(name = "losses")
    private int losses;

    @Column(name = "games")
    private int games;

//    public Player() {
//    }
//
//    public Player(String firstName, String surname, int graduationYear) {
//        this.firstName = firstName;
//        this.surname = surname;
//        this.graduationYear = graduationYear;
//    }
//
//    public Player(String firstName, String surname, int graduationYear, int group, int matches, int wins, int losses, int games) {
//        this.firstName = firstName;
//        this.surname = surname;
//        this.graduationYear = graduationYear;
//        this.group = group;
//        this.matches = matches;
//        this.wins = wins;
//        this.losses = losses;
//        this.games = games;
//    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
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
