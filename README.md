<h1>KHOJO  - THE SEARCH</h1>

<P>Khoja is simple java springboot application to find nearset public parks within 10 miles sorted by distance, based on user's latitude and longitude.</p>
<p>This application also have RESTful API part to it. So user can use this ("localhost:8080/json/{lat,long}/get") url to get nearest public parks data in json format.</p>
<p>Here is example JSON data returned by API</p>

<p>http://localhost:8080/json/43.5190906,-96.8458204/get</p>

<h6>Data Returned by API</h6>

```JSON
[{"miles":2.002981771795916,"name":"Kuehn Park"},{"miles":2.299171746606614,"name":"Family Park"},{"miles":2.7851779713664686,"name":"Dunham Park"},{"miles":4.358649848776406,"name":"Sertoma Park"},{"miles":4.385846622583545,"name":"Sherman Park"},{"miles":4.751431709661124,"name":"Midco Aquatic Center"},{"miles":5.116337889248781,"name":"Elmwood Park"},{"miles":5.346479763942836,"name":"Wall Lake Park"},{"miles":5.911169641320578,"name":"Terrace Park"},{"miles":6.246147651409638,"name":"McKennan Park"},{"miles":6.523956655695398,"name":"Tower Park"},{"miles":6.732555364112486,"name":"Falls Park"},{"miles":6.742478118676868,"name":"Falls Park"},{"miles":6.8711165395271525,"name":"Tuthill Park"},{"miles":7.816076750965984,"name":"Pioneer Spray Park"},{"miles":7.900117476086892,"name":"Town One Park"},{"miles":8.062666910840134,"name":"Laurel Oak Park"},{"miles":8.590160757613054,"name":"Frank Olson Park"},{"miles":8.722271366344188,"name":"Kenny Anderson Park"},{"miles":9.47594927036281,"name":"Harmodon Park"}]
```

<h4>Application Preview </h4>
https://github.com/Ronnie7/Khojo/blob/master/demoPic.PNG
