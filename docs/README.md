# 로또 게임
*****
## 구현할 기능 목록

- ### 상수 목록
  - 로또 숫자 범위 시작 : 1
  - 로또 숫자 범위 끝 : 45
  - 로또 금액 : 1000
  - 당첨 번호 개수 : 6
  - 보너스 번호 개수 : 1
  - 당첨 번호 구분자 : ,
  - 1등 상금 숫자값 : 2000000000
  - 2등 상금 숫자값 : 30000000
  - 3등 상금 숫자값 : 1500000
  - 4등 상금 숫자값 : 50000
  - 5등 상금 숫자값 : 5000
  
 
- 출력용 상수
  - 1등 상금 : 2,000,000,000원
  - 2등 상금 : 30,000,000원
  - 3등 상금 : 1,500,000원
  - 4등 상금 : 50,000원
  - 5등 상금 : 5,000원
  - 구입금액을 입력해 주세요.
  - x개를 구매했습니다.
  - 당첨 번호를 입력해 주세요.
  - 보너스 번호를 입력해 주세요.
  - 당첨 통계\n---
  - x개 일치 (x) - x개
  - 총 수익률은 x입니다.
  - 에러 문자열 ([ERROR] 로또 번호는 1부터 45 사이의 숫자여야 합니다.)

- ### 로또 구입 금액 입력 받기
    - [ ] 구입금액을 입력해 주세요. 출력
    - [ ] 구입금액 입력 받기
        - [ ] 빈 문자열이면 에러 처리
        - [ ] 숫자가 아니면 에러 처리
        - [ ] 1000으로 나누어 떨어지지 않으면 에러 처리
    - [ ] x개를 구매했습니다. 출력
    - [ ] 구입금액 / 1000 회수 만큼 로또 번호 생성
      - [ ] 범위 내의 중복되지 않은 6개 숫자 생성
      - [ ] 로또 번호 출력

- ### 번호 입력 받기
    - [ ] 당첨 번호를 입력해 주세요. 출력
    - [ ] 당첨 번호 입력 받기
      - [ ] 빈 문자열이면 에러 처리
      - [ ] ,으로 나눠서 6개가 아니면 에러 처리
      - [ ] 숫자가 아니면 에러 처리
      - [ ] 중복된 숫자가 있으면 에러 처리
      - [ ] 1 ~ 45 범위 넘어가면 에러 처리
    - [ ] 보너스 번호를 입력해 주세요. 출력
    - [ ] 보너스 번호 입력 받기
      - [ ] 빈 문자열이면 에러 처리
      - [ ] 숫자가 아니면 에러 처리
      - [ ] 당첨 번호랑 중복된 숫자가 있으면 에러 처리
      - [ ] 1 ~ 45 범위 넘어가면 에러 처리

- ### 당첨 통계 출력
    - [ ] 5등부터 1등까지 당첨 내역 출력
    - [ ] 총 수익률 계산
      - [ ] 수익률 계산식 = 최종 수익 / 원금 * 100 (소수점 둘째 자리에서 반올림)
    - [ ] 총 수익률 출력

****

## 고려할 사항

- 피드백에 나온 내용 지키기
  - 기능 목록 재검토, 업데이트 하기
  - 값을 하드 코딩하지 않기 : enum 사용하기
  - 구현 순서 지키기 : 클래스는 상수, 멤버 변수, 생성자, 메서드 순으로 작성한다.
  - 변수 이름에 자료형 사용하지 않기
  - 한 함수가 한 가지 기능만 담당하기
  - 처음부터 큰 단위의 테스트를 만들지 않기
- 추가된 요구 사항
  - 함수 길이 15줄 이하, 함수가 한 가지 일만 하도록 구현
  - else 쓰지 않기
  - Enum 적용하기
  - 도메인 로직 단위테스트 구현하기 : mvc 사용할 예정
- 수익률 계산 식
  - 최종 수익 / 원금 * 100 (소수점 둘째 자리에서 반올림)

****

## 기능 요구 사항

- 로또 번호의 숫자 범위는 1~45까지이다.
- 1개의 로또를 발행할 때 중복되지 않는 6개의 숫자를 뽑는다.
- 당첨 번호 추첨 시 중복되지 않는 숫자 6개와 보너스 번호 1개를 뽑는다.
- 당첨은 1등부터 5등까지 있다. 당첨 기준과 금액은 아래와 같다.
    - 1등: 6개 번호 일치 / 2,000,000,000원
    - 2등: 5개 번호 + 보너스 번호 일치 / 30,000,000원
    - 3등: 5개 번호 일치 / 1,500,000원
    - 4등: 4개 번호 일치 / 50,000원
    - 5등: 3개 번호 일치 / 5,000원


  로또 구입 금액을 입력하면 구입 금액에 해당하는 만큼 로또를 발행해야 한다.
  로또 1장의 가격은 1,000원이다.
  당첨 번호와 보너스 번호를 입력받는다.
  사용자가 구매한 로또 번호와 당첨 번호를 비교하여 당첨 내역 및 수익률을 출력하고 로또 게임을 종료한다.
  사용자가 잘못된 값을 입력할 경우 IllegalArgumentException를 발생시키고, "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.
  Exception이 아닌 IllegalArgumentException, IllegalStateException 등과 같은 명확한 유형을 처리한다.