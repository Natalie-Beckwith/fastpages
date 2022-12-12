---
keywords: fastai
title: Unit 1 - Primitive Data Types
toc: true
badges: true
comments: true
author: Natalie Beckwith
categories: [CB Lessions, TRI1]
nb_path: _notebooks/2022-10-12-PrimitiveTypes.ipynb
layout: notebook
---

<!--
#################################################
### THIS FILE WAS AUTOGENERATED! DO NOT EDIT! ###
#################################################
# file to edit: _notebooks/2022-10-12-PrimitiveTypes.ipynb
-->

<div class="container" id="notebook-container">
        
<div class="cell border-box-sizing text_cell rendered"><div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h2 id="Homework">Homework<a class="anchor-link" href="#Homework"> </a></h2><h3 id="2006-FRQ">2006 FRQ<a class="anchor-link" href="#2006-FRQ"> </a></h3><p><a href="https://secure-media.collegeboard.org/apc/_ap06_frq_computer_sc_51649.pdf">Link to questions</a> <br><br>
1)<br>
a.</p>

</div>
</div>
</div>
    {% raw %}
    
<div class="cell border-box-sizing code_cell rendered">
<div class="input">

<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-java"><pre><span></span><span class="kd">public</span> <span class="kd">class</span> <span class="nc">Appointment</span>
<span class="p">{</span>
    <span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">conflictsWith</span> <span class="p">(</span><span class="kt">int</span> <span class="n">appointmentTimeInterval</span><span class="p">,</span> <span class="kt">int</span> <span class="n">timeInterval</span><span class="p">)</span>
    <span class="p">{</span>
        <span class="k">if</span><span class="p">(</span><span class="n">appointmentTimeInterval</span> <span class="o">&lt;</span> <span class="n">timeInterval</span><span class="p">)</span>
        <span class="p">{</span>
            <span class="k">return</span> <span class="kc">true</span><span class="p">;</span>
        <span class="p">}</span>
        <span class="k">else</span>
        <span class="p">{</span>
            <span class="k">return</span> <span class="kc">false</span><span class="p">;</span>
        <span class="p">}</span>
    <span class="p">}</span>
<span class="p">}</span>
</pre></div>

    </div>
</div>
</div>

</div>
    {% endraw %}

    {% raw %}
    
<div class="cell border-box-sizing code_cell rendered">
<div class="input">

<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-java"><pre><span></span><span class="n">Appointment</span> <span class="n">appointment</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Appointment</span><span class="p">();</span>

<span class="kt">boolean</span> <span class="n">conflict</span> <span class="o">=</span> <span class="n">appointment</span><span class="p">.</span><span class="na">conflictsWith</span><span class="p">(</span><span class="mi">10</span><span class="p">,</span> <span class="mi">2</span><span class="p">);</span>

<span class="n">System</span><span class="p">.</span><span class="na">out</span><span class="p">.</span><span class="na">printf</span><span class="p">(</span><span class="s">&quot;Appointment is at 10\nTime interval is 2\n&quot;</span><span class="p">);</span>
<span class="n">System</span><span class="p">.</span><span class="na">out</span><span class="p">.</span><span class="na">printf</span><span class="p">(</span><span class="s">&quot;Is there a conflict with appointment?: %b\n&quot;</span><span class="p">,</span> <span class="n">conflict</span><span class="p">);</span>
</pre></div>

    </div>
</div>
</div>

<div class="output_wrapper">
<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">
<pre>Appointment is at 10
Time interval is 2
Is there a conflict with appointment?: false
</pre>
</div>
</div>

<div class="output_area">



<div class="output_text output_subarea output_execute_result">
<pre>java.io.PrintStream@725e0cfd</pre>
</div>

</div>

</div>
</div>

</div>
    {% endraw %}

<div class="cell border-box-sizing text_cell rendered"><div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<p>1)<br>
b.</p>

