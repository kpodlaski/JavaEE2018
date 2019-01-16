/**
 * Created by Krzysztof Podlaski on 09.01.2019.
 */

function loadData() {
    $.ajax({
        url: "http://localhost:8080/people",
    }).done(function (data) {
        console.log("Mam polaczenie");
        console.log(JSON.stringify(data));
        data._embedded.people.forEach(function (item) {
            var row = document.createElement("tr");
            var col = document.createElement("td");
            col.innerText
                = item.firstName;
            row.appendChild(col);
            col = document.createElement("td");
            col.innerText
                = item.lastName;
            row.appendChild(col);
            col = document.createElement("td");
            btn = document.createElement("button");
            btn.innerText="X";
            btn.addEventListener("click",function(){
                console.log(item._links.person);
                deleteElement(item._links.person);
            })
            col.appendChild(btn);
            row.appendChild(col);
            document.getElementById("people_tbl")
                .appendChild(row);
        });

        //alert(data._embedded.people[0].firstName);
    });
}

loadData();

submit_btn = document.getElementById("submit_btn");
submit_btn.addEventListener("click",function(event){
   event.preventDefault();
   data = {};
   data.firstName = document.getElementById("imie").value;
   data.lastName = document.getElementById("nazw").value;
   console.log(data);
    $.ajax({
        url: "http://localhost:8080/people",
        method:"POST",
        contentType: 'application/json',
        dataType: 'json',
        data: JSON.stringify(data),
    }).done(function( data ) {
        console.log("Udało się wysłać");
        loadData();
    }).fail(function(msg) {
        console.log("ERRORRR");
        console.log(msg);
    })
});

function deleteElement(el_url){
    console.log(el_url);
}