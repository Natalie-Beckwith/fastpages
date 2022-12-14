---
keywords: fastai
title: Unit 8 - 2D Arrays
toc: true
badges: true
comments: true
author: Natalie Beckwith
categories: [CB Lessions, TRI2]
nb_path: _notebooks/2022-12-06-PracticeWith2DArrays.ipynb
layout: notebook
---

<!--
#################################################
### THIS FILE WAS AUTOGENERATED! DO NOT EDIT! ###
#################################################
# file to edit: _notebooks/2022-12-06-PracticeWith2DArrays.ipynb
-->

<div class="container" id="notebook-container">
        
<div class="cell border-box-sizing text_cell rendered"><div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h2 id="Notes">Notes<a class="anchor-link" href="#Notes"> </a></h2><ul>
<li>2D Array is an array of arrays</li>
<li>Kind of like a grid, have as many as columns and rows</li>
<li>Declaring a 2D Array:<ul>
<li><code>int[][] numbers;</code></li>
<li><code>String[][] names;</code></li>
</ul>
</li>
<li>to initialize a 2D array, you have to iterate through each row and each column<ul>
<li>have a nested for loop</li>
</ul>
</li>
<li>Display values backwards/upside down</li>
</ul>

</div>
</div>
</div>
<div class="cell border-box-sizing text_cell rendered"><div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h2 id="Homework">Homework<a class="anchor-link" href="#Homework"> </a></h2><ul>
<li>[X] Create a class for 2D array learning.</li>
<li>[X] Create a method too initialize a 2D array with arbitrary values</li>
<li>[X] Create a method to reverse the 2D array and print out the values</li>
<li>[X] Create a method that asks for the input of a position and it returns the corresponding value</li>
<li>[X] Create a method that multiplies each value in a row and then adds all the products together</li>
<li>[X] Create a new object to test out each method in the main function</li>
</ul>

</div>
</div>
</div>
    {% raw %}
    
<div class="cell border-box-sizing code_cell rendered">
<div class="input">

<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-java"><pre><span></span><span class="cm">/**</span>
<span class="cm"> * 2D Array Lesson HW</span>
<span class="cm"> * </span>
<span class="cm"> * @author Natalie Beckwith</span>
<span class="cm"> * @version 1</span>
<span class="cm"> */</span>

<span class="kn">import</span> <span class="nn">java.util.Scanner</span><span class="p">;</span>

