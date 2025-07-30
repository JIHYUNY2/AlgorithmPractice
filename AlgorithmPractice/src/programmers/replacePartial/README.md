# 📘 문자열 겹쳐쓰기 (프로그래머스 Lv. 0)

📅 데일리 알고리즘 연습 | 2025.07.30  
🔗 [문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181943)

---

## 📌 문제 설명

문자열 `my_string`, `overwrite_string`과 정수 `s`가 주어집니다.  
문자열 `my_string`의 인덱스 `s`부터 `overwrite_string`을 덮어쓴 문자열을 반환하세요.

---

## ✍️ 입력

- `my_string`: 길이 1 이상 1,000 이하인 문자열
- `overwrite_string`: 길이 1 이상 `my_string` 길이 이하인 문자열
- `s`: 0 이상 `my_string` 길이 - 1 이하인 정수

---

## ✅ 출력

- `my_string`의 인덱스 `s`부터 `overwrite_string`을 순서대로 덮어쓴 문자열을 반환합니다.

---

## 💡 입출력 예시

| my_string    | overwrite_string | s | 출력 결과     |
|--------------|------------------|---|----------------|
| "He11oWor1d" | "lloWorl"        | 2 | "HelloWorld"   |
| "Program29b8UYP" | "merS123"     | 7 | "ProgrammerS123" |

---

## 📝 메모

- 문자열을 자르기 위해 `substring()` 메서드를 사용할 수 있다.
- 문자열을 조합하는 순서는 다음과 같다:
  1. `my_string`의 앞부분 (0부터 s 전까지)
  2. `overwrite_string`
  3. `my_string`의 뒷부분 (s + overwrite_string.length()부터 끝까지)
- `StringBuilder` 또는 단순 문자열 덧셈으로도 구현 가능.

---