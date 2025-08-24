# 📘 카운트 업 (프로그래머스 Lv. 0)

📅 데일리 알고리즘 연습 | 2025.08.25  
🔗 [문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181920)

---

## 📌 문제 설명

정수 `start_num`과 `end_num`이 주어집니다.  
`start_num`부터 `end_num`까지 **1씩 증가**시키며 포함한 정수 배열을 반환하세요.

---

## ✍️ 입력

- 정수 `start_num`, `end_num` (`start_num ≤ end_num`)

---

## ✅ 출력

- `start_num`부터 `end_num`까지 순서대로 담은 정수 배열

---

## 💡 입출력 예시

| start_num | end_num | 결과             |
|-----------|---------|------------------|
| 3         | 10      | `[3,4,5,6,7,8,9,10]` |
| 5         | 5       | `[5]`            |

---

## 📝 메모

- 길이는 `end_num - start_num + 1`
- 단순 for 루프로 채우면 됨 (O(n))

---