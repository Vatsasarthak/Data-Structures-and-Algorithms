# Find Mismatched Segments Between Two Strings

Platform: LeetCode  
Difficulty: Medium  
Language: Java  
Problem Link: https://leetcode.com/problems/find-mismatched-segments-between-two-strings/submissions/2194835326/  
Submitted At: 2026-11-12

---

## Description

<p>You are given two strings <code>s1</code> and <code>s2</code> of the same length.</p>

<p>A <strong>mismatched segment</strong> is a <strong>maximal contiguous</strong> range of indices where the characters of <code>s1</code> and <code>s2</code> differ at every index.</p>

<p>Return a 2D array containing <code>[sub1, sub2]</code> for each mismatched segment, where <code>sub1</code> and <code>sub2</code> are the corresponding <strong><span data-keyword="substring-nonempty" class=" cursor-pointer relative text-dark-blue-s text-sm"></span></strong> from <code>s1</code> and <code>s2</code>, respectively. Return the segments in <strong>increasing</strong> order of their starting indices. If there are no mismatched segments, return an empty array.</p>

<p>&nbsp;</p>
<p><span class="float-right -my-0.5 ml-2 inline-flex select-none items-center" data-example-lang-controls=""><span role="group" class="inline-flex h-6 items-center rounded-sd-md bg-sd-muted p-0.5" data-example-lang-toggle=""></span></span><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s1 = "earth", s2 = "empty"</span></p>

<p><strong>Output:</strong> <span class="example-io">[["ar","mp"],["h","y"]]</span></p>

<p><strong>Explanation:</strong></p>

<ul>
	<li>The characters at indices 1 and 2 differ, forming the mismatched segment <code>["ar","mp"]</code>.</li>
	<li>The characters at index 4 differ, forming the mismatched segment <code>["h","y"]</code>.</li>
</ul>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s1 = "action", s2 = "nation"</span></p>

<p><strong>Output:</strong> <span class="example-io">[["ac","na"]]</span></p>

<p><strong>Explanation:</strong></p>

<p>The characters at indices 0 and 1 differ, forming the mismatched segment <code>["ac","na"]</code>. All remaining characters are equal in both strings.</p>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s1 = "hot", s2 = "hot"</span></p>

<p><strong>Output:</strong> <span class="example-io">[]</span></p>

<p><strong>Explanation:</strong></p>

<p>The two strings are identical, so there are no mismatched segments.</p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s1.length == s2.length &lt;= 100</code></li>
	<li><code>s1</code> and <code>s2</code> consist of lowercase English letters.</li>
</ul>
