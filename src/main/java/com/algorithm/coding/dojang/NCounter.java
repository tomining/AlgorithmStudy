package com.algorithm.coding.dojang;

/**
 * Question: 1부터 10000까지 8이라는 숫자가 총 몇번 나오는가
 * 8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다.
 *
 * http://codingdojang.com/scode/393?answer_mode=hide
 * @author tomining
 */
public class NCounter {
    private final int findingNum;

    public NCounter(int findingNum) {
        this.findingNum = findingNum;
    }

    public int countN(int from, int to) {
        if (from > to) {
            return 0;
        }

        int count = 0;
        for (int i = from; i <= to; i++) {
            count += getCountN(i);
        }

        return count;
    }

    /**
     * TODO num에 대한 결과값 캐싱(성능향상)
     * @param num 대상 숫자
     * @return 찾고자 하는 숫자 갯수
     */
    private int getCountN(int num) {
        int count = 0;
        do {
            if (num % 10 == this.getFindingNum()) {  //마지막 자리가 8인지 체크
                count++;
            }
            num /= 10;
        } while (num > 0);

        return count;
    }

    /**
     * 1 ~ to까지 findingNum의 갯수를 카운팅 할 때, to 변수가 10의 배수라고 가정하면...
     *
     * @param to 10의 배수
     * @return findingNum 갯수
     */
    public int countN(int to) {
        int posNum = 0;
        while (to > 0) {    //to 자릿 수 계산
            if (to % 10 == 0) {
                posNum++;
            }
            to /= 10;
        }

        return posNum * (int)Math.pow(10, posNum - 1);
    }

    /**
     * 1 ~ to까지 findingNum의 갯수를 카운팅, to 변수 제약 없음
     * 참고: https://github.com/KimMinJoo/AlgorithmStudy/tree/master/src/google
     * @param to 마지막 숫자
     * @return findingNum 갯수
     */
    public int countNV2(int to) {
        if (getFindingNum() > to) {
            return 0;
        }

        int posNum = 1;
        int unit = 10;

        int count = 0;
        while (true) {
            count += (to / unit) * posNum;

            if ((to % unit) / posNum == getFindingNum()) {
                count += to % posNum + 1;
            } else if ((to % unit) / posNum > getFindingNum())  {
                count += posNum;
            }

            if (to / unit == 0) {
                break;
            }

            unit *= 10;
            posNum *= 10;
        }

        return count;
    }

    public int getFindingNum() {
        return findingNum;
    }
}
