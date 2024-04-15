function solution(t, p) {
  var answer = 0;
  for (i = 0; i < t.length - (p.length - 1); i++) {
    if (+p >= +t.slice(i, i + p.length)) {
      // "1" 앞에 +를 붙여주면 number 타입
      answer += 1;
    }
  }
  return answer;
}
