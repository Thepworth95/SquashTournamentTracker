package com.qa.projectbackend.entity;


import javax.persistence.*;

@Entity
@Table(name = "tournamentmatches")
public class Matches {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "player1")
    private Player player1;

    @Column(name = "player1")
    private Player player2;

    @Column(name = "p1score")
    private int p1score;

    @Column(name = "p2score")
    private int p2score;

}
