package com.qa.projectbackend.entity;


import javax.persistence.*;

@Entity
@Table(name = "tournamentmatches")
public class Matches {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @ManyToOne
    @JoinColumn(name = "player1")
    private Player player1;

    @ManyToOne
    @JoinColumn(name = "player2")
    private Player player2;

    @Column(name = "p1score")
    private int p1score;

    @Column(name = "p2score")
    private int p2score;

    @ManyToOne
    @JoinColumn(name = "winner")
    private Player winner;

    @ManyToOne
    @JoinColumn(name = "looser")
    private Player looser;

    @Column(name = "groupgame")
    private boolean groupgame;

    public Matches(Player player1, Player player2, Boolean groupgame) {
        this.player1 = player1;
        this.player2 = player2;
        this.groupgame = groupgame;
    }

    public int getId() {
        return id;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public int getP1score() {
        return p1score;
    }

    public void setP1score(int p1score) {
        this.p1score = p1score;
    }

    public int getP2score() {
        return p2score;
    }

    public void setP2score(int p2score) {
        this.p2score = p2score;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public Player getLooser() {
        return looser;
    }

    public void setLooser(Player looser) {
        this.looser = looser;
    }

    public boolean isGroupgame() {
        return groupgame;
    }

    public void setGroupgame(boolean groupgame) {
        this.groupgame = groupgame;
    }
}
