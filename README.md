# 문자열 계산기
## 기능 요구사항
* [X] 입력 문자열의 숫자와 사칙 연산자를 빈 공백 문자로 구분한다.
* [X] 입력 값이 null 이거나 빈 공백 문자일 경우 예외를 반환한다.
* [X] 사칙연산 기호가 아닌 경우 예외를 반환한다.
* [X] 두 숫자를 입력하면 사칙 연산을 수행한다.   
* [X] 입력 순서대로 계산한 결과를 반환한다.

# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 기능 요구사항
* [ ] 구입 금액을 입력한다.
* [X] 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급한다.(로또 1장의 가격은 1000원이다.)
* [ ] 로또 1장에는 1~45 사이의 숫자 6개가 랜덤으로 발급된다.
* [ ] 발급된 로또를 출력한다.
* [ ] 지난 주 당첨 번호를 입력한다.
* [ ] 3개~6개 일치하는 로또의 당첨 통계를 낸다.
* [ ] 로또 당첨 통계를 출력한다.
* [ ] 수익률을 구한다. (수익률 = (당첨금액*개수)의 합 / 구입금액 )
* [ ] 수익률을 출력한다.

### 테스트 목록
* [X] 로또 구입 금액을 입력하면 구입한 로또 개수를 반환한다.
* [ ] 숫자 6개가 포함된 로또 1개를 발급한다.
* [ ] 로또에서 당첨 번호가 일치하는 개수를 반환한다.
* [ ] 번호가 N개 일치하는 로또 개수를 반환한다. 
* [ ] 수익률을 계산한다. (수익률 = (당첨금액*개수)의 합 / 구입금액)

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)