<h1> 자동차 경주</h1>
> 간단한 자동차 경주 게임을 구현한다.


<b>STEP. 1</b>
1) 기능 요구 사항
주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지 입력할 수 있어야 한다.
전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.
2) 프로그래밍 요구 사항
메소드가 너무 많은 일을 하지 않도록 분리하기 위해 노력해 본다.
else 예약어를 쓰지 않는다.
모든 로직에 단위 테스트를 구현한다. 단, UI(System.out, System.in) 로직은 제외
3) 실행 결과
위 요구사항에 따라 3대의 자동차가 5번 움직였을 경우 프로그램을 실행한 결과는 다음과 같다.<br/>
<br/>
자동차 대수는 몇 대 인가요?<br/>
3<br/>
시도할 회수는 몇 회 인가요?<br/>
5<br/>

```


실행 결과
-
-
-

--
-
--

---
--
---

----
---
----

----
----
-----

```


4) 힌트
else 예약어를 쓰지 않는다. - 다음 코드와 같이 바로 return 문을 사용하면 된다.
```java

  public int add(String text) {
      if (text == null || text.isEmpty()) {
          return 0;
      }

      return Integer.parseInt(text);
  }
```

모든 로직에 단위 테스트를 구현한다. 단, UI(System.out, System.in) 로직은 제외
핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.
랜덤 값은 자바 java.util.Random 클래스의 nextInt(10) 메소드를 활용한다.
기본 뼈대 클래스는 다음 코드로부터 시작할 수 있다. 배열을 사용하는 것이 싫다면 ArrayList를 사용하는 것도 좋은 방법이다.

```java
public class RacingGame {
  private int time;
  private int[] carPositions = {0, 0, 0};

  public int[] move() {
    // TODO 구현
  }
}
```
