package lv0;

public class Lv0 {

    public static int lv0_1(int[] arr1, int[] arr2){
//        이 문제에서 두 정수 배열의 대소관계를 다음과 같이 정의합니다.
//        두 배열의 길이가 다르다면, 배열의 길이가 긴 쪽이 더 큽니다.
//        배열의 길이가 같다면 각 배열에 있는 모든 원소의 합을 비교하여
//        다르다면 더 큰 쪽이 크고, 같다면 같습니다.
//        두 정수 배열 arr1과 arr2가 주어질 때,
//        위에서 정의한 배열의 대소관계에 대하여 arr2가 크다면 -1,
//        arr1이 크다면 1, 두 배열이 같다면 0을 return 하는 solution 함수를 작성해 주세요.

        int answer = 0;
        if(arr1.length > arr2.length){
            answer = 1;
        } else if (arr1.length < arr2.length) {
            answer = -1;
        } else {
            int arr1Int = 0;
            int arr2Int = 0;
            for (int i = 0; i < arr1.length; i++){
                arr1Int += arr1[i];
                arr2Int += arr2[i];
            }
            if(arr1Int > arr2Int){
                answer = 1;
            } else if(arr1Int < arr2Int){
                answer = -1;
            }
        }

        return answer;
    }

    public static int lv0_2(int[] num_list , int n){
//        정수 리스트 num_list와 찾으려는 정수 n이 주어질 때,
//        num_list안에 n이 있으면 1을 없으면 0을 return하도록
//        solution 함수를 완성해주세요.
        int answer = 0;
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] == n){
                answer = 1;
            }
        }
        return answer;
    }

    public static int[] lv0_3(int start_num, int end_num){
//        정수 start_num와 end_num가 주어질 때, start_num부터
//        end_num까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
        int[] answer = new int[end_num - start_num + 1];
        for (int i = start_num, j = 0; i <= end_num; i++, j++) {
            answer[j] = i;
        }
        return answer;
    }

    public static String lv0_4(String rny_string) {
//        'm'과 "rn"이 모양이 비슷하게 생긴 점을
//        활용해 문자열에 장난을 하려고 합니다.
//        문자열 rny_string이 주어질 때,
//        rny_string의 모든 'm'을 "rn"으로
//        바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
        return rny_string.replace("m" , "rn");
    }

    public static int lv0_5 (double flo){
//        실수 flo가 매개 변수로 주어질 때,
//        flo의 정수 부분을 return하도록
//        solution 함수를 완성해주세요.
        return (int) flo;
    }

    public static String lv0_6 (String my_string, int n){
        int count = my_string.length() - n;
        return my_string.substring(count);
    }

    public static int lv0_7(int a, int b, boolean flag) {
//        두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때,
//        flag가 true면 a + b를 false면 a - b를
//        return 하는 solution 함수를 작성해 주세요.
        if(flag){
            return a + b;
        }
        return a - b;
    }
}
