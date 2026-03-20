
function voyelles(s) {
    let count = 0;
    let voyelles = "aeiouy";

    for (let i = 0; i < s.length; i++) {
        let c = s[i];

        if (voyelles.includes(c)) {
            count++;
        }
    }
    return count;
}

let s = "hello world";
console.log(voyelles(s));