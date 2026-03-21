function isValid(s) {
    const stack = [];

    const pairs = {
        '(': ')',
        '{': '}',
        '[': ']'
    };

    for (let c of s) {
        if (pairs[c]) {
            stack.push(c);
        } else {
            if (!stack.length) return false;

            const last = stack.pop();
            if (pairs[last] !== c) return false;
        }
    }

    return stack.length === 0;
}