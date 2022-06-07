import java.util.Calendar;

public class Ex10_5 {
    public static void main(String[] args) {
        // 달력 찍을 때 해야할 두 가지
        // 1. 말일 구하기 (다음달 1일에서 하루 빼면 이번달 말일)
        // 2. 이번달 1일의 요일 구하기

        int year = 2022;
        int month = 6;
        int START_DAY_OF_WEEK = 0; // 1일의 요일
        int END_DAY = 0;

        Calendar sDay = Calendar.getInstance(); // 시작일
        Calendar eDay = Calendar.getInstance(); // 끝일

        // 월의 경우 0부터 11까지의 값을 가지므로 1을 빼주어야 함
        // 예를 들어, 2019년 11월 1일은 sDay.set(2019, 10, 1);
        sDay.set(year, 5, 1); // 2022.6.1
        eDay.set(year, 6, 1); // 2022.7.1

        // 다음달의 첫날에서 하루를 빼면 현재달의 마지막 날이 됨
        eDay.add(Calendar.DATE, -1); // 2022.6.31

        // 첫번째 요일이 무슨 요일인지 알아내기
        START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);

        // eDay에 저장된 날짜 얻어오기
        END_DAY = eDay.get(Calendar.DATE);

        System.out.println("      " + year + "년 " + month + "월");
        System.out.println(" SU MO TU WE TH FR SA");

        // 해당 월의 1일이 어느 요일인지에 따라 공백을 출력함
        // 만일 1일이 수요일이라면 공백을 세 번 찍음 (일요일부터 시작)
        for(int i=1; i<START_DAY_OF_WEEK; i++) {
            System.out.print("   ");
        }

        for(int i=1, n=START_DAY_OF_WEEK; i<=END_DAY; i++,n++) {
            System.out.print((i < 10) ? "  " + i : " " + i);
            if(n%7==0) System.out.println();
        }
    }
}
