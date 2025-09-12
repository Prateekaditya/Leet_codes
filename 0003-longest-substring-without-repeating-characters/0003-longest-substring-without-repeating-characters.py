class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        ans=""
        for i in range(len(s)):
            curr=""
            for j in range(i,len(s)):
                    if s[j] in curr:
                     break
                    curr+=s[j]
                    if len(curr)>len(ans):
                     ans=curr

        return len(ans) 