<span class="kd">public</span> <span class="kd">class</span> <span class="nc">DoubleArrayLearning</span>
<span class="p">{</span>
     <span class="kd">final</span> <span class="kd">static</span> <span class="kd">private</span> <span class="kt">int</span> <span class="n">NUM_ROWS</span> <span class="o">=</span> <span class="mi">4</span><span class="p">;</span>
     <span class="kd">final</span> <span class="kd">static</span> <span class="kd">private</span> <span class="kt">int</span> <span class="n">NUM_COLUMNS</span> <span class="o">=</span> <span class="mi">4</span><span class="p">;</span>
    
    <span class="cm">/**</span>
<span class="cm">     * Creates an array and sets values to the array</span>
<span class="cm">     * </span>
<span class="cm">     * @return the array with assigned values</span>
<span class="cm">     */</span>
    <span class="kd">public</span> <span class="kt">int</span><span class="o">[][]</span> <span class="nf">getArray</span><span class="p">()</span>
    <span class="p">{</span>
        <span class="kt">int</span><span class="o">[][]</span> <span class="n">array</span> <span class="o">=</span>
        <span class="p">{</span>
            <span class="p">{</span> <span class="mi">4</span><span class="p">,</span> <span class="mi">0</span><span class="p">,</span> <span class="mi">7</span><span class="p">,</span> <span class="mi">12</span><span class="p">},</span>
            <span class="p">{</span> <span class="mi">8</span><span class="p">,</span> <span class="mi">11</span><span class="p">,</span> <span class="mi">5</span><span class="p">,</span> <span class="mi">9</span><span class="p">},</span>
            <span class="p">{</span> <span class="mi">13</span><span class="p">,</span> <span class="mi">3</span><span class="p">,</span> <span class="mi">6</span><span class="p">,</span> <span class="mi">1</span><span class="p">},</span>
            <span class="p">{</span> <span class="mi">10</span><span class="p">,</span> <span class="mi">2</span><span class="p">,</span> <span class="mi">15</span><span class="p">,</span> <span class="mi">14</span><span class="p">}</span>
        <span class="p">};</span>
        <span class="k">return</span> <span class="n">array</span><span class="p">;</span>
    <span class="p">}</span>

    <span class="cm">/**</span>
<span class="cm">     * Prints the array</span>
<span class="cm">     * </span>
<span class="cm">     * @param array</span>
<span class="cm">     */</span>
    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">printArray</span><span class="p">(</span><span class="kt">int</span><span class="o">[][]</span> <span class="n">array</span><span class="p">)</span>
    <span class="p">{</span>
        <span class="c1">// iterates through each row</span>
        <span class="k">for</span> <span class="p">(</span><span class="kt">int</span> <span class="n">row</span> <span class="o">=</span> <span class="mi">0</span><span class="p">;</span> <span class="n">row</span> <span class="o">&lt;</span> <span class="n">NUM_ROWS</span><span class="p">;</span> <span class="n">row</span><span class="o">++</span><span class="p">)</span>
        <span class="p">{</span>
            <span class="c1">// iterates through each column</span>
            <span class="k">for</span> <span class="p">(</span><span class="kt">int</span> <span class="n">column</span> <span class="o">=</span> <span class="mi">0</span><span class="p">;</span> <span class="n">column</span> <span class="o">&lt;</span> <span class="n">NUM_COLUMNS</span><span class="p">;</span> <span class="n">column</span><span class="o">++</span><span class="p">)</span>
            <span class="p">{</span>
                <span class="c1">// prints value in the array</span>
                <span class="n">System</span><span class="p">.</span><span class="na">out</span><span class="p">.</span><span class="na">printf</span><span class="p">(</span><span class="s">&quot;%d\t&quot;</span><span class="p">,</span> <span class="n">array</span><span class="o">[</span><span class="n">row</span><span class="o">][</span><span class="n">column</span><span class="o">]</span><span class="p">);</span>
            <span class="p">}</span>
            <span class="n">System</span><span class="p">.</span><span class="na">out</span><span class="p">.</span><span class="na">printf</span><span class="p">(</span><span class="s">&quot;\n&quot;</span><span class="p">);</span>
        <span class="p">}</span>
    <span class="p">}</span>

    <span class="cm">/**</span>
<span class="cm">     * Prints the array in reverse order</span>
<span class="cm">     * </span>
<span class="cm">     * @param array</span>
<span class="cm">     */</span>
    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">reverseArray</span><span class="p">(</span><span class="kt">int</span><span class="o">[][]</span> <span class="n">array</span><span class="p">)</span>
    <span class="p">{</span>
        <span class="c1">// iterates backwards starting at the last row</span>
        <span class="k">for</span> <span class="p">(</span><span class="kt">int</span> <span class="n">row</span> <span class="o">=</span> <span class="n">NUM_ROWS</span> <span class="o">-</span> <span class="mi">1</span><span class="p">;</span> <span class="n">row</span> <span class="o">&gt;=</span> <span class="mi">0</span><span class="p">;</span> <span class="n">row</span><span class="o">--</span><span class="p">)</span>
        <span class="p">{</span>
            <span class="c1">// iterates through each column starting at the last element</span>
            <span class="k">for</span> <span class="p">(</span><span class="kt">int</span> <span class="n">column</span> <span class="o">=</span> <span class="n">NUM_COLUMNS</span> <span class="o">-</span> <span class="mi">1</span><span class="p">;</span> <span class="n">column</span> <span class="o">&gt;=</span> <span class="mi">0</span><span class="p">;</span> <span class="n">column</span><span class="o">--</span><span class="p">)</span>
            <span class="p">{</span>
                <span class="n">System</span><span class="p">.</span><span class="na">out</span><span class="p">.</span><span class="na">printf</span><span class="p">(</span><span class="s">&quot;%d\t&quot;</span><span class="p">,</span> <span class="n">array</span><span class="o">[</span><span class="n">row</span><span class="o">][</span><span class="n">column</span><span class="o">]</span><span class="p">);</span>
            <span class="p">}</span>
            <span class="n">System</span><span class="p">.</span><span class="na">out</span><span class="p">.</span><span class="na">printf</span><span class="p">(</span><span class="s">&quot;\n&quot;</span><span class="p">);</span>
        <span class="p">}</span>
    <span class="p">}</span>

    <span class="cm">/**</span>
<span class="cm">     * User enters row and column and is given the value of the element they entered</span>
<span class="cm">     * </span>
<span class="cm">     * @param array</span>
<span class="cm">     */</span>
    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">userArray</span><span class="p">(</span><span class="kt">int</span><span class="o">[][]</span> <span class="n">array</span><span class="p">)</span>
    <span class="p">{</span>
        <span class="n">Scanner</span> <span class="n">scanner</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Scanner</span><span class="p">(</span><span class="n">System</span><span class="p">.</span><span class="na">in</span><span class="p">);</span>
        <span class="n">System</span><span class="p">.</span><span class="na">out</span><span class="p">.</span><span class="na">printf</span><span class="p">(</span><span class="s">&quot;Enter a row: &quot;</span><span class="p">);</span>
        <span class="kt">int</span> <span class="n">row</span> <span class="o">=</span> <span class="n">scanner</span><span class="p">.</span><span class="na">nextInt</span><span class="p">();</span>

        <span class="n">System</span><span class="p">.</span><span class="na">out</span><span class="p">.</span><span class="na">printf</span><span class="p">(</span><span class="s">&quot;\nEnter a column: &quot;</span><span class="p">);</span>
        <span class="kt">int</span> <span class="n">column</span> <span class="o">=</span> <span class="n">scanner</span><span class="p">.</span><span class="na">nextInt</span><span class="p">();</span>

        <span class="n">System</span><span class="p">.</span><span class="na">out</span><span class="p">.</span><span class="na">printf</span><span class="p">(</span><span class="s">&quot;\nThe element you entered was [%d],[%d], which has the value: %d\n&quot;</span><span class="p">,</span>
                <span class="n">row</span><span class="p">,</span> <span class="n">column</span><span class="p">,</span> <span class="n">array</span><span class="o">[</span><span class="n">row</span><span class="o">][</span><span class="n">column</span><span class="o">]</span><span class="p">);</span>
        <span class="n">scanner</span><span class="p">.</span><span class="na">close</span><span class="p">();</span>
    <span class="p">}</span>

    <span class="cm">/**</span>
<span class="cm">     * Multiplies each value in a row and adds all products together</span>
<span class="cm">     * </span>
<span class="cm">     * @param array</span>
<span class="cm">     */</span>
    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">product</span><span class="p">(</span><span class="kt">int</span><span class="o">[][]</span> <span class="n">array</span><span class="p">)</span>
    <span class="p">{</span>
        <span class="kt">int</span> <span class="n">sums</span> <span class="o">=</span> <span class="mi">0</span><span class="p">;</span>
        
        <span class="c1">// iterates through each row</span>
        <span class="k">for</span> <span class="p">(</span><span class="kt">int</span> <span class="n">row</span> <span class="o">=</span> <span class="mi">0</span><span class="p">;</span> <span class="n">row</span> <span class="o">&lt;</span> <span class="n">NUM_ROWS</span><span class="p">;</span> <span class="n">row</span><span class="o">++</span><span class="p">)</span>
        <span class="p">{</span>
            <span class="kt">int</span> <span class="n">product</span> <span class="o">=</span> <span class="mi">1</span><span class="p">;</span>
            
            <span class="c1">// iterates through each column</span>
            <span class="k">for</span> <span class="p">(</span><span class="kt">int</span> <span class="n">column</span> <span class="o">=</span> <span class="mi">0</span><span class="p">;</span> <span class="n">column</span> <span class="o">&lt;</span> <span class="n">NUM_COLUMNS</span><span class="p">;</span> <span class="n">column</span><span class="o">++</span><span class="p">)</span>
            <span class="p">{</span>
                <span class="n">product</span> <span class="o">*=</span> <span class="n">array</span><span class="o">[</span><span class="n">row</span><span class="o">][</span><span class="n">column</span><span class="o">]</span><span class="p">;</span>
            <span class="p">}</span>
            <span class="n">System</span><span class="p">.</span><span class="na">out</span><span class="p">.</span><span class="na">printf</span><span class="p">(</span><span class="s">&quot;%d\n&quot;</span><span class="p">,</span> <span class="n">product</span><span class="p">);</span>
            
            <span class="n">sums</span> <span class="o">+=</span> <span class="n">product</span><span class="p">;</span>
        <span class="p">}</span>
        <span class="c1">// prints values in array</span>
        <span class="n">System</span><span class="p">.</span><span class="na">out</span><span class="p">.</span><span class="na">printf</span><span class="p">(</span><span class="s">&quot;\nSum of products: %d&quot;</span><span class="p">,</span> <span class="n">sums</span><span class="p">);</span>
    <span class="p">}</span>

    <span class="cm">/**</span>
<span class="cm">     * Main/Tester method</span>
<span class="cm">     * </span>
<span class="cm">     * @param Args</span>
<span class="cm">     */</span>
    <span class="kd">public</span> <span class="kd">static</span> <span class="kt">void</span> <span class="nf">main</span><span class="p">(</span><span class="n">String</span><span class="o">[]</span> <span class="n">Args</span><span class="p">)</span>
    <span class="p">{</span>
        <span class="n">DoubleArrayLearning</span> <span class="n">doubleArrayLearning</span> <span class="o">=</span> <span class="k">new</span> <span class="n">DoubleArrayLearning</span><span class="p">();</span>
        <span class="kt">int</span><span class="o">[][]</span> <span class="n">nums</span> <span class="o">=</span> <span class="n">doubleArrayLearning</span><span class="p">.</span><span class="na">getArray</span><span class="p">();</span>

        <span class="c1">// prints the original array</span>
        <span class="n">System</span><span class="p">.</span><span class="na">out</span><span class="p">.</span><span class="na">printf</span><span class="p">(</span><span class="s">&quot;Part #1:\n&quot;</span><span class="p">);</span>
        <span class="n">doubleArrayLearning</span><span class="p">.</span><span class="na">printArray</span><span class="p">(</span><span class="n">nums</span><span class="p">);</span>

        <span class="c1">// reverses the order of the array</span>
        <span class="n">System</span><span class="p">.</span><span class="na">out</span><span class="p">.</span><span class="na">printf</span><span class="p">(</span><span class="s">&quot;\nPart #2:\n&quot;</span><span class="p">);</span>
        <span class="n">doubleArrayLearning</span><span class="p">.</span><span class="na">reverseArray</span><span class="p">(</span><span class="n">nums</span><span class="p">);</span>

        <span class="c1">// prompts the user to enter a row and column</span>
        <span class="n">System</span><span class="p">.</span><span class="na">out</span><span class="p">.</span><span class="na">printf</span><span class="p">(</span><span class="s">&quot;\nPart #3:\n&quot;</span><span class="p">);</span>
        <span class="n">doubleArrayLearning</span><span class="p">.</span><span class="na">userArray</span><span class="p">(</span><span class="n">nums</span><span class="p">);</span>

        <span class="c1">// multiplies each row and adds the together</span>
        <span class="n">System</span><span class="p">.</span><span class="na">out</span><span class="p">.</span><span class="na">printf</span><span class="p">(</span><span class="s">&quot;\nPart #4:\n&quot;</span><span class="p">);</span>
        <span class="n">doubleArrayLearning</span><span class="p">.</span><span class="na">product</span><span class="p">(</span><span class="n">nums</span><span class="p">);</span>
    <span class="p">}</span>
<span class="p">}</span>

<span class="n">DoubleArrayLearning</span><span class="p">.</span><span class="na">main</span><span class="p">(</span><span class="kc">null</span><span class="p">);</span>
</pre></div>

    </div>
</div>
</div>

<div class="output_wrapper">
<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">
<pre>Part #1:
4	0	7	12	
8	11	5	9	
13	3	6	1	
10	2	15	14	

Part #2:
14	15	2	10	
1	6	3	13	
9	5	11	8	
12	7	0	4	

Part #3:
Enter a row: 
Enter a column: 
The element you entered was [2],[1], which has the value: 3

Part #4:
0
3960
234
4200

Sum of products: 8394</pre>
</div>
</div>

</div>
</div>

</div>
    {% endraw %}

</div>
 

