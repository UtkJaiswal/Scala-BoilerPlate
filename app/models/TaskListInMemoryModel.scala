package models

import collection.mutable

//object to manage tasklist
object TaskListInMemoryModel {

    //private varible to store users
    private val users = mutable.Map[String,String]("Mark@gmail.com"->"Password")

    private val tasks = mutable.Map[String,List[String]]("Mark@gmail.com"-> List("Make hello","party bolo"))

    //function to check whether a user credentials is correct or not
    def validateUser(username:String,password:String):Boolean ={
        users.get(username).map(_==password).getOrElse(false)
    }

    //function to create a new user
    def createUser(username:String,password:String):Boolean = {
        if(users.contains(username)) false else {
            users(username) = password
            true
        }
    }

    //function to get tasks of the user
    def getTasks(username:String) : Seq[String] = {
        tasks.get(username).getOrElse(Nil)
    }

    def addTask(username:String, task:String):Unit = {
        // below statement add task to tasks in the front
        tasks(username) = task :: tasks.get(username).getOrElse(Nil)
    }

    def removeTask(username:String,index:Int):Boolean = {
        if(index<0 || tasks.get(username).isEmpty || index>=tasks(username).length)
        false
        else {
            // patch method first arguement tell from which element to remove 
            // second tells whether something needs to be added and 
            // third tell how many elements to remove
            tasks(username) = tasks(username).patch(index,Nil,1)
            true
        }
    }
}