</div>
</div>
</div>
    {% raw %}
    
<div class="cell border-box-sizing code_cell rendered">
<div class="input">

<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-java"><pre><span></span><span class="kd">public</span> <span class="kd">class</span> <span class="nc">Appointment</span>
<span class="p">{</span>
    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">clearConflicts</span><span class="p">(</span><span class="n">Appointment</span> <span class="n">appointment</span><span class="p">)</span>
  <span class="p">{</span>
    <span class="kt">int</span> <span class="n">loop</span> <span class="o">=</span> <span class="mi">0</span><span class="p">;</span>

    <span class="k">while</span> <span class="p">(</span><span class="n">loop</span> <span class="o">&lt;</span> <span class="n">appointmentList</span><span class="p">.</span><span class="na">size</span><span class="p">())</span>
    <span class="k">if</span> <span class="p">(((</span><span class="n">Appointment</span><span class="p">)</span><span class="n">appointmentList</span><span class="p">.</span><span class="na">get</span><span class="p">(</span><span class="n">loop</span><span class="p">)).</span><span class="na">conflictsWith</span><span class="p">(</span><span class="n">appointment</span><span class="p">))</span>
    <span class="p">{</span>
        <span class="n">appointmentList</span><span class="p">.</span><span class="na">remove</span><span class="p">(</span><span class="n">loop</span><span class="p">);</span>
    <span class="p">}</span>
    <span class="k">else</span>
    <span class="p">{</span>
        <span class="n">loop</span><span class="o">++</span><span class="p">;</span>
    <span class="p">}</span>
  <span class="p">}</span>
<span class="p">}</span>
</pre></div>

    </div>
</div>
</div>

</div>
    {% endraw %}

<div class="cell border-box-sizing text_cell rendered"><div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<p>1)<br>
c.</p>

</div>
</div>
</div>
    {% raw %}
    
<div class="cell border-box-sizing code_cell rendered">
<div class="input">

<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-java"><pre><span></span><span class="kd">public</span> <span class="kd">class</span> <span class="nc">Appointment</span>
<span class="p">{</span>
    <span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">addAppointment</span><span class="p">(</span><span class="n">Appointment</span> <span class="n">appointment</span><span class="p">,</span> <span class="kt">boolean</span> <span class="n">emergency</span><span class="p">)</span>
  <span class="p">{</span>
    <span class="k">if</span> <span class="p">(</span><span class="n">emergency</span><span class="p">)</span>
    <span class="p">{</span>
      <span class="n">clearConflicts</span><span class="p">(</span><span class="n">appointment</span><span class="p">);</span>
      <span class="n">appointmentList</span><span class="p">.</span><span class="na">add</span><span class="p">(</span><span class="n">appointment</span><span class="p">);</span>

      <span class="k">return</span> <span class="kc">true</span><span class="p">;</span>
    <span class="p">}</span>

    <span class="k">for</span> <span class="p">(</span><span class="kt">int</span> <span class="n">loop</span> <span class="o">=</span> <span class="mi">0</span><span class="p">;</span> <span class="n">loop</span> <span class="o">&lt;</span> <span class="n">appointmentList</span><span class="p">.</span><span class="na">size</span><span class="p">();</span> <span class="n">loop</span><span class="o">++</span><span class="p">)</span>
      <span class="k">if</span> <span class="p">(((</span><span class="n">Appointment</span><span class="p">)</span><span class="n">appointmentList</span><span class="p">.</span><span class="na">get</span><span class="p">(</span><span class="n">i</span><span class="p">)).</span><span class="na">conflictsWith</span><span class="p">(</span><span class="n">appointment</span><span class="p">))</span>
      <span class="p">{</span>
        <span class="k">return</span> <span class="kc">false</span><span class="p">;</span>
      <span class="p">}</span>

    <span class="n">appointmentList</span><span class="p">.</span><span class="na">add</span><span class="p">(</span><span class="n">appointment</span><span class="p">);</span>
    <span class="k">return</span> <span class="kc">true</span><span class="p">;</span>
  <span class="p">}</span>
<span class="p">}</span>
</pre></div>

    </div>
