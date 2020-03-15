

$(document).ready(function () {

    $("#search-form").submit(function (event) {

        //stop submit the form, we will post it manually.
        event.preventDefault();

        fire_ajax_submit();

    });

});

function fire_ajax_submit() {

    var request = {}
    var calculateType = $('#operations option:selected').val();
    request["type"] = calculateType;
    request["number1"] = $("#firstValue").val();
    request["number2"] = $("#secondValue").val();
    $("#btn-convert").prop("disabled", true);

    console.log(request);

    $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "/api/calculate",
        data: JSON.stringify(request),
        dataType: 'json',
        cache: false,
        timeout: 600000,
        success: function (data) {

            var json = "<h4>Calculate Response</h4><pre>"
                + JSON.stringify(data, null, 4) + "</pre>";
            $('#feedback').html(json);

            console.log("SUCCESS : ", data);
            $("#btn-search").prop("disabled", false);

        },
        error: function (e) {

            var json = "<h4>Ajax Response</h4><pre>"
                + e.responseText + "</pre>";
            $('#feedback').html(json);

            console.log("ERROR : ", e);
            $("#btn-search").prop("disabled", false);

        }
    });

}