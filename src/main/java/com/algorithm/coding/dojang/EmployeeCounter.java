package com.algorithm.coding.dojang;

import org.apache.commons.lang.StringUtils;

import java.util.stream.Stream;

/**
 * Question: A 사무실에 특정일자의 출퇴근 시간이 기록된 거대한 로그파일이 있다고 한다.
 * 파일의 형식은 다음과 같다.(한 라인에서 앞 부분은 출근시간(HH:MM:SS), 뒷 부분은 퇴근시간이다)
 *
 * 09:12:23 11:14:35
 * 10:34:01 13:23:40
 * 10:34:31 11:20:10
 *
 * 특정 시간을 입력(예: 11:05:20)으로 주었을 때 그 시간에 총 몇 명이 사무실에 있었는지 알려주는 함수를 작성하시오.
 *
 * http://codingdojang.com/scode/418?answer_mode=hide
 * @author tomining
 */
public class EmployeeCounter {
    public long countWorkingEmployees(Stream<String> commutingTimes, String now) {
        Stream<String> workingEmployees = commutingTimes.filter((commutingTime) -> isEmployeeWorking(commutingTime, now));
        return workingEmployees.count();
    }

    /**
     * 시간값은 HH:MM:SS 형식으로 전달된다고 가정한다.
     * @param commutingTime 출퇴근 시간
     * @param now 현재 시간
     * @return 근무여부
     */
    private boolean isEmployeeWorking(String commutingTime, String now) {
        String[] comTime = StringUtils.split(commutingTime, " ");
        if (now.compareTo(comTime[0]) < 0) { //출근시간 > now
            return false;
        } else if (now.compareTo(comTime[1]) > 0) {    //퇴근시간 < now
            return false;
        } else {
            return true;
        }
    }
}
