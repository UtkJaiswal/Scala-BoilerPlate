## Setup in the system

- Install Java in the system with the following version:


    ![java-version screenshot](https://imgur.com/kBJi35q.png)
    

- Install sbt and make sure to have the following version:
    
    ![sbt-version screenshot](https://imgur.com/fnLhoDI.png)
    
    


## Steps to run the GurukulBytesBackend project
- Jump into the project directory from the terminal
- Run  `sbt run` command 




## Java Version error 
Getting error of this sort?

![java-version-error screenshot](https://imgur.com/ZTQEaJC.png)

Follow the belows steps:

- Make sure correct Java version and Sbt version are being used for the project

- If issues persists jump into Control panel and search for Environment variables 

- Add variables in System variables as follows:

    - `JAVA_HOME:C:\Program Files\Java\jdk1.8.0_202\bin`

    - `JAVA:C:\Program Files\Java\jdk1.8.0_202\bin` 

- In the Path we need to add 

    - `C:\Program Files\Java\jdk1.8.0_202\bin`




## Frontend Directory details

- The landing page file is in : `GURUKULBYTESBACKEND/generated/app/views/index.scala.html`

- The login page file is in: `GURUKULBYTESBACKEND/generated/app/views/userlogin.scala.html`

- Router file for the frontend API is in : `GURUKULBYTESBACKEND/generated/app/views/Router.scala`
