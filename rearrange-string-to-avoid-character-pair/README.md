# Rearrange String to Avoid Character Pair

Platform: LeetCode  
Difficulty: Easy  
Language: Choose a type  
Problem Link: https://leetcode.com/problems/rearrange-string-to-avoid-character-pair/submissions/2077261819/  
Submitted At: 2026-07-22

---

## Description

<p>You are given a string <code>s</code> and two distinct lowercase English letters <code>x</code> and <code>y</code>.</p>

<p>Rearrange the characters of <code>s</code> to construct a new string <code>t</code> such that:</p>

<ul>
	<li><code>t</code> is a <span data-keyword="permutation-string" class=" cursor-pointer relative text-dark-blue-s text-sm"></span> of <code>s</code>.</li>
	<li>Every occurrence of <code>y</code> appears before every occurrence of <code>x</code> in <code>t</code>.</li>
</ul>

<p>Return any valid string <code>t</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = "aabc", x = "a", y = "c"</span></p>

<p><strong>Output:</strong> <span class="example-io">"cbaa"</span></p>

<p><strong>Explanation:</strong></p>

<p>The string <code>"cbaa"</code> is a permutation of <code>"aabc"</code>, and every occurrence of <code>'c'</code> appears before every occurrence of <code>'a'</code>.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = "dcab", x = "d", y = "b"</span></p>

<p><strong>Output:</strong> <span class="example-io">"cabd"</span></p>

<p><strong>Explanation:</strong></p>

<p>The string <code>"cabd"</code> is a permutation of <code>"dcab"</code>, and every occurrence of <code>'b'</code> appears before every occurrence of <code>'d'</code>.</p>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = "axe", x = "o", y = "x"</span></p>

<p><strong>Output:</strong> <span class="example-io">"axe"</span></p>

<p><strong>Explanation:</strong></p>

<p>The string <code>"axe"</code> is already valid. Since <code>'o'</code> does not occur in the string, the required condition is automatically satisfied.</p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 100</code></li>
	<li><code>s</code> consists of lowercase English letters.</li>
	<li><code>x</code> and <code>y</code> are lowercase English letters.</li>
	<li><code>x != y</code></li>
</ul>
