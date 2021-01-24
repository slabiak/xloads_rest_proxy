>NearProps project (former xloads) is a web application which lists rooms/flats to rent with each one having calculated time of travel (by car, foot, bike or public transportation) to place selected by user (for example their work or school). Frontend is made with React and backend is done with the use of Java and Spring. This application is completely independent of external APIs like Google Maps, whole routing and geocoding, reversed geocoding and autocomplete for place search is done with the use of open source solutions like GrapHopper, OpenStreetPlanner, photon and OpenStreetMap. This project is still under heavy development and not finished yet.


### Live demo
Live demo of this app can be found [here](https://nearprops.netlify.app/)

<a href="https://github.com/slabiak/slabiak.github.io/blob/master/images/web.png?raw=true"><img src="https://github.com/slabiak/slabiak.github.io/blob/master/images/web.png?raw=true" width="600"></a>

<a href="https://github.com/slabiak/slabiak.github.io/blob/master/images/mobile.png?raw=true"><img src="https://github.com/slabiak/slabiak.github.io/blob/master/images/mobile.png?raw=true" width="300"></a>


### Description
This application is a proxy between [xloads_ui](https://github.com/slabiak/xloads_ui) and two open source routing services `graphopper` and `opentripplanner`. First one is used for walk, foot, bike routes types and second one for transit routes.

**Architecture diagram**:

<a href="https://github.com/slabiak/slabiak.github.io/blob/master/images/xloads_arhcitecture.jpg?raw=true"><img src="https://github.com/slabiak/slabiak.github.io/blob/master/images/xloads_arhcitecture.jpg?raw=true"></a>
