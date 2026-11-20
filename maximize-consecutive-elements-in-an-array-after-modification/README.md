# Maximize Consecutive Elements in an Array After Modification

Platform: LeetCode  
Difficulty: Hard  
Language: Java  
Problem Link: https://leetcode.com/problems/maximize-consecutive-elements-in-an-array-after-modification/submissions/2200123372/?envType=daily-question&envId=2026-11-20  
Submitted At: 2026-11-20

---

## Description

<p>You are given a <strong>0-indexed</strong> array <code>nums</code> consisting of <strong>positive</strong> integers.</p>

<p>Initially, you can increase the value of <strong>any</strong> element in the array by <strong>at most</strong> <code>1</code>.</p>

<p>After that, you need to select <strong>one or more</strong> elements from the final array such that those elements are <strong>consecutive</strong> when sorted in increasing order. For example, the elements <code>[3, 4, 5]</code> are consecutive while <code>[3, 4, 6]</code> and <code>[1, 1, 2, 3]</code> are not.</p>

<p>Return <em>the <strong>maximum</strong> number of elements that you can select</em>.</p>

<p>&nbsp;</p>
<p><span class="float-right -my-0.5 ml-2 inline-flex select-none items-center" data-example-lang-controls=""><span role="group" class="inline-flex h-6 items-center rounded-sd-md bg-sd-muted p-0.5" data-example-lang-toggle=""></span></span><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [2,1,5,1,1]
<strong>Output:</strong> 3
<strong>Explanation:</strong> We can increase the elements at indices 0 and 3. The resulting array is nums = [3,1,5,2,1].
We select the elements [<u><strong>3</strong></u>,<u><strong>1</strong></u>,5,<u><strong>2</strong></u>,1] and we sort them to obtain [1,2,3], which are consecutive.
It can be shown that we cannot select more than 3 consecutive elements.</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [1,4,7,10]
<strong>Output:</strong> 1
<strong>Explanation:</strong> The maximum consecutive elements that we can select is 1.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>1 &lt;= nums[i] &lt;= 10<sup>6</sup></code></li>
</ul>
