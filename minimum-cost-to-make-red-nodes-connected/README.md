# Minimum Cost to Make Red Nodes Connected

Platform: LeetCode  
Difficulty: Medium  
Language: Java  
Problem Link: https://leetcode.com/problems/minimum-cost-to-make-red-nodes-connected/submissions/2194836227/  
Submitted At: 2026-11-12

---

## Description

<p>You are given an integer <code>n</code> representing a tree with <code>n</code> nodes, where the nodes are numbered from 0 to <code>n - 1</code> and the tree is <strong>rooted</strong> at node 0. The tree is represented by a 2D array <code>edges</code> of length <code>n - 1</code>, where <code>edges[i] = [u<sub>i</sub>, v<sub>i</sub>]</code> indicates an <strong>undirected</strong> edge between nodes <code>u<sub>i</sub></code> and <code>v<sub>i</sub></code>.</p>

<p>You are also given a string <code>colors</code> of length <code>n</code>, where <code>colors[i]</code> represents the color of node <code>i</code>: <code>'R'</code> if it is Red, or <code>'B'</code> if it is Blue.</p>

<p>You may <strong>flip</strong> the color of any node: from <code>'R'</code> to <code>'B'</code>, or from <code>'B'</code> to <code>'R'</code>. Flipping node <code>u</code> incurs a cost equal to the size of the <span data-keyword="subtree" class=" cursor-pointer relative text-dark-blue-s text-sm"></span> of node <code>u</code>.</p>

<p>Your goal is to perform flips so the <strong>Red</strong> nodes form a <strong>single</strong> <strong>connected</strong> <strong>component</strong> in the tree. Blue nodes may be disconnected. A configuration with no Red nodes is also considered valid.</p>

<p>Return the <strong>minimum total cost</strong> required to achieve this.</p>

<p>&nbsp;</p>
<p><span class="float-right -my-0.5 ml-2 inline-flex select-none items-center" data-example-lang-controls=""><span role="group" class="inline-flex h-6 items-center rounded-sd-md bg-sd-muted p-0.5" data-example-lang-toggle=""></span></span><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">n = 3, colors = "RBR", edges = [[0,1],[1,2]]</span></p>

<p><strong>Output:</strong> <span class="example-io">1</span></p>

<p><strong>Explanation:</strong></p>

<p><img src="https://assets.leetcode.com/uploads/2026/07/10/screenshot-2026-07-11-at-33714am.png" style="height: 60px; width: 237px;"></p>

<ul>
	<li>There are two Red nodes (0 and 2) that are not connected to each other.</li>
	<li>We can flip node 2 from <code>'R'</code> (Red) to <code>'B'</code> (Blue). The subtree size of node 2 is 1, so the cost is 1.</li>
	<li>After this flip only node 0 remains Red, forming exactly one connected Red component.</li>
</ul>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">n = 3, colors = "RBR", edges = [[0,1],[0,2]]</span></p>

<p><strong>Output:</strong> <span class="example-io">0</span></p>

<p><strong>Explanation:</strong>​​​​​​​</p>

<p><img src="https://assets.leetcode.com/uploads/2026/07/10/screenshot-2026-07-11-at-33754am.png" style="width: 214px; height: 150px;"></p>

<ul>
	<li>There are two Red nodes (0 and 2) that are already connected to each other.</li>
	<li>No flips are needed since all Red nodes already form a single connected group. Thus, the minimum total cost is 0.</li>
</ul>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">n = 4, colors = "BRRR", edges = [[0,1],[0,2],[0,3]]</span></p>

<p><strong>Output:</strong> <span class="example-io">2</span></p>

<p><strong>Explanation:</strong>​​​​​​​</p>

<p><img src="https://assets.leetcode.com/uploads/2026/07/10/screenshot-2026-07-11-at-33832am.png" style="width: 242px; height: 150px;"></p>

<ul>
	<li>There are three Red nodes (1, 2 and 3), which are not connected to each other.</li>
	<li>All three Red nodes are leaves and are disconnected from one another.</li>
	<li>To obtain a single Red group, we keep one Red leaf and flip the other two to Blue.</li>
	<li>Each leaf subtree size is 1, so flipping any two costs 2.</li>
</ul>
</div>

<p><strong class="example">Example 4:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">n = 3, colors = "BBB", edges = [[0,1],[1,2]]</span></p>

<p><strong>Output:</strong> <span class="example-io">0</span></p>

<p><strong>Explanation:</strong></p>

<p><strong>​​​​​​​</strong><img src="https://assets.leetcode.com/uploads/2026/07/10/screenshot-2026-07-11-at-33900am.png" style="width: 277px; height: 55px;"></p>

<ul>
	<li>All nodes are Blue, so there are no Red nodes.</li>
	<li>An empty Red group is considered a single connected group, so this state is already valid. Thus, the cost is 0.</li>
</ul>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong>​​​​​​​</p>

<ul>
	<li><code>1 &lt;= n &lt;= 10<sup>5</sup></code></li>
	<li><code>n == colors.length</code></li>
	<li><code>colors[i]</code> is either <code>'R'</code> or <code>'B'</code>.</li>
	<li><code>edges.length == n - 1</code></li>
	<li><code>edges[i] =&nbsp;[u<sub>i</sub>, v<sub>i</sub>]</code></li>
	<li><code>0 &lt;= u<sub>i</sub>, v<sub>i</sub> &lt;= n - 1</code></li>
	<li>The input is generated such that <code>edges</code> represents a valid tree.</li>
</ul>
