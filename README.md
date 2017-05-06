<h1>KHOJO  - THE SEARCH</h1>

<P>Khoja is simple java springboot application to find nearset public parks within 10 miles sorted by distance, based on user's latitude and longitude.</p>
<p>This application also have RESTful API part to it. So user can use this ("localhost:8080/json/{lat,long}/get") url to get nearest public parks data in json format.</p>
<p>Here is example JSON data returned by API</p>

<p>http://localhost:8080/json/43.5190906,-96.8458204/get</p>

<h6>Data Returned by API</h6>

```JSON
{"2.002981771795916":"Kuehn Park","2.299171746606614":"Family Park","2.7851779713664686":"Dunham Park","4.358649848776406":"Sertoma Park","4.385846622583545":"Sherman Park","4.751431709661124":"Midco Aquatic Center","5.116337889248781":"Elmwood Park","5.346479763942836":"Wall Lake Park","5.911169641320578":"Terrace Park","6.246147651409638":"McKennan Park","6.523956655695398":"Tower Park","6.732555364112486":"Falls Park","6.742478118676868":"Falls Park","6.8711165395271525":"Tuthill Park","7.816076750965984":"Pioneer Spray Park","7.900117476086892":"Town One Park","8.062666910840134":"Laurel Oak Park","8.590160757613054":"Frank Olson Park","8.722271366344188":"Kenny Anderson Park","9.47594927036281":"Harmodon Park"}
```

<h4>Application Preview </h4>
![alt text](https://github.com/Ronnie7/Khojo/blob/master/demoPic.PNG)
