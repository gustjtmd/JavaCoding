package Chap01;

import java.util.Scanner;

/**
 7. 회문 문자열
 설명
 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 단 회문을 검사할 때 대소문자를 구분하지 않습니다.

 입력
 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.

 출력
 첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.

 예시 입력 1
 gooG

 예시 출력 1
 YES
 */

class Chap07 {

    public String solution(String input) {
        String answer = "YES";

        StringBuilder sb = new StringBuilder();
        String x = input.toLowerCase();
        sb.append(x);
        if(!x.equals(sb.reverse().toString())){
            answer = "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Chap07 t = new Chap07();
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(t.solution(input));
    }
}
