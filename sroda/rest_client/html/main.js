/**
 * Created by Krzysztof Podlaski on 09.01.2019.
 */

$.ajax({
    url: "http://localhost:8080/people/",
    }).done(function( data ) {
        console.log("Mam polaczenie");
        console.log(JSON.stringify(data));
        data._embedded.people.forEach(function(item) {
            var row = document.createElement("tr");
            var col = document.createElement("td");
            col.innerText
                = item.firstName;
            row.appendChild(col);
            col = document.createElement("td");
            col.innerText
                = item.lastName;
            row.appendChild(col);
            document.getElementById("people_tbl")
                .appendChild(row);
        });

        //alert(data._embedded.people[0].firstName);
    });