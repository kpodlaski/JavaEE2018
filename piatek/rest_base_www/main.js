/**
 * Created by Krzysztof Podlaski on 11.01.2019.
 */

$.ajax({
    'url':"http://localhost:8080/people",
    'method':"GET",
}).done(function(data){
    console.log(data);
    console.log(JSON.stringify(data));
    //alert(data._embedded.people[0].firstName);
    var table = document.getElementById("people_tbl");
    data._embedded.people.forEach( function(person) {
        var row = document.createElement("tr");
        var col = document.createElement("td");
        col.innerText = person.firstName;
        row.appendChild(col);
        col = document.createElement("td");
        col.innerText = person.lastName;
        row.appendChild(col);
        table.appendChild(row);
    })
});
