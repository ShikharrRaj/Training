
import java.time.LocalDate
import java.time.LocalTime


open class Ticket() {
    var from: String = "";
    var to: String = "";
    var date = LocalDate.now();
    var time = LocalTime.now();
    var cost: Int = 0;
    var preference: String = "";
    var seatno: Int = 0;
    var customerobj=Customer();
    var BookingClassobj=BookingClass();

    fun displayticket() {
        print("From: $from To: $to Date: $date Time: $time Cost: $cost Preference: $preference Seat_No: $seatno");
    }


    open inner class Customer() {
        var customername: String = "";
        var customerage: Int = 0;
        var customerplace: String = "";

        fun diplaycustomer() {
            print("Custromer_Name: $customername Customer_Age: $customerage Customer_Place: $customerplace");
        }


    }

    open inner class BookingClass() {
        var CustomerDetails=Customer();
        var CustomerList=Customer();
        var bookingdetails=Ticket();

        fun displayBookingClass(){
            print("Customer Details: $CustomerDetails Customer List: $CustomerList Booking Details: $bookingdetails");
        }


    }
}

    fun main(){
        var obj=Ticket();
        obj.from="Mumbai";
        obj.to="Delhi";
        obj.date= LocalDate.now();
        obj.time= LocalTime.now();
        obj.cost=1000;
        obj.preference="Upper Birth";
        obj.seatno=48;
        obj.customerobj.customername="Shikhar Raj";
        obj.customerobj.customerage=21;
        obj.customerobj.customerplace="Mumbai";
        obj.BookingClassobj.bookingdetails;
        obj.BookingClassobj.CustomerList;
        obj.BookingClassobj.CustomerDetails;
        obj.displayticket();
        obj.customerobj.diplaycustomer();
        obj.BookingClassobj.displayBookingClass();
    }