</div>
</div>

</div>
    {% endraw %}

<div class="cell border-box-sizing text_cell rendered"><div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<p>2)<br>
a.</p>

</div>
</div>
</div>
    {% raw %}
    
<div class="cell border-box-sizing code_cell rendered">
<div class="input">

<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-java"><pre><span></span><span class="kt">double</span> <span class="n">initialPrice</span> <span class="o">=</span> <span class="mf">6.50</span><span class="p">;</span>

<span class="kd">public</span> <span class="kd">static</span> <span class="kt">double</span> <span class="nf">purchasePrice</span> <span class="p">(</span><span class="kt">double</span> <span class="n">tax</span><span class="p">)</span>
<span class="p">{</span>
    <span class="n">tax</span> <span class="o">*=</span> <span class="mf">1.1</span><span class="p">;</span>
    <span class="k">return</span> <span class="n">tax</span><span class="p">;</span>
<span class="p">}</span>

<span class="n">System</span><span class="p">.</span><span class="na">out</span><span class="p">.</span><span class="na">printf</span><span class="p">(</span><span class="s">&quot;Before tax: $%.2f\n&quot;</span><span class="p">,</span> <span class="n">initialPrice</span><span class="p">);</span>
<span class="kt">double</span> <span class="n">finalPrice</span> <span class="o">=</span> <span class="n">purchasePrice</span><span class="p">(</span><span class="n">initialPrice</span><span class="p">);</span>

<span class="n">System</span><span class="p">.</span><span class="na">out</span><span class="p">.</span><span class="na">printf</span><span class="p">(</span><span class="s">&quot;After tax: $%.2f\n&quot;</span><span class="p">,</span> <span class="n">finalPrice</span><span class="p">);</span>
</pre></div>

    </div>
</div>
</div>

<div class="output_wrapper">
<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">
<pre>Before tax: $6.50
After tax: $7.15
</pre>
</div>
</div>

<div class="output_area">



<div class="output_text output_subarea output_execute_result">
<pre>java.io.PrintStream@725e0cfd</pre>
</div>

</div>

</div>
</div>

</div>
    {% endraw %}

<div class="cell border-box-sizing text_cell rendered"><div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<p>3)<br>
a.</p>

</div>
</div>
</div>
    {% raw %}
    
<div class="cell border-box-sizing code_cell rendered">
<div class="input">

<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-java"><pre><span></span><span class="kd">public</span> <span class="kd">class</span> <span class="nc">Customer</span>
<span class="p">{</span>
    <span class="kd">private</span> <span class="n">String</span> <span class="n">_name</span><span class="p">;</span>
    <span class="kd">private</span> <span class="kt">int</span> <span class="n">_ID</span><span class="p">;</span>

    <span class="kd">public</span> <span class="nf">Customer</span><span class="p">(</span><span class="n">String</span> <span class="n">name</span><span class="p">,</span> <span class="kt">int</span> <span class="n">IDNum</span><span class="p">)</span>
    <span class="p">{</span>
        <span class="n">_name</span> <span class="o">=</span> <span class="n">name</span><span class="p">;</span>
        <span class="n">_ID</span> <span class="o">=</span> <span class="n">IDNum</span><span class="p">;</span>
    <span class="p">}</span>

    <span class="kd">public</span> <span class="n">String</span> <span class="nf">getName</span><span class="p">()</span>
    <span class="p">{</span>
        <span class="k">return</span> <span class="n">_name</span><span class="p">;</span>
    <span class="p">}</span>

    <span class="kd">public</span> <span class="kt">int</span> <span class="nf">getID</span><span class="p">()</span>
    <span class="p">{</span>
        <span class="k">return</span> <span class="n">_ID</span><span class="p">;</span>
    <span class="p">}</span>

    <span class="kd">public</span> <span class="kt">int</span> <span class="nf">compareCustomer</span> <span class="p">(</span><span class="n">Customer</span> <span class="n">compare</span><span class="p">)</span>
    <span class="p">{</span>
        <span class="kt">int</span> <span class="n">compareIDs</span> <span class="o">=</span> <span class="n">_ID</span> <span class="o">-</span> <span class="n">compare</span><span class="p">.</span><span class="na">_ID</span><span class="p">;</span>
        <span class="k">return</span> <span class="n">compareIDs</span><span class="p">;</span>
    <span class="p">}</span>    
<span class="p">}</span>
</pre></div>

    </div>
