function countOccurrences(nums) {
    const map = {};

    for (let num of nums) {
        if (map[num]) {
            map[num]++;
        } else {
            map[num] = 1;
        }
    }

    return map;
}

let nums = [1, 2, 2, 3, 1, 1];
console.log(countOccurrences(nums));