
import java.time.LocalDate
import java.time.LocalTime


open class ticket {
    var from:String="";
    var to:String="";
    var date=LocalDate.now();
    var time=LocalTime.now();
    var cost:Int=0;
    var preference:String="";
    var seatno:Int=0;


    inner class customer(){
        var customername:String="";
        var customerage:Int=0;
        var customerplace:String="";
        var bookingclass:String="";

    }


}