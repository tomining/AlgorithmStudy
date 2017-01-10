package com.algorithm.distance;

import org.apache.commons.lang.StringUtils;

import static org.apache.commons.lang.NumberUtils.minimum;

/**
 * @author tomining
 */
public class LevenshteinDistance {
    public int getDistance(String first, int i, String second, int j) {
        if (i == 0) {
            return j;
        } else if (j == 0) {
            return i;
        }

        int cost = 0;
        if (first.charAt(i - 1) != second.charAt(j - 1)) {
            cost = 1;
        }

        return minimum(
                getDistance(first, i-1, second, j) + 1,
                getDistance(first, i, second, j-1) + 1,
                getDistance(first, i-1, second, j-1) + cost
        );
    }

    public int getDistance(String first, String second) {
        if (StringUtils.equals(first, second)) {
            return 0;
        } else if (StringUtils.isEmpty(first)) {
            return second.length();
        } else if (StringUtils.isEmpty(second)) {
            return first.length();
        }

        int[][] dist = new int[first.length() + 1][second.length() + 1];
        for (int i = 0; i < first.length() + 1; i++) {  //좌측변 초기화
            dist[i][0] = i;
        }
        for (int j = 0; j < second.length() + 1; j++) { //상단 초기화
            dist[0][j] = j;
        }

        for (int i = 1; i < first.length() + 1; i++) {
            for (int j = 1; j < second.length() + 1; j++) {
                if (first.charAt(i - 1) == second.charAt(j - 1)) {
                    dist[i][j] = dist[i - 1][j - 1];
                } else {
                    dist[i][j] = minimum(
                            dist[i - 1][j] + 1,
                            dist[i][j - 1] + 1,
                            dist[i -1][j - 1] + 1
                            );
                }
            }
        }

        return dist[first.length()][second.length()];
    }
}
