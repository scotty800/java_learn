
function twoSum(nums, target) {
    const map = new Map();

    for (let i = 0; i < nums.length; i++) {
        const num = nums[i];
        const complement = target - num;

        if (map.has(complement)) {
            return [map.get(complement), i];
        }
        map.set(num, i);
    }
    return null;
}

let nums = [2, 7, 11, 15];
let target = 9;
console.log(twoSum(nums, target)); // [0, 1]