
open class college {
    var Collegename:String="";
    var Collegeplace:String="";
    var branchobj=branch();
    var Studentobj=Student();
    fun displaycollege(){
      print("CollegeName: $Collegename Collegeplace: $Collegeplace");
   }

    inner class branch(){
        var branchName:String=""
        var branchID:Int=0;
       fun displaybranch(){
          print("branchname: $branchName branchID: $branchID");
       }

    }

    inner class Student(){
        var Studentname:String="";
        var Studentid:Int=0;
        fun displayStudent(){
            print("StudentName: $Studentname StudentID $Studentid" );
        }

    }

}

fun main(){
    var obj=college();
    obj.Collegename="VIT";
    obj.Collegeplace="Mumbai";
    obj.branchobj.branchName="EXTC";
    obj.branchobj.branchID=12;
    obj.Studentobj.Studentname="Shikhar";
    obj.Studentobj.Studentid=21;
    obj.displaycollege()
    obj.branchobj.displaybranch()
    obj.Studentobj.displayStudent()


}