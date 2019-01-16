/**
 * Created by Krzysztof Podlaski on 11.01.2019.
 */

function loadTable() {
    $.ajax({
        'url': "http://localhost:8080/people",
        'method': "GET",
    }).done(function (data) {
        console.log(data);
        console.log(JSON.stringify(data));
        //alert(data._embedded.people[0].firstName);
        var table = document.getElementById("people_tbl");
        data._embedded.people.forEach(function (person) {
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
}


document.getElementById("submit_btn")
    .addEventListener("click",function(event){
        event.preventDefault();
        var data = {};
        var imie = document.getElementById("imie");
        var nazwisko = document.getElementById("nazwisko");
        data.firstName = imie.value;
        data.lastName = nazwisko.value;
        //alert(JSON.stringify(data));
        $.ajax({
            'url':"http://localhost:8080/people",
            'method':"POST",
            'contentType': 'application/json',
            'dataType': 'json',
            "data":JSON.stringify(data)
        }).done(function(){
            console.log("SUCCESS");
            loadTable();
        }).fail(function(info){
            console.log(JSON.stringify(info));
        })
    });

loadTable();