</div>
</div>

</div>
    {% endraw %}

    {% raw %}
    
<div class="cell border-box-sizing code_cell rendered">
<div class="input">

<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-java"><pre><span></span><span class="c1">// main method</span>
<span class="n">Customer</span> <span class="n">customer1</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Customer</span><span class="p">(</span><span class="s">&quot;Smith&quot;</span><span class="p">,</span> <span class="mi">1001</span><span class="p">);</span>
<span class="n">Customer</span> <span class="n">customer2</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Customer</span><span class="p">(</span><span class="s">&quot;Anderson&quot;</span><span class="p">,</span> <span class="mi">1002</span><span class="p">);</span>
<span class="n">Customer</span> <span class="n">customer3</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Customer</span><span class="p">(</span><span class="s">&quot;Smith&quot;</span><span class="p">,</span> <span class="mi">1003</span><span class="p">);</span>

<span class="kt">int</span> <span class="n">compareCustomer1</span> <span class="o">=</span> <span class="n">customer1</span><span class="p">.</span><span class="na">compareCustomer</span><span class="p">(</span><span class="n">customer1</span><span class="p">);</span>
<span class="kt">int</span> <span class="n">compareCustomer2</span> <span class="o">=</span> <span class="n">customer1</span><span class="p">.</span><span class="na">compareCustomer</span><span class="p">(</span><span class="n">customer2</span><span class="p">);</span>
<span class="kt">int</span> <span class="n">compareCustomer3</span> <span class="o">=</span> <span class="n">customer1</span><span class="p">.</span><span class="na">compareCustomer</span><span class="p">(</span><span class="n">customer3</span><span class="p">);</span>

<span class="n">System</span><span class="p">.</span><span class="na">out</span><span class="p">.</span><span class="na">printf</span><span class="p">(</span><span class="s">&quot;Customer 1 compared to Customer 1: %d\n&quot;</span><span class="p">,</span> <span class="n">compareCustomer1</span><span class="p">);</span>
<span class="n">System</span><span class="p">.</span><span class="na">out</span><span class="p">.</span><span class="na">printf</span><span class="p">(</span><span class="s">&quot;Customer 1 compared to Customer 2: %d\n&quot;</span><span class="p">,</span> <span class="n">compareCustomer2</span><span class="p">);</span>
<span class="n">System</span><span class="p">.</span><span class="na">out</span><span class="p">.</span><span class="na">printf</span><span class="p">(</span><span class="s">&quot;Customer 1 compared to Customer 3: %d\n&quot;</span><span class="p">,</span> <span class="n">compareCustomer3</span><span class="p">);</span>
</pre></div>

    </div>
</div>
</div>

<div class="output_wrapper">
<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">
<pre>Customer 1 compared to Customer 1: 0
Customer 1 compared to Customer 2: -1
Customer 1 compared to Customer 3: -2
</pre>
</div>
</div>

<div class="output_area">



<div class="output_text output_subarea output_execute_result">
<pre>java.io.PrintStream@725e0cfd</pre>
</div>

</div>

</div>
</div>

</div>
    {% endraw %}

</div>
 
