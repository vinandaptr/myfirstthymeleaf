var tableBiodata = {
    create: function () {
        // jika table tersebut datatable, maka clear and destroy
        if ($.fn.DataTable.isDataTable('#tableBiodata')) {
            //table yg sudah dibentuk menjadi datatable harus di-rebuild lagi untuk di-instantiasi-ulang
            $('#tableBiodata').DataTable().clear();
            $('#tableBiodata').DataTable().destroy();
        }

        $.ajax({
            url: '/api/biodata',
            method: 'get',
            contentType: 'application/json',
            success: function (res, status, xhr) {
                if (xhr.status == 200 || xhr.status == 201) {
                    $('#tableBiodata').DataTable({
                        data: res,
                        columns: [
                               {
                                   title: "Full Name",
                                   data: "fullName"
                               },
							   {
								   title: "Email",
								   data: "email"
							   },
							   {
								   title: "Phone Number",
								   data: "phone"
							   },
							   {
								   title: "Adress",
								   data: "address"
							   },
							   {
								   title: "Birthday",
								   data: "birthday"
							   },
							   {
								   title: "ID Card Number",
								   data: "idCard"
							   },
							   {
								   title: "University",
								   data: "univ"
							   },
							   {
								   title: "Major",
								   data: "major"
							   },
							   {
								   title: "GPA",
								   data: "gpa"
							   },
							   {
								   title: "Cover Letter",
								   data: "cover"
							   },
							   {
								   title: "Hobby",
								   data: "hobby"
							   },
							   {
								   title: "Gender",
								   data: "gender"
							   },
							   {
								   title: "Religion",
								   data: "religion"
							   },
                               {
                                title: "Action",
                                data: null,
                                render: function (data, type, row) {
                                    return "<button class='btn-primary' onclick=formBiodata.setEditData('" + data.id + "')>Edit</button>"
                                }
                            }
                        ]
                    });

                } else {

                }
            },
            erorrr: function (err) {
                console.log(err);
            }
        });


    }
};

var formBiodata = {
    resetForm: function () {
        $('#form-biodata')[0].reset();
    },
    saveForm: function () {
    	console.log('asdasd');
        if ($('#form-biodata').parsley().validate()) {
            var dataResult = getJsonForm($("#form-biodata").serializeArray(), true);
//            document.getElementById("demo").innerHTML = JSON.stringify(dataResult);

            $.ajax({
                url: '/api/biodata',
                method: 'post',
                contentType: 'application/json',
                dataType: 'json',
                data: JSON.stringify(dataResult),
                success: function (res, status, xhr) {
                    if (xhr.status == 200 || xhr.status == 201) {
                        tableBiodata.create();
                        $('#modal-biodata').modal('hide')

                    } else {

                    }
                },
                erorrr: function (err) {
                    console.log(err);
                }
            });
        }
    }, setEditData: function (idCabang) {
        formBiodata.resetForm();

        $.ajax({
            url: '/api/biodata' + idCabang,
            method: 'get',
            contentType: 'application/json',
            dataType: 'json',
            success: function (res, status, xhr) {
                if (xhr.status == 200 || xhr.status == 201) {
                    $('#form-biodata').fromJSON(JSON.stringify(res));
                    $('#modal-biodata').modal('show')

                } else {

                }
            },
            erorrr: function (err) {
                console.log(err);
            }
        });


    }

};