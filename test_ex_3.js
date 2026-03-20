
function findmax(nums) {
    if (!nums || nums.length === 0)  {
        return null;
    }

    let maxNum = nums[0];

    for (let i = 1; i < nums.length; i++)  {
        if (nums[i] > maxNum) {
            maxNum = nums[i];
        }
    }
    return maxNum;
}

let nums = [3, 1, 4, 1, 5, 9];
console.log(findmax(nums)); // 9