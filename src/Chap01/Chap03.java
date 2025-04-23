package Chap01;

import java.util.Scanner;

//3. 문장 속 단어
//        설명
//
//한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
//
//문장속의 각 단어는 공백으로 구분됩니다.
//
//
//        입력
//
//첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
//
//
//        출력
//
//첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한
//
//단어를 답으로 합니다.
//
//
//예시 입력 1
//
//it is time to study
//예시 출력 1
//
//study

public class Chap03 {

    public String Solution(String foo){

        String[] sb = foo.split(" ");
        String answer = sb[0];
        int tmp = sb[0].length();

        for(int i = 1; i < sb.length; i++){
            if(tmp < sb[i].length()){
                answer = sb[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Chap03 chap03 = new Chap03();
        Scanner scanner = new Scanner(System.in);
        String foo = scanner.nextLine();

        System.out.println(chap03.Solution(foo));

    }
}




//import java.util.Scanner;
//
//public class Main {
//    public String Solution(String foo){
//
//        String[] sb = foo.split(" ");
//        String answer = "";
//
//        for(int i = 1; i < sb.length; i++){
//            if(sb[i-1].length() >= sb[i].length()){
//                answer = sb[i-1];
//            }
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//
//        Main t = new Main();
//        Scanner scanner = new Scanner(System.in);
//        String foo = scanner.nextLine();
//
//        System.out.println(t.Solution(foo));
//
//    }
//
//}
