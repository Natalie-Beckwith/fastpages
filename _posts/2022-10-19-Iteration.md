---
keywords: fastai
title: Unit 4 - Iteration
toc: true
badges: true
comments: true
author: Natalie Beckwith
categories: [CB Lessions, TRI1]
nb_path: _notebooks/2022-10-19-Iteration.ipynb
layout: notebook
---

<!--
#################################################
### THIS FILE WAS AUTOGENERATED! DO NOT EDIT! ###
#################################################
# file to edit: _notebooks/2022-10-19-Iteration.ipynb
-->

<div class="container" id="notebook-container">
        
<div class="cell border-box-sizing text_cell rendered"><div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h2 id="Notes">Notes<a class="anchor-link" href="#Notes"> </a></h2><ul>
<li>Repeated sequences to simplify code of advanced algorithms</li>
<li><code>++</code> and <code>--</code> increase or decrease a value by 1</li>
<li>While Loops<ul>
<li>Runs code inside loop as long as the specified condition is true</li>
</ul>
</li>
<li>For Loops<ul>
<li>Executes code inside loop as long as a condition is met</li>
</ul>
</li>
<li>Recursion Loop<ul>
<li>A function calls itself to repeat</li>
</ul>
</li>
<li>Nested Iteration<ul>
<li>When you have multiple loops inside each other</li>
<li>2D and 3D Arrays are a good example of this<ul>
<li>2D Arrays require 2 loops</li>
<li>3D Arrays require 3 loops</li>
</ul>
</li>
</ul>
</li>
</ul>

</div>
</div>
</div>
<div class="cell border-box-sizing text_cell rendered"><div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h2 id="Homework:">Homework:<a class="anchor-link" href="#Homework:"> </a></h2><ul>
<li>Write a program where a random number is generated. Then the user tries to guess the number. If they guess too high display something to let them know, and same for if they guess a number that is too low. The loop must iterate until the number is guessed correctly.</li>
</ul>

</div>
</div>
</div>
    {% raw %}
    
<div class="cell border-box-sizing code_cell rendered">
<div class="input">

<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-java"><pre><span></span><span class="kn">import</span> <span class="nn">java.util.Random</span><span class="p">;</span>
<span class="kn">import</span> <span class="nn">java.util.Scanner</span><span class="p">;</span>

<span class="cm">/**</span>
<span class="cm"> * Write a program where a random number is generated.</span>
<span class="cm"> * Then the user tries to guess the number.</span>
<span class="cm"> * If they guess too high display something to let them know,</span>
<span class="cm"> * and same for if they guess a number that is too low.</span>
<span class="cm"> * The loop must iterate until the number is guessed correctly.</span>
<span class="cm"> */</span>

 
<span class="kd">public</span> <span class="kd">class</span> <span class="nc">RandomGuess</span>
<span class="p">{</span>
    <span class="kd">public</span> <span class="kd">static</span> <span class="kt">int</span> <span class="n">magicNumber</span><span class="p">;</span>
    <span class="kd">public</span> <span class="kd">static</span> <span class="kt">int</span> <span class="n">guess</span><span class="p">;</span>
    
    <span class="cm">/*</span>
<span class="cm">     * </span>
<span class="cm">     * </span>
<span class="cm">     */</span>
    <span class="kd">public</span> <span class="kd">static</span> <span class="kt">void</span> <span class="nf">main</span><span class="p">(</span><span class="n">String</span><span class="o">[]</span> <span class="n">Args</span><span class="p">)</span>
    <span class="p">{</span>
        <span class="n">magicNumber</span> <span class="o">=</span> <span class="n">getRandomNumber</span><span class="p">();</span>
        
        <span class="n">Scanner</span> <span class="n">scanner</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Scanner</span><span class="p">(</span><span class="n">System</span><span class="p">.</span><span class="na">in</span><span class="p">);</span>
        

        <span class="k">do</span>
        <span class="p">{</span>
            <span class="n">System</span><span class="p">.</span><span class="na">out</span><span class="p">.</span><span class="na">printf</span><span class="p">(</span><span class="s">&quot;Guess an integer between 0 and 100: &quot;</span><span class="p">);</span>
            <span class="n">guess</span> <span class="o">=</span> <span class="n">scanner</span><span class="p">.</span><span class="na">nextInt</span><span class="p">();</span>
            
            <span class="k">if</span><span class="p">(</span><span class="n">guess</span> <span class="o">&lt;</span> <span class="n">magicNumber</span><span class="p">)</span>
            <span class="p">{</span>
                <span class="n">System</span><span class="p">.</span><span class="na">out</span><span class="p">.</span><span class="na">printf</span><span class="p">(</span><span class="s">&quot;Higher!\n&quot;</span><span class="p">);</span>
            <span class="p">}</span>
            <span class="k">if</span><span class="p">(</span><span class="n">guess</span> <span class="o">&gt;</span> <span class="n">magicNumber</span><span class="p">)</span>
            <span class="p">{</span>
                <span class="n">System</span><span class="p">.</span><span class="na">out</span><span class="p">.</span><span class="na">printf</span><span class="p">(</span><span class="s">&quot;Lower!\n&quot;</span><span class="p">);</span>
            <span class="p">}</span>
        <span class="p">}</span>
        <span class="k">while</span> <span class="p">(</span><span class="n">guess</span> <span class="o">!=</span> <span class="n">magicNumber</span><span class="p">);</span>
        
        <span class="k">if</span><span class="p">(</span><span class="n">guess</span> <span class="o">==</span> <span class="n">magicNumber</span><span class="p">)</span>
        <span class="p">{</span>
            <span class="n">System</span><span class="p">.</span><span class="na">out</span><span class="p">.</span><span class="na">printf</span><span class="p">(</span><span class="s">&quot;\nYou win! The number was %d.\n&quot;</span><span class="p">,</span> <span class="n">magicNumber</span><span class="p">);</span>
        <span class="p">}</span>
        
        <span class="n">scanner</span><span class="p">.</span><span class="na">close</span><span class="p">();</span>
    <span class="p">}</span>
    
    <span class="cm">/*</span>
<span class="cm">     * @return the random number</span>
<span class="cm">     */</span>
    <span class="kd">public</span> <span class="kd">static</span> <span class="kt">int</span> <span class="nf">getRandomNumber</span><span class="p">()</span>
    <span class="p">{</span>
        <span class="n">Random</span> <span class="n">number</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Random</span><span class="p">();</span>
         <span class="kt">int</span> <span class="n">magicNumber</span> <span class="o">=</span> <span class="n">number</span><span class="p">.</span><span class="na">nextInt</span><span class="p">(</span><span class="mi">0</span><span class="p">,</span> <span class="mi">101</span><span class="p">);</span>
        <span class="k">return</span> <span class="n">magicNumber</span><span class="p">;</span>
    <span class="p">}</span>
  
    
<span class="p">}</span>
</pre></div>

    </div>
</div>
</div>

</div>
    {% endraw %}

</div>
 

