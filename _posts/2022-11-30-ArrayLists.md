---
keywords: fastai
title: Unit 7 - ArrayLists
toc: true
badges: true
comments: true
author: Natalie Beckwith
categories: [CB Lessions, TRI2]
nb_path: _notebooks/2022-11-30-ArrayLists.ipynb
layout: notebook
---

<!--
#################################################
### THIS FILE WAS AUTOGENERATED! DO NOT EDIT! ###
#################################################
# file to edit: _notebooks/2022-11-30-ArrayLists.ipynb
-->

<div class="container" id="notebook-container">
        
<div class="cell border-box-sizing text_cell rendered"><div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h3 id="Homework">Homework<a class="anchor-link" href="#Homework"> </a></h3><ul>
<li><p>Sophie and I pair-coded this homework
<br></p>
</li>
<li><p>Create an ArrayList that includes 2 of the 4 factors listed below.</p>
<ul>
<li>Sort an ArrayList in descending order and swap the first and last elements</li>
<li>Find and display the hashCode of an Arraylist before and after being sorted</li>
</ul>
</li>
</ul>

</div>
</div>
</div>
    {% raw %}
    
<div class="cell border-box-sizing code_cell rendered">
<div class="input">

<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-java"><pre><span></span><span class="kd">public</span> <span class="kd">class</span> <span class="nc">ArrayListHomework</span>
<span class="p">{</span>
    <span class="kd">private</span> <span class="kd">static</span> <span class="n">ArrayList</span> <span class="o">&lt;</span><span class="n">Integer</span><span class="o">&gt;</span> <span class="n">list</span> <span class="o">=</span> <span class="k">new</span> <span class="n">ArrayList</span> <span class="o">&lt;</span><span class="n">Integer</span><span class="o">&gt;</span><span class="p">();</span>
    <span class="kd">private</span> <span class="kd">static</span> <span class="n">ArrayList</span> <span class="o">&lt;</span><span class="n">Character</span><span class="o">&gt;</span> <span class="n">letters</span> <span class="o">=</span> <span class="k">new</span> <span class="n">ArrayList</span> <span class="o">&lt;</span><span class="n">Character</span><span class="o">&gt;</span><span class="p">();</span>

    <span class="c1">// prints letters before the swap and sort</span>
    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">getLetters</span><span class="p">()</span>
    <span class="p">{</span>
        <span class="n">letters</span><span class="p">.</span><span class="na">add</span><span class="p">(</span><span class="mi">0</span><span class="p">,</span><span class="sc">&#39;X&#39;</span><span class="p">);</span>
        <span class="n">letters</span><span class="p">.</span><span class="na">add</span><span class="p">(</span><span class="mi">1</span><span class="p">,</span><span class="sc">&#39;A&#39;</span><span class="p">);</span>
        <span class="n">letters</span><span class="p">.</span><span class="na">add</span><span class="p">(</span><span class="mi">2</span><span class="p">,</span><span class="sc">&#39;F&#39;</span><span class="p">);</span>
        <span class="n">letters</span><span class="p">.</span><span class="na">add</span><span class="p">(</span><span class="mi">3</span><span class="p">,</span><span class="sc">&#39;O&#39;</span><span class="p">);</span>

        <span class="n">System</span><span class="p">.</span><span class="na">out</span><span class="p">.</span><span class="na">println</span><span class="p">(</span><span class="n">letters</span><span class="p">);</span>
    <span class="p">}</span>

    <span class="c1">// sorts letters in descending order and prints them</span>
    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">sortDescending</span> <span class="p">()</span>
    <span class="p">{</span>

        <span class="n">Collections</span><span class="p">.</span><span class="na">sort</span><span class="p">(</span><span class="n">letters</span><span class="p">,</span> <span class="n">Collections</span><span class="p">.</span><span class="na">reverseOrder</span><span class="p">());</span>
        <span class="n">System</span><span class="p">.</span><span class="na">out</span><span class="p">.</span><span class="na">println</span><span class="p">(</span><span class="n">letters</span><span class="p">);</span>

    <span class="p">}</span>

    <span class="c1">// swaps first and last elements of letters</span>
    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">swap</span><span class="p">()</span>
    <span class="p">{</span>
        <span class="kt">char</span> <span class="n">temp</span> <span class="o">=</span> <span class="n">letters</span><span class="p">.</span><span class="na">get</span><span class="p">(</span><span class="mi">0</span><span class="p">);</span>
        <span class="n">letters</span><span class="p">.</span><span class="na">set</span><span class="p">(</span><span class="mi">0</span><span class="p">,</span> <span class="n">letters</span><span class="p">.</span><span class="na">get</span><span class="p">(</span><span class="n">letters</span><span class="p">.</span><span class="na">size</span><span class="p">()</span><span class="o">-</span><span class="mi">1</span><span class="p">));</span>

        <span class="n">letters</span><span class="p">.</span><span class="na">set</span><span class="p">(</span><span class="n">letters</span><span class="p">.</span><span class="na">size</span><span class="p">()</span><span class="o">-</span><span class="mi">1</span><span class="p">,</span> <span class="n">temp</span><span class="p">);</span>
        <span class="n">System</span><span class="p">.</span><span class="na">out</span><span class="p">.</span><span class="na">println</span><span class="p">(</span><span class="n">letters</span><span class="p">);</span>
    <span class="p">}</span>

    <span class="c1">// prints before the numbers list is sorted into ascendign order and after</span>
    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">beforeAndAfterSort</span><span class="p">()</span>
    <span class="p">{</span>
        <span class="n">list</span><span class="p">.</span><span class="na">add</span><span class="p">(</span><span class="mi">0</span><span class="p">,</span><span class="mi">4</span><span class="p">);</span>
        <span class="n">list</span><span class="p">.</span><span class="na">add</span><span class="p">(</span><span class="mi">1</span><span class="p">,</span><span class="mi">37</span><span class="p">);</span>
        <span class="n">list</span><span class="p">.</span><span class="na">add</span><span class="p">(</span><span class="mi">2</span><span class="p">,</span><span class="mi">2</span><span class="p">);</span>
        <span class="n">list</span><span class="p">.</span><span class="na">add</span><span class="p">(</span><span class="mi">3</span><span class="p">,</span><span class="o">-</span><span class="mi">5</span><span class="p">);</span>

        <span class="n">System</span><span class="p">.</span><span class="na">out</span><span class="p">.</span><span class="na">printf</span><span class="p">(</span><span class="s">&quot;Before sort:&quot;</span><span class="p">);</span>
        <span class="n">System</span><span class="p">.</span><span class="na">out</span><span class="p">.</span><span class="na">println</span><span class="p">(</span><span class="n">list</span><span class="p">);</span>

        <span class="n">Collections</span><span class="p">.</span><span class="na">sort</span><span class="p">(</span><span class="n">list</span><span class="p">);</span>
        
        <span class="n">System</span><span class="p">.</span><span class="na">out</span><span class="p">.</span><span class="na">printf</span><span class="p">(</span><span class="s">&quot;After sort:&quot;</span><span class="p">);</span>
        <span class="n">System</span><span class="p">.</span><span class="na">out</span><span class="p">.</span><span class="na">println</span><span class="p">(</span><span class="n">list</span><span class="p">);</span>
    <span class="p">}</span>

    <span class="c1">// main/tester method</span>
    <span class="kd">public</span> <span class="kd">static</span> <span class="kt">void</span> <span class="nf">main</span> <span class="p">(</span><span class="n">String</span><span class="o">[]</span> <span class="n">Args</span><span class="p">)</span>
    <span class="p">{</span>
        <span class="n">ArrayListHomework</span> <span class="n">arrayListHomework</span> <span class="o">=</span> <span class="k">new</span> <span class="n">ArrayListHomework</span><span class="p">();</span>

        <span class="n">arrayListHomework</span><span class="p">.</span><span class="na">beforeAndAfterSort</span><span class="p">();</span>
        <span class="n">System</span><span class="p">.</span><span class="na">out</span><span class="p">.</span><span class="na">printf</span><span class="p">(</span><span class="s">&quot;\n&quot;</span><span class="p">);</span>

        <span class="n">System</span><span class="p">.</span><span class="na">out</span><span class="p">.</span><span class="na">printf</span><span class="p">(</span><span class="s">&quot;Before sort:&quot;</span><span class="p">);</span>
        <span class="n">arrayListHomework</span><span class="p">.</span><span class="na">getLetters</span><span class="p">();</span>
        <span class="n">System</span><span class="p">.</span><span class="na">out</span><span class="p">.</span><span class="na">printf</span><span class="p">(</span><span class="s">&quot;Descending order sort:&quot;</span><span class="p">);</span>
        <span class="n">arrayListHomework</span><span class="p">.</span><span class="na">sortDescending</span><span class="p">();</span>
        <span class="n">System</span><span class="p">.</span><span class="na">out</span><span class="p">.</span><span class="na">printf</span><span class="p">(</span><span class="s">&quot;First and last elements swapped:&quot;</span><span class="p">);</span>
        <span class="n">arrayListHomework</span><span class="p">.</span><span class="na">swap</span><span class="p">();</span>
    <span class="p">}</span>
<span class="p">}</span>
<span class="n">ArrayListHomework</span><span class="p">.</span><span class="na">main</span><span class="p">(</span><span class="kc">null</span><span class="p">);</span>
</pre></div>

    </div>
</div>
</div>

<div class="output_wrapper">
<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">
<pre>Before sort:[4, 37, 2, -5]
After sort:[-5, 2, 4, 37]

Before sort:[X, A, F, O]
Descending order sort:[X, O, F, A]
First and last elements swapped:[A, O, F, X]
</pre>
</div>
</div>

</div>
</div>

</div>
    {% endraw %}

</div>
 
