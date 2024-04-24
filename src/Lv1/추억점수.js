function solution(name, yearning, photo) {
  var answer = [];
  let obj = new Object();
  for (let i in name) {
    obj[name[i]] = yearning[i];
  }
  photo.forEach((ar) => {
    let sum = 0;
    ar.forEach((i) => {
      if (name.includes(i)) {
        sum += obj[i];
      }
    });
    answer.push(sum);
  });
  return answer;
}
