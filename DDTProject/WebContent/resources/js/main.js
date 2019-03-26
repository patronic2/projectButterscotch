//poppers errwhere
//$(function () {
//    $('[data-toggle=popover]').popover({
//        html: true,
//        content: function () {
//            return $('#popover_content_wrapper').html();
//        }
//    }).click(function () {
//        $(this).popover('show');
//        $("#popover").popover({
//            trigger: "hover"
//        });
//    });

    function openNav() {
        document.getElementById("mySidebar").style.width = "350px";
    }

    function closeNav() {
        document.getElementById("mySidebar").style.width = "0";
    }

    //Accordion

    // $('#intro').click(function () {
    //     $(this).siblings("#accordion-form1").toggle();
    // });
    var Accordion = function (el, multiple) {
        this.el = el || {};
        this.multiple = multiple || false;

        // Variables privadas
        var links = this.el.find('.link');
        // Evento
        links.on('click', {
            el: this.el,
            multiple: this.multiple
        }, this.dropdown)
    }

    Accordion.prototype.dropdown = function (e) {
        var $el = e.data.el;
        $this = $(this),
            $next = $this.next();

        $next.slideToggle();
        $this.parent().toggleClass('open');

        if (!e.data.multiple) {
            $el.find('.submenu').not($next).slideUp().parent().removeClass('open');
        };
    }

    var accordion = new Accordion($('.accordion'), false);

    $(".datepicker").datepicker();

    $.extend($.datepicker, {
        _checkOffset: function (inst, offset, isFixed) {
            offset.top = 140;
            offset.left = 870;
            return offset;
        }
    });

    $(".approval").change(function () {
        if ($(this).value == "approved") { // or this.value == 'volvo'

        }
    });

    const article = document.querySelector(".approval");

    if ((article.dataset.dec) == "approved") {
        $(".approval").css("background-color", "#7FFF00");
    } else {
        $(".approval").css("background-color", "Red");
        $("input").prop('disabled', true);
    }





    //Card functions
    var person = "Frank";
    var idNum = "8675309";
    var trainingType = "Java Fullstack";
    var date = "05/20/2019";
    var numPersons = 20;
    var location = "Pheonix";

    $("#newTrainBut").click(function(){
        console.log("button pressed.");
        $(".newTrainTable1").remove();
        $("#col-sm-1").prepend('<div class="card proc-card"><div class="card-header"> ' + idNum + '<button type="button" class="summary-btn danger" href="#" id="popover"data-toggle="popover" data-trigger="hover" title="Summary">....</button></div><div class="card-body proc-card-body"><table width="100%"><tr><td class="proc-card-icon-col"><i class="fas fa-user" title="Project Manager"></i></td><td>'+ person + '</td><td rowspan="5" class="align-bottom"><button type="button" class="btn btn-primary proc-btn" data-toggle="modal"data-target="#edit_steps">Edit</button></td></tr><tr><td class="proc-card-icon-col"><i class="fas fa-chalkboard-teacher" title="Training"></i></td><td> '+ trainingType + '</td></tr><tr><td class="proc-card-icon-col"><i class="fas fa-calendar-alt" title="Start Date"></i></td><td>'+ date + '</td></tr><tr><td class="proc-card-icon-col"><i class="fas fa-users" title="Number of Participants"></i></td><td>'+ numPersons + '</td></tr><tr><td class="proc-card-icon-col"><i class="fas fa-map-marker-alt" title="Location"></i></td><td>'+ location + '</td></tr></table></div></div>' );
    });


$(document).ready(function() {
    $(".tst").keyup(function(){
      $(".proc-card").show();
      var input=$(".tst").val();
      var type=$("#filterList").val();
      $(".proc-card").each(function(){
        if(!$(this).find(type).text().includes(input) && input!="") {
          $(this).hide();
        }
    })
    })});    

// $(document).ready(function(){
//     $('.danger').popover({ 
//       html : true,
//       content: function() {
//         return $('#popover_content_wrapper').html();
//       }
//     });
//   });
