class Solution:
    def maxProduct(self, words: List[str]) -> int:
        ans = 0
        n = len(words)
        binary_rep = [0]*n
        for i in range(n):
            curr_word = words[i]
            for letter in curr_word:
                binary_rep[i] = binary_rep[i] | (1<<(ord(letter)-ord('a')))
            for j in range(i):
                if binary_rep[i] & binary_rep[j] == 0:
                    ans = max(ans, len(words[i])*len(words[j]))
        return ans
