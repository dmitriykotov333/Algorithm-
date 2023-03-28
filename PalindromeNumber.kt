 fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false

        var rst = 0
        var value = x
        while (value != 0) {
            rst = rst * 10 + value % 10
            value /= 10
        }
        return rst == x
    }
