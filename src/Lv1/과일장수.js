function solution(k, m, score) {
  var answer = 0;
  score.sort((a, b) => b - a);
  for (let i = m; i <= score.length; i = i + m) {
    answer += score[i - 1] * m;
  }
  return answer;
}
