//poppers errwhere
$(function () {
    $('[data-toggle=popover]').popover({
        html: true,
        content: function () {
            return $('#popover_content_wrapper').html();
        }
    }).click(function () {
        $(this).popover('show');
        $("#popover").popover({
            trigger: "hover"
        });
    });

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
})

// $(document).ready(function(){
//     $('.danger').popover({ 
//       html : true,
//       content: function() {
//         return $('#popover_content_wrapper').html();
//       }
//     });
//   });