# OOPSFUND02J

Platform: CodeChef  
Difficulty: Practice  
Language: java  
Problem Link: https://www.codechef.com/practice/course/advanced-java/JAVAOOP/problems/OOPSFUND04  
Submitted At: 2026-11-26

---

## Description

<div class="_problemStatementWrapper_bh3c4_33"><div class="_problemBodyContent_bh3c4_71"><h3 class="notranslate">Drone Fleet Energy Management</h3><p>A drone delivery company operates a fleet of autonomous drones. Each drone has a unique ID and an available energy level.</p>
<p>The company needs an application to manage drone energy, execute delivery missions, simulate upgrades, and inspect deployment readiness.</p>
<p>Complete the provided Java classes and methods using Object-Oriented Programming concepts, including encapsulation, constructors, static members, and object creation.</p>
<p>The input/output handling code is already implemented and must not be modified.</p>
<h3>Tasks</h3>
<h3>1. Drone Class</h3>
<p>The <code>Drone</code> class contains the following private fields:</p>
<ul>
<li><code>id</code>: Unique identifier of the drone, of type <code>int</code>.</li>
<li><code>energy</code>: Current available energy, of type <code>long</code>.</li>
<li><code>created</code>: Static counter of type <code>int</code> tracking the number of <code>Drone</code> objects constructed.</li>
</ul>
<p>Implement the following methods:</p>





































<table><thead><tr><th style="text-align: left;">Method</th><th style="text-align: left;">Description</th></tr></thead><tbody><tr><td style="text-align: left;"><code>Drone(int id, long initialEnergy)</code></td><td style="text-align: left;">Initialize the drone and increment <code>created</code>.</td></tr><tr><td style="text-align: left;"><code>getId()</code></td><td style="text-align: left;">Return the drone ID.</td></tr><tr><td style="text-align: left;"><code>getEnergy()</code></td><td style="text-align: left;">Return its available energy.</td></tr><tr><td style="text-align: left;"><code>recharge(long amount)</code></td><td style="text-align: left;">Increase the drone's energy by <code>amount</code>.</td></tr><tr><td style="text-align: left;"><code>executeMission(long cost)</code></td><td style="text-align: left;">Deduct <code>cost</code> if sufficient energy exists and return <code>true</code>; otherwise return <code>false</code> without modifying energy.</td></tr><tr><td style="text-align: left;"><code>simulateUpgrade(long bonus)</code></td><td style="text-align: left;">Create and return a new <code>Drone</code> object with the same ID and energy increased by <code>bonus</code>, leaving the original unchanged.</td></tr><tr><td style="text-align: left;"><code>getCreated()</code></td><td style="text-align: left;">Return the total number of constructed <code>Drone</code> objects.</td></tr></tbody></table>
<p>The <code>created</code> field must be shared by all <code>Drone</code> objects.</p>
<p>The static counter includes initial drones and objects created by <code>simulateUpgrade()</code>. Each successful call to <code>simulateUpgrade()</code> creates exactly one additional object.</p>
<p>The counter does not decrease when an object becomes unreachable or is garbage-collected.</p>
<h3>2. FleetInspector Class</h3>
<p>Implement the following static methods in the <code>FleetInspector</code> class.</p>
<ul>
<li>
<p><strong><code>combinedEnergy(Drone a, Drone b)</code></strong><br>
Return the sum of the energy levels of the two drones using their public getter methods. If both arguments reference the same drone, count its energy twice.</p>
</li>
<li>
<p><strong><code>canDeploy(Drone drone, long minimum)</code></strong><br>
Return <code>true</code> if the drone's available energy is greater than or equal to <code>minimum</code>; otherwise return <code>false</code>. Access the drone's energy through its public <code>getEnergy()</code> method.</p>
</li>
</ul>
<div class="notranslate">
<h3>Input Format</h3>
<p>The first line contains two space-separated integers <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mi>N</mi></mrow><annotation encoding="application/x-tex">N</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6833em;"></span><span class="mord mathnormal" style="margin-right: 0.10903em;">N</span></span></span></span></span> and <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mi>Q</mi></mrow><annotation encoding="application/x-tex">Q</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.8778em; vertical-align: -0.1944em;"></span><span class="mord mathnormal">Q</span></span></span></span></span>, representing the number of initial drones and operations.</p>
<p>Each of the next <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mi>N</mi></mrow><annotation encoding="application/x-tex">N</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6833em;"></span><span class="mord mathnormal" style="margin-right: 0.10903em;">N</span></span></span></span></span> lines contains two space-separated integers <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mi>i</mi><mi>d</mi></mrow><annotation encoding="application/x-tex">id</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.6944em;"></span><span class="mord mathnormal">i</span><span class="mord mathnormal">d</span></span></span></span></span> and <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mi>e</mi><mi>n</mi><mi>e</mi><mi>r</mi><mi>g</mi><mi>y</mi></mrow><annotation encoding="application/x-tex">energy</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.625em; vertical-align: -0.1944em;"></span><span class="mord mathnormal">e</span><span class="mord mathnormal">n</span><span class="mord mathnormal" style="margin-right: 0.02778em;">er</span><span class="mord mathnormal" style="margin-right: 0.03588em;">g</span><span class="mord mathnormal" style="margin-right: 0.03588em;">y</span></span></span></span></span>.</p>
<p>Each of the following <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mi>Q</mi></mrow><annotation encoding="application/x-tex">Q</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.8778em; vertical-align: -0.1944em;"></span><span class="mord mathnormal">Q</span></span></span></span></span> lines contains one operation:</p>





































