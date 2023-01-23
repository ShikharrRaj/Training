
import java.sql.*

class task {
    var conn: Connection?=null;
    fun createConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver")
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_system", "root","Monu13Monu13@")
            if(conn!=null){
                println("Connection done")
            }
            println("Connect")
        }catch (e: SQLException){
            print(e)

        }
    }
    fun createTable(){
        var prestat: PreparedStatement?=null
        var sql="create table task_1(id int auto_increment,name varchar(255),age int not null,primary key(id));"
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
        var sql="insert into task_1(name,age) values(?,?);"
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
    fun searchData(){
        var stm: Statement? = null
        var res: ResultSet? = null
        var searchAge= readln().toInt();
        var sql = "select * from task_1 where age= $searchAge "
        try {
            stm = conn!!.createStatement()
            res = stm!!.executeQuery(sql);
            println(res)
            while (res!!.next()) {
                print("${res.getInt("id")}\t")
                print("${res.getString("name")}\t")
                print("${res.getInt("age")}\t")


            }
        } catch (e:SQLException) {
            println(e)
        }finally {
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
    var taskobj=task();
    taskobj.createConnection();
  loop@ while (true){
       println(" 1. Create Table\n 2. Insert data\n 3. Search data\n 4. Exit");
       var choice:Int= readln()!!.toInt();
        when(choice){
            1->taskobj.createTable();
            2->taskobj.insertIntoTable();
            3-> taskobj.searchData();
            4->break@loop

        }
  }



}