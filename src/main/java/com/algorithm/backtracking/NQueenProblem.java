package com.algorithm.backtracking;

import org.apache.commons.lang.ArrayUtils;

import java.util.Arrays;

/**
 * Question: N-Queen problem
 * 가로 세로 모두 N개의 칸이 있는 체스판 위에 N개의 여왕을 올려놓되 서로 공격해서
 * 잡을 수 없도록 놓을 수 있는 방법은 모두 몇 개인가?
 *
 * 참고: https://developers.google.com/optimization/puzzles/queens
 * @author tomining83
 */
public class NQueenProblem {
    protected boolean printResultFlag = false;
    protected int resultCount = 0;

    public NQueenProblem() {
        this(false);
    }

    public NQueenProblem(boolean printResultFlag) {
        this.printResultFlag = printResultFlag;
    }

    public int solve(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("N 값은 1 이상이어야 합니다.");
        }

        resultCount = 0;
        int[] board = getChessBoard(n);
        placeQueens(board, 0);

        System.out.println(String.format("%d X %d 체스판에 %d개의 Queen을 놓는 방법의 수는 %d가지 입니다", n, n, n, resultCount));
        return resultCount;
    }

    private void placeQueens(int board[], int h) {
        for (int idx = 0; idx < board.length; idx++) {
            if (canPlaceQueen(board, h, idx)) {
                board[h] = idx;
                if (h == board.length - 1) {
                    resultCount++;
                    printBoard(board);
                } else {
                    placeQueens(board, h + 1);
                }
            }
        }
    }

    private boolean canPlaceQueen(int[] board, int h, int v) {
        int size = board.length;
        for (int idx = 0; idx < h; idx++) {
            if (board[idx] == v) {  //같은 라인에 놓인 경우
                return false;
            } else if (Math.abs(idx - h) == Math.abs(board[idx] - v)) {  //대각선 라인에 놓인 경우
                return false;
            }
        }

        return true;
    }

    protected void printBoard(int[] board) {
        if (printResultFlag == false) {
            return;
        }

        int boardSize = board.length;

        for (int hIdx = 0; hIdx < boardSize; hIdx++) {
            for (int vIdx = 0; vIdx < boardSize; vIdx++) {
                if (board[hIdx] == vIdx) {
                    System.out.print("Q");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();   //줄 이동
        }
        System.out.println();
    }

    protected int[] getChessBoard(int n) {
        int[] chessBoard = new int[n];
        Arrays.fill(chessBoard, n + 1);
        return chessBoard;
    }
}
