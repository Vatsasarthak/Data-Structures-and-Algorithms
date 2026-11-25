# Smallest Unique Subarray

Platform: LeetCode  
Difficulty: Hard  
Language: Java  
Problem Link: https://leetcode.com/problems/smallest-unique-subarray/submissions/2203293780/?envType=daily-question&envId=2026-11-25  
Submitted At: 2026-11-25

---

## Description

<p>You are given an integer array <code>nums</code>.</p>

<p>Find the <strong>minimum </strong>length of a <span data-keyword="subarray" class=" cursor-pointer relative text-dark-blue-s text-sm"></span> that is <strong>not</strong> <strong>identical</strong> to any other <strong>subarray</strong> in <code>nums</code>.</p>

<p>Return an integer denoting the <strong>minimum possible length</strong> of such a <strong>subarray</strong>.</p>

<p>Two <strong>subarrays</strong> are considered identical if they have the same length and the same elements in corresponding positions.</p>

<p>&nbsp;</p>
<p><span class="float-right -my-0.5 ml-2 inline-flex select-none items-center" data-example-lang-controls=""><span role="group" class="inline-flex h-6 items-center rounded-sd-md bg-sd-muted p-0.5" data-example-lang-toggle=""></span></span><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">nums = [3,3,3]</span></p>

<p><strong>Output:</strong> <span class="example-io">3</span></p>

<p><strong>Explanation:</strong></p>

<ul>
	<li>Subarrays of length 1: <code>[3]</code> → appears 3 times</li>
	<li>Subarrays of length 2: <code>[3, 3]</code> → appears 2 times</li>
	<li>Subarrays of length 3: <code>[3, 3, 3]</code> → appears once</li>
</ul>

<p>The subarray <code>[3, 3, 3]</code> is unique, so the smallest unique subarray length is 3.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">nums = [2,1,2,3,3]</span></p>

<p><strong>Output:</strong> <span class="example-io">1</span></p>

<p><strong>Explanation:</strong></p>

<p>Subarrays of length 1:</p>

<ul>
	<li><code>[2]</code> → appears 2 times</li>
	<li><code>[1]</code> → appears once</li>
	<li><code>[3]</code> → appears 2 times</li>
</ul>
The subarray <code>[1]</code> is unique, so the smallest unique subarray length is 1.</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">nums = [1,1,2,2,1]</span></p>

<p><strong>Output:</strong> <span class="example-io">2</span></p>

<p><strong>Explanation:</strong></p>

<p>Subarrays of length 1:</p>

<ul>
	<li><code>[1]</code> → appears 3 times</li>
	<li><code>[2]</code> → appears 2 times</li>
</ul>

<p>Subarrays of length 2:</p>

<ul>
	<li><code>[1, 1]</code> → appears once</li>
	<li><code>[1, 2]</code> → appears once</li>
	<li><code>[2, 2]</code> → appears once</li>
	<li><code>[2, 1]</code> → appears once</li>
</ul>
There is at least one subarray of length 2 that is unique, so the smallest unique subarray length is 2.</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>1 &lt;= nums[i] &lt;= 10<sup>5</sup></code></li>
</ul>
