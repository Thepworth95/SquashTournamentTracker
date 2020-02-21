export interface Player{
    id: number;
    firstname: string;
    surname: string;
    graduationYear: number;
    group: number;
    matches: number;
    wins: number;
    losses: number;
    games: number;
}

export interface Match{
    id: number;
    player1: Player;
    player2: Player;
    p1socre: number;
    p2socre: number;
    winner: Player;
    looser: Player;
    groupgame: boolean;
}