<table><thead><tr><th style="text-align: left;">Operation</th><th style="text-align: left;">Required Output</th></tr></thead><tbody><tr><td style="text-align: left;"><code>RECHARGE id amount</code></td><td style="text-align: left;">Updated energy</td></tr><tr><td style="text-align: left;"><code>MISSION id cost</code></td><td style="text-align: left;">Remaining energy or <code>LOW_ENERGY</code></td></tr><tr><td style="text-align: left;"><code>UPGRADE id bonus</code></td><td style="text-align: left;">Energy of the newly simulated drone</td></tr><tr><td style="text-align: left;"><code>PAIR id1 id2</code></td><td style="text-align: left;">Combined energy</td></tr><tr><td style="text-align: left;"><code>INSPECT id minimum</code></td><td style="text-align: left;"><code>READY</code> or <code>NOT_READY</code></td></tr><tr><td style="text-align: left;"><code>GET id</code></td><td style="text-align: left;">Current drone energy</td></tr><tr><td style="text-align: left;"><code>COUNT</code></td><td style="text-align: left;">Number of constructed drone objects</td></tr></tbody></table>
<p>All drone IDs referenced in operations are guaranteed to exist in the initial fleet.</p>
<p>An upgraded drone exists only for the <code>UPGRADE</code> operation and is not added to the original fleet. Its ID is the same as the original drone's ID.</p>
</div><div class="notranslate">
<h3>Output Format</h3>
<p>For each of the <span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mi>Q</mi></mrow><annotation encoding="application/x-tex">Q</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.8778em; vertical-align: -0.1944em;"></span><span class="mord mathnormal">Q</span></span></span></span></span> operations, print the result on a separate line:</p>
<ul>
<li><code>RECHARGE</code>: Print the updated energy of the drone.</li>
<li><code>MISSION</code>: Print the remaining energy if the mission succeeds; otherwise print <code>LOW_ENERGY</code>.</li>
<li><code>UPGRADE</code>: Print the energy of the newly created simulated drone.</li>
<li><code>PAIR</code>: Print the combined energy of the two drones.</li>
<li><code>INSPECT</code>: Print <code>READY</code> if the drone has at least the required energy; otherwise print <code>NOT_READY</code>.</li>
<li><code>GET</code>: Print the current energy of the specified drone.</li>
<li><code>COUNT</code>: Print the total number of constructed <code>Drone</code> objects.</li>
</ul>
</div>
<h3 class="notranslate">Constraints</h3>
<div class="_html_code__block_bh3c4_219 notranslate">
<ul>
<li><span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>1</mn><mo>≤</mo><mi>N</mi><mo>≤</mo><mn>200</mn></mrow><annotation encoding="application/x-tex">1 \le N \le 200</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.7804em; vertical-align: -0.136em;"></span><span class="mord">1</span><span class="mspace" style="margin-right: 0.2778em;"></span><span class="mrel">≤</span><span class="mspace" style="margin-right: 0.2778em;"></span></span><span class="base"><span class="strut" style="height: 0.8193em; vertical-align: -0.136em;"></span><span class="mord mathnormal" style="margin-right: 0.10903em;">N</span><span class="mspace" style="margin-right: 0.2778em;"></span><span class="mrel">≤</span><span class="mspace" style="margin-right: 0.2778em;"></span></span><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">200</span></span></span></span></span></li>
<li><span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>1</mn><mo>≤</mo><mi>Q</mi><mo>≤</mo><mn>1000</mn></mrow><annotation encoding="application/x-tex">1 \le Q \le 1000</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.7804em; vertical-align: -0.136em;"></span><span class="mord">1</span><span class="mspace" style="margin-right: 0.2778em;"></span><span class="mrel">≤</span><span class="mspace" style="margin-right: 0.2778em;"></span></span><span class="base"><span class="strut" style="height: 0.8778em; vertical-align: -0.1944em;"></span><span class="mord mathnormal">Q</span><span class="mspace" style="margin-right: 0.2778em;"></span><span class="mrel">≤</span><span class="mspace" style="margin-right: 0.2778em;"></span></span><span class="base"><span class="strut" style="height: 0.6444em;"></span><span class="mord">1000</span></span></span></span></span></li>
<li><span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>1</mn><mo>≤</mo><mtext>id</mtext><mo>≤</mo><msup><mn>10</mn><mn>5</mn></msup></mrow><annotation encoding="application/x-tex">1 \le \text{id} \le 10^5</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.7804em; vertical-align: -0.136em;"></span><span class="mord">1</span><span class="mspace" style="margin-right: 0.2778em;"></span><span class="mrel">≤</span><span class="mspace" style="margin-right: 0.2778em;"></span></span><span class="base"><span class="strut" style="height: 0.8304em; vertical-align: -0.136em;"></span><span class="mord text"><span class="mord">id</span></span><span class="mspace" style="margin-right: 0.2778em;"></span><span class="mrel">≤</span><span class="mspace" style="margin-right: 0.2778em;"></span></span><span class="base"><span class="strut" style="height: 0.8141em;"></span><span class="mord">1</span><span class="mord"><span class="mord">0</span><span class="msupsub"><span class="vlist-t"><span class="vlist-r"><span class="vlist" style="height: 0.8141em;"><span style="top: -3.063em; margin-right: 0.05em;"><span class="pstrut" style="height: 2.7em;"></span><span class="sizing reset-size6 size3 mtight"><span class="mord mtight">5</span></span></span></span></span></span></span></span></span></span></span></span></li>
<li><span class="math math-inline"><span class="katex"><span class="katex-mathml"><math xmlns="http://www.w3.org/1998/Math/MathML"><semantics><mrow><mn>1</mn><mo>≤</mo><mtext>energy</mtext><mo separator="true">,</mo><mtext>amount</mtext><mo separator="true">,</mo><mtext>cost</mtext><mo separator="true">,</mo><mtext>bonus</mtext><mo separator="true">,</mo><mtext>minimum</mtext><mo>≤</mo><msup><mn>10</mn><mn>9</mn></msup></mrow><annotation encoding="application/x-tex">1 \le \text{energy}, \text{amount}, \text{cost}, \text{bonus}, \text{minimum} \le 10^9</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.7804em; vertical-align: -0.136em;"></span><span class="mord">1</span><span class="mspace" style="margin-right: 0.2778em;"></span><span class="mrel">≤</span><span class="mspace" style="margin-right: 0.2778em;"></span></span><span class="base"><span class="strut" style="height: 0.8889em; vertical-align: -0.1944em;"></span><span class="mord text"><span class="mord">energy</span></span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord text"><span class="mord">amount</span></span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord text"><span class="mord">cost</span></span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord text"><span class="mord">bonus</span></span><span class="mpunct">,</span><span class="mspace" style="margin-right: 0.1667em;"></span><span class="mord text"><span class="mord">minimum</span></span><span class="mspace" style="margin-right: 0.2778em;"></span><span class="mrel">≤</span><span class="mspace" style="margin-right: 0.2778em;"></span></span><span class="base"><span class="strut" style="height: 0.8141em;"></span><span class="mord">1</span><span class="mord"><span class="mord">0</span><span class="msupsub"><span class="vlist-t"><span class="vlist-r"><span class="vlist" style="height: 0.8141em;"><span style="top: -3.063em; margin-right: 0.05em;"><span class="pstrut" style="height: 2.7em;"></span><span class="sizing reset-size6 size3 mtight"><span class="mord mtight">9</span></span></span></span></span></span></span></span></span></span></span></span></li>
</ul>
</div>
<h3 class="notranslate">Sample 1:</h3>
<div class="_input_output__table_bh3c4_231 notranslate"><div class="_text_copy__container_bh3c4_235"><div class="_text_copy_bh3c4_235 _input_top__box_bh3c4_248"><span>Input</span><div aria-label="Copy to clipboard" class="undefined css-1eiukdk" style="pointer-events: all;"><span class="_icon__box_10bs7_2 _dark_10bs7_27 undefined"><i class="_copy__icon_10bs7_14"></i></span></div></div><div class="_text_copy_bh3c4_235 _ouput_top__box_bh3c4_251"><span>Output</span><div aria-label="Copy to clipboard" class="undefined css-1eiukdk" style="pointer-events: all;"><span class="_icon__box_10bs7_2 _dark_10bs7_27 undefined"><i class="_copy__icon_10bs7_14"></i></span></div></div></div><div class="_values__container_bh3c4_254"><div class="_values_bh3c4_254"><pre>2 11
101 80
202 30
COUNT
GET 101
MISSION 101 50
MISSION 202 40
RECHARGE 202 20
PAIR 101 202
INSPECT 101 30
UPGRADE 101 15
GET 101
COUNT
INSPECT 202 60</pre></div><div class="_values_bh3c4_254"><pre>2
80
30
LOW_ENERGY
50
80
READY
45
30
3
NOT_READY</pre></div></div></div>
<h3 class="notranslate">Explanation:</h3>
<div class="notranslate">
<p>Initially, two drones exist. Drone <code>101</code> completes a mission costing 50 energy, reducing its energy to 30. Drone <code>202</code> cannot complete a mission costing 40 because it has only 30 energy. Recharging it by 20 increases its energy to 50.</p>
<p>The combined energy is <code>30 + 50 = 80</code>. Simulating an upgrade of 15 for drone <code>101</code> creates a new object with energy 45, without changing the original drone. Therefore, <code>COUNT</code> becomes 3.</p>
</div><div></div></div></div>
