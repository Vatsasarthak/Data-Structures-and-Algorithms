# Maximum Manhattan Distance After All Moves

Platform: LeetCode  
Difficulty: Medium  
Language: Choose a type  
Problem Link: https://leetcode.com/problems/maximum-manhattan-distance-after-all-moves/submissions/2041618410/  
Submitted At: 2026-06-22

---

## Description

<p>You are given a string <code>moves</code> consisting of the characters <code>'U'</code>, <code>'D'</code>, <code>'L'</code>, <code>'R'</code>, and <code>'_'</code>.</p>

<p>Starting from the origin <code>(0, 0)</code>, each character represents one move on a 2D plane:</p>

<ul>
	<li><code>'U'</code>: Move up by 1 unit.</li>
	<li><code>'D'</code>: Move down by 1 unit.</li>
	<li><code>'L'</code>: Move left by 1 unit.</li>
	<li><code>'R'</code>: Move right by 1 unit.</li>
	<li><code>'_'</code>: Can be independently replaced with any one of <code>'U'</code>, <code>'D'</code>, <code>'L'</code>, or <code>'R'</code>.</li>
</ul>

<p>Return the maximum <span data-keyword="manhattan-distance" class=" cursor-pointer relative text-dark-blue-s text-sm"></span> from the origin that can be achieved after all moves have been performed.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">moves = "L_D_"</span></p>

<p><strong>Output:</strong> <span class="example-io">4</span></p>

<p><strong>Explanation:</strong></p>

<p>One optimal choice is:</p>

<ul>
	<li><code>'L'</code>: <code>(0, 0) -&gt; (-1, 0)</code></li>
	<li><code>'_'</code> treated as <code>'D'</code>: <code>(-1, 0) -&gt; (-1, -1)</code></li>
	<li><code>'D'</code>: <code>(-1, -1) -&gt; (-1, -2)</code></li>
	<li><code>'_'</code> treated as <code>'L'</code>: <code>(-1, -2) -&gt; (-2, -2)</code></li>
</ul>

<p>The final Manhattan distance from the origin is <code>|0 - (-2)| + |0 - (-2)| = 4</code>.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">moves = "U_R"</span></p>

<p><strong>Output:</strong> <span class="example-io">3</span></p>

<p><strong>Explanation:</strong></p>

<p>One optimal choice is:</p>

<ul>
	<li><code>'U'</code>: <code>(0, 0) -&gt; (0, 1)</code></li>
	<li><code>'_'</code> treated as <code>'U'</code>: <code>(0, 1) -&gt; (0, 2)</code></li>
	<li><code>'R'</code>: <code>(0, 2) -&gt; (1, 2)</code></li>
</ul>

<p>The final Manhattan distance from the origin is <code>|0 - 1| + |0 - 2| = 3</code>.</p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= moves.length &lt;= 10<sup>5</sup></code></li>
	<li><code>moves</code> consists of only <code>'U'</code>, <code>'D'</code>, <code>'L'</code>, <code>'R'</code>, and <code>'_'</code>.</li>
</ul>
