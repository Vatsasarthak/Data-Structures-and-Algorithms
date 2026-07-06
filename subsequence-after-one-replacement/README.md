# Subsequence After One Replacement

Platform: LeetCode  
Difficulty: Medium  
Language: Choose a type  
Problem Link: https://leetcode.com/problems/subsequence-after-one-replacement/submissions/2057419007/  
Submitted At: 2026-07-06

---

## Description

<p>You are given two strings <code>s</code> and <code>t</code> consisting of lowercase English letters.</p>

<p>You may choose <strong>at most</strong> one index in <code>s</code> and replace the character at that index with any lowercase English letter.</p>

<p>Return <code>true</code> if it is possible to make <code>s</code> a <span data-keyword="subsequence-string" class=" cursor-pointer relative text-dark-blue-s text-sm"></span> of <code>t</code>; otherwise, return <code>false</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = "cat", t = "chat"</span></p>

<p><strong>Output:</strong> <span class="example-io">true</span></p>

<p><strong>Explanation:</strong></p>

<ul>
	<li>Replace <code>s[1]</code> from <code>'a'</code> to <code>'h'</code>. The resulting string is <code>"cht"</code>.</li>
	<li><code>"cht"</code> is a subsequence of <code>"chat"</code> because we can match <code>'c'</code>, <code>'h'</code>, and <code>'t'</code> in order.</li>
</ul>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = "plane", t = "apple"</span></p>

<p><strong>Output:</strong> <span class="example-io">false</span></p>

<p><strong>Explanation:</strong></p>

<ul>
	<li>The characters <code>'p'</code>, <code>'l'</code>, and <code>'e'</code> can be matched in <code>t</code>, but the remaining characters cannot be matched while preserving the required order.</li>
	<li>Even after replacing any one character in <code>s</code>, it is impossible to make <code>s</code> a subsequence of <code>t</code>.</li>
</ul>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length, t.length &lt;= 10<sup>5</sup></code></li>
	<li><code>s</code> and <code>t</code> consist only of lowercase English letters.</li>
</ul>
