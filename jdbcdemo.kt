
import java.io.File
import java.io.FileInputStream
import java.sql.*

class jdbcdemo {
    var conn:Connection?=null;
    fun createConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver")
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_system", "root","Monu13Monu13@")
            if(conn!=null){
                println("Connection done")
            }
            println("Connect")
        }catch (e:SQLException){
            print(e)

        }
    }
    fun createTableUsingstatment(){
        var stm:Statement?=null;
        var sql="create table demo2(id int auto_increment,name varchar(255),age int not null,primary key(id));"
        try{
            stm=conn!!.createStatement();
            stm.execute(sql);
            print("table is created");

        }catch (e:SQLException){
            print(e)
        }
    }
    fun createTable(){
        var prestat:PreparedStatement?=null
         var sql="create table demo1(id int auto_increment,name varchar(255),age int not null,primary key(id));"
        try{
            prestat=conn!!.prepareStatement(sql);
            var status=prestat.executeUpdate();
            if(status>0){
                print("table created");
            }
        }catch (e:SQLException){
            print(e)
        }
    }
    fun insertIntoTable(){
        var preStat:PreparedStatement?=null;
        var sql="insert into demo1(name,age) values(?,?);"
        try{
            preStat=conn!!.prepareStatement(sql);
            preStat.setString(1, readLine())
            preStat.setInt(2, readLine()!!.toInt())
            var status=preStat.executeUpdate();
            print(status)
            if(status>0){
                print("data inserted into table")
            }
        }catch (e:SQLException){
            print(e)
        }
    }
    fun connectionClose(){
        if(conn!=null){
            //conn.close();
        }
    }//prepared statement are used for suer to give inputs
    fun updateTables(){
        var preStat:PreparedStatement?=null
        var sql="update demo1 SET name=? where id=?;"
        try{
            preStat=conn!!.prepareStatement(sql)
            var name= readLine()
            preStat.setString(1,name)
            var id= readLine()!!.toInt()
            preStat.setInt(2,id)
            var status=preStat.executeUpdate();
            if(status>0){
                print("table is updated")
            }
        }catch (e:SQLException){
            print(e)
        }
    }
    fun deleteData(){
        var preStat:PreparedStatement?=null
        var sql="Delete from demo1 where id=?;"
        try{
            preStat=conn!!.prepareStatement(sql)
            var id= readLine()!!.toInt()
            preStat.setInt(1,id)
            var status=preStat.executeUpdate();
            if (status>0){
                print("data deleted from the table")
            }
        }catch (e:SQLException){
            print(e)
        }
    }
    fun DropTable(){
        var preStat:PreparedStatement?=null
        var sql="DROP table demo1;"
        try{
            preStat=conn!!.prepareStatement(sql);
            var status=preStat.executeUpdate();
            if (status>0){
                print("table deleted")
            }

        }catch (e:SQLException){
            print(e)
        }
    }
    fun trucateTable(){
        var preStat:PreparedStatement?=null
        var sql="Truncate table demo1;"
        try {
            preStat=conn!!.prepareStatement(sql);
            var status=preStat.executeUpdate();
            if (status>0){
                print("table contents deleted")
            }
        }catch (e:SQLException){
            print(e)
        }
    }
    fun insertImage(){
        var preStat:PreparedStatement?=null
        //image datatype BLOB=>MEDIUMLOB,LONGLOB
        var sql="Insert into demo(imagename,image) values(?,?);"
       try {
           var ImageFile: File = File("image1.png");
           var readImageFile=FileInputStream(ImageFile)
           preStat = conn!!.prepareStatement(sql)
           preStat.setString(1, "demo")
           preStat.setBinaryStream(2,readImageFile)
           preStat.executeUpdate();
       }catch (e:Exception){
           print(e)
       }
    }
    fun executeQueryOfDatabase() {
        var stm: Statement? = null
        var res: ResultSet? = null
        var sql = "select * from account"
        try {
            stm = conn!!.createStatement()
               res = stm!!.executeQuery(sql);
               println(res)
                while (res!!.next()) {
                    print("${res.getInt("account_id")}\t")
                    print("${res.getInt("account_no")}\t")
                    print("${res.getInt("account_balance")}\t")
                    print("${res.getString("account_type")}\t")
                    print("${res.getInt("customer_id")}\t")
                    print("${res.getInt("bankid")}\t")

                }
            } catch (e:SQLException){
                println(e)

            } finally {
                if (res != null) {
                    try {
                        res.close()
                        conn!!.close();
                    } catch (e: SQLException) {
                        println(e)
                    }
                }
            }

    }

}

fun main(){
    var jdbcobj=jdbcdemo();
    jdbcobj.createConnection();
    //jdbcobj.executeQueryOfDatabase()
   // jdbcobj.createTable();
   // jdbcobj.createTableUsingstatment();
  //  jdbcobj.insertIntoTable();
    jdbcobj.trucateTable();
}