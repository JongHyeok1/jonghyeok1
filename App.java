import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] results = new int[10];// 배열생성!
        int index = 0; // 결과가 저장된 배열 변수선언!
        boolean End = false; // 종료여부를 boolean에 저장하기위해 변수생성!
        do { // 첫번째는 일단 무조건 실행하는 do문!
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            // 정수형으로 숫자 받기
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            // 정수형으로 숫자 받기
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);
            // char과 next는 호환되지않는데 charAt(0); 을이용해서 호환되게만든다.
            int result = 0;
            switch (operator) { // operator 값에 따라 네 가지 case로 분류
                case '+': // 덧셈연산
                    result = num1 + num2;
                    break;
                case '-': // 뺄셈연산
                    result = num1 - num2;
                    break;
                case '*': // 곱샘연산
                    result = num1 * num2;
                    break;
                case '/': // 나눗셈
                    if (num2 == 0) // 분모가 0일 경우에 밑에 문구를 출력하기위해 if문사용!
                        System.out.println("나눗셈에서 분모는0이 될수없습니다.");
                    else
                        result = num1 / num2;
                    break;
            }
            System.out.println("결과: " + result);
            if (index >= 9) { //index가 9를 넘을때
                for (int i = 0; i < results.length - 1; i++) {
                    results[i] = results[i + 1];//다음 값을 현재자리에 넣는다
                    results[index] = result;
                }
                else//index 가 9보다 작을때 10개를 저장할수있는 배열을 생성
                {
                    results[index++] = result;
                }
                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                End = sc.next().equals("exit"); //"exit"를 입력하면 종료!
            }while(!End) ;
        }
    }
}




