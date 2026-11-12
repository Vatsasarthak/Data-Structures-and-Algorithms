# Count Valid Substrings I

Platform: LeetCode  
Difficulty: Medium  
Language: Java  
Problem Link: https://leetcode.com/problems/count-valid-substrings-i/submissions/2194837215/  
Submitted At: 2026-11-12

---

## Description

<p>You are given a string <code>s</code> consisting only of the characters <code>'a'</code>, <code>'b'</code>, and <code>'c'</code>.</p>

<p>A string is called <strong>valid</strong> if it does not contain <code>"abc"</code> as a <strong><span data-keyword="substring-nonempty" class=" cursor-pointer relative text-dark-blue-s text-sm"></span></strong>.</p>

<p>Return the number of <strong>valid substrings</strong> in <code>s</code>. Substrings with different starting or ending indices are counted separately.</p>

<p>&nbsp;</p>
<p><span class="float-right -my-0.5 ml-2 inline-flex select-none items-center" data-example-lang-controls=""><span role="group" class="inline-flex h-6 items-center rounded-sd-md bg-sd-muted p-0.5" data-example-lang-toggle=""></span></span><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = "abac"</span></p>

<p><strong>Output:</strong> <span class="example-io">10</span></p>

<p><strong>Explanation:</strong></p>

<p>The following substrings don't contain <code>"abc"</code>​​​​​​​ as a substring:</p>

<ul>
	<li><code>s[0..0] = "a"</code></li>
	<li><code>s[0..1] = "ab"</code></li>
	<li><code>s[0..2] = "aba"</code></li>
	<li><code>s[0..3] = "abac"</code>​​​​​​​</li>
	<li><code>s[1..1] = "b"</code></li>
	<li><code>s[1..2] = "ba"</code></li>
	<li><code>s[1..3] = "bac"</code></li>
	<li><code>s[2..2] = "a"</code></li>
	<li><code>s[2..3] = "ac"</code></li>
	<li><code>s[3..3] = "c"</code></li>
</ul>

<p>Thus, the answer is 10.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = "abc"</span></p>

<p><strong>Output:</strong> <span class="example-io">5</span></p>

<p><strong>Explanation:</strong></p>

<p>The following substrings don't contain <code>"abc"</code>​​​​​​​ as a substring:</p>

<ul>
	<li><code>s[0..0] = "a"</code></li>
	<li><code>s[0..1] = "ab"</code></li>
	<li><code>s[1..1] = "b"</code></li>
	<li><code>s[1..2] = "bc"</code></li>
	<li><code>s[2..2] = "c"</code>​​​​​​​</li>
</ul>

<p>Thus, the answer is 5.</p>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = "ac"</span></p>

<p><strong>Output:</strong> <span class="example-io">3</span></p>

<p><strong>Explanation:</strong></p>

<p>All substrings in <code>s</code> don't contain <code>"abc"</code> as a substring​​​​​​​. Thus, the answer is 3.</p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 10<sup>5</sup></code>​​​​​​​</li>
	<li><code>s</code> only consists of <code>'a'</code>, <code>'b'</code>, and <code>'c'</code> characters.</li>
</ul>
