---
layout: page
title: Music Recs.
permalink: /music/
---

<html>


<button id="music" onclick="testClick()">PLAY</button>
<input type="text" id="musicbox" name="musicbox"><br><br>

<br>
</html>

<script>

function testClick() 
{
    var songs = Array("Song1", "Song2", "Song3", "Song4", "Song5")
    var item = Math.floor(Math.random()*songs.length)

    document.getElementById("musicbox").value = songs[item];
}

</script>