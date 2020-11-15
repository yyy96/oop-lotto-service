# [로또 - TDD]

구현 아이디어 앞에 붙은 태그는 다음과 같은 의미를 가진다.

## 2단계 - 로또(자동)

### 기능 요구사항

- 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
- 로또 1장의 가격은 1000원이다.

### 구현 아이디어

- "구입 금액 / 로또 1장 가격" 만큼의 로또 갯수를 계산 한다.
- 입력받은 구입 금액이 숫자가 아니었을 경우에 대한 예외처리
- 입력받은 당첨번호가 6개의 숫자가 아니었을 경우에 대한 예외 처리
  - 숫자가 아니었을 때
  - 6개가 아니었을 때
- n개가 일치하는 함수에 대한 테스트
- n개 일치와 상금액을 enum 으로 연결
- 로또 자동 생성은 Collections.shuffle() 메소드 활용
- Collections.sort() 메소드를 활용해 정렬
- ArrayList의 contains() 메소드를 활용하면 어떤 값이 존재하는지 유무를 판단
- UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리
- 로또 숫자 하나는 int 타입이다. 이 숫자 하나를 추상화한 LottoNo 객체를 추가해 구현
- 당첨번호 객체 안에 6 사이즈 LottoNo arr를 넣고, 당첨번호 객체들을 일급 컬렉션으로 관리
- Optional을 적용해 NullPointerException이 발생하지 않도록 함