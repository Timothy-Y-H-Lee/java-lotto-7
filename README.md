# java-lotto-precourse

# 기능목록
1. 상수값들(사용자에게 보여주는 메시지들을 담은 enum)을 정의한다.
2. 로또 발매기의 로또 번호생성, 저장 및 발매
>- 중복되지 않는 6개의 숫자 생성 및 오름차순으로 저장
>- 1개의 보너스 번호 저장
>- 보너스 번호를 입력받아서 검증
>- 로또 구입 금액만큼 로또를 발행
3. MVC 모델의 View를 이용하여, 추첨자의 입력값 처리
-  inputView를 통해서 추첨자의 당첨번호 입력
> - inputView로 추첨자의 당첨번호 입력
> - 로또 구입 금액을 입력받아서 검증
> - MVC 패턴으로 보너스 번호 입력값 받기
> - 추첨자의 당첨번호와 보너스 번호 입력값에 대한 테스트 케이스 작성
> - 추첨자의 로또 당첨 번호 6개를 입력받아서 검증
> - 추첨자의 보너스 번호 1개 입력받아서 저장

-  outputView로 출력
> - 로또 구입 금액을 입력에 따른 구매 내역 출력

4. 입력값 검증 테스트
- 로또 구입 금액을 입력받아서 검증
> - InputView에서 로또 구입 금액을 받아서 LottoController로 전달
> - 로또 발행 시, 구입 금액만큼 로또 발행
> - "구매_금액_테스트" Test case의 @Disable 해제 및 테스트

- outputView로 출력
> - "n개를 구매했습니다."
> - 로또 구입 금액에 따른 구매 내역 출력(발행한 로또 수량 및 번호를 출력한다. 로또 번호는 오름차순으로 정렬하여 보여준다.)

- LottoTest 클래스의 테스트 통과 체크

- 추첨자의 로또 당첨 번호 6개를 입력받아서 검증
> - "잘못된_당첨_번호_형식" Test case
> - "당첨_번호_개수_잘못_입력" Test case
> - "당첨_번호_입력_개수_체크" Test case

- 추첨자의 보너스 번호 입력값 1개를 입력받아서 검증
> - MVC 패턴으로 보너스 번호 입력값 받기
> - 추첨자의 보너스 번호 1개 입력받아서 저장

5. 사용자의 입력값과 추첨자의 입력값을 서로 비교 및 결과 처리