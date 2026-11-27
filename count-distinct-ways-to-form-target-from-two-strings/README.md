# Count Distinct Ways to Form Target from Two Strings

Platform: LeetCode  
Difficulty: Hard  
Language: Java  
Problem Link: https://leetcode.com/problems/count-distinct-ways-to-form-target-from-two-strings/submissions/2204748661/  
Submitted At: 2026-11-27

---

## Description

<p>You are given three strings <code>word1</code>, <code>word2</code>, and <code>target</code>.</p>

<p>Your task is to count the number of ways to form <code>target</code> by choosing characters from <code>word1</code> and <code>word2</code> under the following conditions:</p>

<ul>
	<li>For each character of <code>target</code>, choose one matching character from either <code>word1</code> or <code>word2</code>.</li>
	<li>The chosen indices from <code>word1</code> must be <strong>strictly</strong> increasing.</li>
	<li>The chosen indices from <code>word2</code> must be <strong>strictly</strong> increasing.</li>
	<li><strong>At least</strong> one character must be chosen from <strong>both</strong> <code>word1</code> and <code>word2</code>.</li>
</ul>

<p>Two ways are considered different if, for <strong>at least</strong> one position in <code>target</code>, the chosen character comes from a different string or a different index.</p>

<p>Return the number of ways. Since the answer may be very large, return it <strong>modulo</strong> <code>10<sup>9</sup> + 7</code>.</p>

<p>&nbsp;</p>
<p><span class="float-right -my-0.5 ml-2 inline-flex select-none items-center" data-example-lang-controls=""><span role="group" class="inline-flex h-6 items-center rounded-sd-md bg-sd-muted p-0.5" data-example-lang-toggle=""></span></span><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">word1 = "abc", word2 = "bac", target = "abc"</span></p>

<p><strong>Output:</strong> <span class="example-io">5</span></p>

<p><strong>Explanation:</strong></p>

<p>There are 5 ways to form <code>target</code>:</p>

<ul>
	<li><code>word1[0] = 'a'</code>, <code>word1[1] = 'b'</code>, <code>word2[2] = 'c'</code></li>
	<li><code>word1[0] = 'a'</code>, <code>word2[0] = 'b'</code>, <code>word1[2] = 'c'</code></li>
	<li><code>word1[0] = 'a'</code>, <code>word2[0] = 'b'</code>, <code>word2[2] = 'c'</code></li>
	<li><code>word2[1] = 'a'</code>, <code>word1[1] = 'b'</code>, <code>word1[2] = 'c'</code></li>
	<li><code>word2[1] = 'a'</code>, <code>word1[1] = 'b'</code>, <code>word2[2] = 'c'</code></li>
</ul>

<p>All ways preserve the increasing index order inside each string and choose at least one character from each string.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">word1 = "cd", word2 = "cd", target = "ccd"</span></p>

<p><strong>Output:</strong> <span class="example-io">4</span></p>

<p><strong>Explanation:</strong></p>

<p>There are 4 ways to form <code>target</code>:</p>

<ul>
	<li><code>word1[0] = 'c'</code>, <code>word2[0] = 'c'</code>, <code>word1[1] = 'd'</code></li>
	<li><code>word1[0] = 'c'</code>, <code>word2[0] = 'c'</code>, <code>word2[1] = 'd'</code></li>
	<li><code>word2[0] = 'c'</code>, <code>word1[0] = 'c'</code>, <code>word1[1] = 'd'</code></li>
	<li><code>word2[0] = 'c'</code>, <code>word1[0] = 'c'</code>, <code>word2[1] = 'd'</code></li>
</ul>

<p>The first two <code>'c'</code> characters in <code>target</code> must come one from each string. The final <code>'d'</code> can be chosen from either string.</p>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">word1 = "xy", word2 = "xy", target = "xyxy"</span></p>

<p><strong>Output:</strong> <span class="example-io">2</span></p>

<p><strong>Explanation:</strong></p>

<p>There are 2 ways to form <code>target</code>:</p>

<ul>
	<li><code>word1[0] = 'x'</code>, <code>word1[1] = 'y'</code>, <code>word2[0] = 'x'</code>, <code>word2[1] = 'y'</code></li>
	<li><code>word2[0] = 'x'</code>, <code>word2[1] = 'y'</code>, <code>word1[0] = 'x'</code>, <code>word1[1] = 'y'</code></li>
</ul>

<p>Each <code>"xy"</code> part in <code>target</code> comes entirely from one string.</p>
</div>

<p><strong class="example">Example 4:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">word1 = "ab", word2 = "cde", target = "ace"</span></p>

<p><strong>Output:</strong> <span class="example-io">1</span></p>

<p><strong>Explanation:</strong></p>

<p>The only way is to choose <code>word1[0] = 'a'</code>, <code>word2[0] = 'c'</code>, and <code>word2[2] = 'e'</code>. Thus, the answer is 1.</p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= word1.length, word2.length, target.length &lt;= 100</code></li>
	<li><code>word1</code>, <code>word2</code>, and <code>target</code> consist of lowercase English letters only.</li>
</ul>
