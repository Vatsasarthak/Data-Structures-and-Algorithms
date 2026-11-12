# Repeated String Match II

Platform: LeetCode  
Difficulty: Hard  
Language: Java  
Problem Link: https://leetcode.com/problems/repeated-string-match-ii/submissions/2194839155/  
Submitted At: 2026-11-12

---

## Description

<p>You are given two strings <code>a</code> and <code>b</code> consisting of lowercase English letters, and two integers <code>x</code> and <code>y</code>.</p>

<p>Return <code>true</code> if the string formed by repeating <code>b</code> <strong>exactly</strong> <code>y</code> times (<code>b * y</code>) is a <strong><span data-keyword="substring-nonempty" class=" cursor-pointer relative text-dark-blue-s text-sm"></span></strong> of the string formed by repeating <code>a</code> <strong>exactly</strong> <code>x</code> times (<code>a * x</code>). Otherwise, return <code>false</code>.</p>

<p>&nbsp;</p>
<p><span class="float-right -my-0.5 ml-2 inline-flex select-none items-center" data-example-lang-controls=""><span role="group" class="inline-flex h-6 items-center rounded-sd-md bg-sd-muted p-0.5" data-example-lang-toggle=""></span></span><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">a = "ab", b = "abab", x = 2, y = 1</span></p>

<p><strong>Output:</strong> <span class="example-io">true</span></p>

<p><strong>Explanation:</strong></p>

<ul>
	<li><code>a * x = "ab" * 2 = "abab"</code></li>
	<li><code>b * y = "abab" * 1 = "abab"</code></li>
	<li>They are identical, so <code>b * y</code> is a substring of <code>a * x</code>. Thus, the answer is <code>true</code>.</li>
</ul>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">a = "abc", b = "bc", x = 2, y = 3</span></p>

<p><strong>Output:</strong> <span class="example-io">false</span></p>

<p><strong>Explanation:</strong></p>

<ul>
	<li><code>a * x = "abc" * 2 = "abcabc"</code></li>
	<li><code>b * y = "bc" * 3 = "bcbcbc"</code></li>
	<li>The answer is <code>false</code> as <code>b * y = "bcbcbc"</code> is not a substring of <code>a * x = "abcabc"</code>.</li>
</ul>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">a = "abcd", b = "cdab", x = 2, y = 1</span></p>

<p><strong>Output:</strong> <span class="example-io">true</span></p>

<p><strong>Explanation:</strong></p>

<ul>
	<li><code>a * x = "abcd" * 2 = "abcdabcd"</code></li>
	<li><code>b * y = "cdab"</code> appears in <code>a * x = "abcdabcd"</code> at indices <code>[2..5]</code>. Thus, the answer is <code>true</code>.</li>
</ul>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= a.length &lt;= 100</code></li>
	<li><code>1 &lt;= b.length &lt;= 100</code></li>
	<li><code>1 &lt;= x &lt;= 10<sup>9</sup></code></li>
	<li><code>1 &lt;= y &lt;= 10<sup>9</sup></code>​​​​​​​</li>
	<li><code>a</code> and <code>b</code> consist of lowercase English letters.</li>
</ul>
