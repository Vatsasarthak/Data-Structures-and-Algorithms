# CFRTEST

Platform: CodeChef  
Difficulty: 1061  
Language: C++  
Problem Link: https://www.codechef.com/practice/course/arrays-strings-sorting/INTARR01/problems/CFRTEST  
Submitted At: 2026-11-05

---

## Description

<div class="_problemStatementWrapper_bh3c4_33"><div class="_problemBodyContent_bh3c4_71"><h3 class="notranslate">Devu and friendship testing</h3><p>
Devu has <b>n</b> weird friends. Its his birthday today, so they thought that this is the best occasion for testing their friendship with him. They put up conditions before Devu that they will break the friendship unless he gives them a grand party on their chosen day. Formally, <b>i</b><sup>th</sup> friend will break his friendship if he does not receive a grand party on <b>d<sub>i</sub></b><sup>th</sup> day.
</p>
<p>
Devu despite being as rich as Gatsby, is quite frugal and can give at most one grand party daily. Also, he wants to invite only one person in a party. So he just wonders what is the maximum number of friendships he can save. Please help Devu in this tough task !!
</p>
<h3>Input</h3>
<ul>
<li>The first line of the input contains an integer <b>T</b> denoting the number of test cases. The description of <b>T</b> test cases follows.</li>
<li>First line will contain a single integer denoting <b>n</b>.
</li><li>Second line will contain <b>n</b> space separated integers where <b>i</b><sup>th</sup> integer corresponds to the day <b>d<sub>i</sub></b><sup>th</sup> as given in the problem.</li>
</ul>
<h3>Output</h3>
<p>Print a single line corresponding to the answer of the problem.</p>
<h3>Constraints</h3>
<ul>
<li><b>1</b> ≤ <b>T</b> ≤ <b>10<sup>4</sup></b></li>
<li><b>1</b> ≤ <b>n</b> <b> ≤ 50</b></li>
<li><b>1</b> ≤ <b>d<sub>i</sub></b> <b>≤ 100</b></li>
</ul>
<h3 class="notranslate">Sample 1:</h3>
<div class="_input_output__table_bh3c4_231 notranslate"><div class="_text_copy__container_bh3c4_235"><div class="_text_copy_bh3c4_235 _input_top__box_bh3c4_248"><span>Input</span><div aria-label="Copy to clipboard" class="undefined css-1eiukdk" style="pointer-events: all;"><span class="_icon__box_10bs7_2 _dark_10bs7_27 undefined"><i class="_copy__icon_10bs7_14"></i></span></div></div><div class="_text_copy_bh3c4_235 _ouput_top__box_bh3c4_251"><span>Output</span><div aria-label="Copy to clipboard" class="undefined css-1eiukdk" style="pointer-events: all;"><span class="_icon__box_10bs7_2 _dark_10bs7_27 undefined"><i class="_copy__icon_10bs7_14"></i></span></div></div></div><div class="_values__container_bh3c4_254"><div class="_values_bh3c4_254"><pre>2
2
3 2
2
1 1</pre></div><div class="_values_bh3c4_254"><pre>2
1</pre></div></div></div>
<h3 class="notranslate">Explanation:</h3>
<div class="notranslate">
<p><b>Example case 1.</b> Devu can give party to second friend on day 2 and first friend on day 3, so he can save both his friendships.</p>
<p><b>Example case 2.</b> Both the friends want a party on day 1, and as the Devu can not afford more than one party a day, so he can save only one of the friendships, so answer is 1.</p>
</div><div></div></div></div>
