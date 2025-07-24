package application;

import ChessConsole.UI;
//import boardgame.Board;
import chess.ChessMatch;

/*
 * autor: Otto Samuel
 * data: 19/07/2025
 * descrição: programa para testar o jogo de xadrez
 * versão: 1.0
 */

public class Program {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }
}
