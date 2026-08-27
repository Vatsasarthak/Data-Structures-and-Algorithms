# Generate Parentheses

Platform: GeeksforGeeks  
Difficulty: Medium  
Language: unknown  
Problem Link: https://www.geeksforgeeks.org/problems/generate-all-possible-parentheses/1  
Submitted At: 2026-08-27

---

## Description

<p><span style="font-size: 14pt;">Given a number <strong>n</strong>, return all the combinations of balanced parentheses of length n.</span><br><span style="font-size: 14pt;"><strong>Note:</strong> A sequence of parentheses is <strong>balanced</strong> if every opening bracket has a corresponding closing bracket in the <strong>correct order</strong>.</span><br><span style="font-size: 14pt;">For example, "(())", "()()", and "(()())" are balanced, whereas ")()(", "))((", and "()))" are not.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input</strong>: n = 6
<strong>Output: </strong>["((()))", "(()())", "(())()", "()(())", "()()()"]<br><strong>Explanation:</strong> These are the only possible valid balanced parentheses.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input</strong>: n = 4
<strong>Output: </strong>["(())", "()()"]<br><strong>Explanation:</strong> These are the only possible valid balanced parentheses.</span></pre>
<div><span style="font-size: 14pt;"><strong>Constraints: </strong></span><br><span style="font-size: 14pt;">1 ≤ n ≤ 16</span></div>
<div><span style="font-size: 14pt;">n % 2 == 0</span></div>
