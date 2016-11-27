$(function () {
    var latLng;
    var longi, lati;
    navigator.geolocation.getCurrentPosition(success, fail);

    function success(position) {
        var infowindow;
        longi = position.coords.longitude;
        lati = position.coords.latitude;

        var map = new google.maps.Map(document.getElementById('map'), {
          zoom: 10,
          center: {lat: lati, lng: longi }
        });
        map.addListener('click', function(e){
          latLng = e.latLng;  
          getTrendsDefault(e.latLng.toString());
        });
        
        function emptyData() {
            $("#listcontainer").empty();
        }
        function getTrendsDefault(latLng) {
            emptyData();//can be extended for Throbber
            if(infowindow!=null){
                infowindow.close();
            }
            $.get("trends.servlet", {"latLng": latLng}).done(displayPage).fail();
        }
        function displayPage(data) {
            infowindow = new google.maps.InfoWindow({
                position: latLng,
                content: data
            });
            infowindow.open(map);
            $("#listcontainer").html(data);
        }
    }
    function fail(msg) {
        alert("Please refresh the page and 'ALLOW' your current position");
        console.log(msg.code + msg.message); // Log the error
    }

});




