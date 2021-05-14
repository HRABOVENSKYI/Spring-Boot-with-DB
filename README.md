# Java-labs
## Lab №10

---
### Task
Реалізувати збереження об'єкту одного з класів з лабораторної роботи №8 в таблиці в базі даних, використовуючи Spring boot та Spring data:
* Код [9 лабораторної](https://github.com/HRABOVENSKYI/Java-labs/tree/lab3) має бути зміненим таким чином, щоб збереження і зчитування даних відбувалось з використанням бази даних
* Код має відповідати code convention
* Код слід перевірити плагінами FindBugs, PMD і Checkstyle, та виправити помилки
* Код має бути залито в репозиторій як окремий pull request (а не в окрему папку чи окремий репозиторій)
* Код має містити окремий клас Controller, Service та інтерфейс Repository
* Налаштування доступу до бази даних має бути реалізоване через проперті файл
---
---
### Running as a SpringBoot App
**Requirements:**
* Git installed and added to the PATH
* JDK installed and added to the PATH
* Maven 3.0+ installed and added to the PATH
* MySQL installed and added to the PATH

**How to run and test it:**

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**Configure MySQL**
* Open MySQL as a root user `mysql -u root -p`
* Create "shop-user" with the password "shop-user" `CREATE USER IF NOT EXISTS 'shop-user'@'localhost' IDENTIFIED BY 'bar';`
* Give this user all priviliges `GRANT ALL on *.* to 'shop-user'@'localhost';`

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**Clone and run app**
* Clone this repository `git clone --single-branch --branch lab41 git@github.com:HRABOVENSKYI/Java-labs.git`
* Go to the root of the project `cd Java-labs`
* Launch App with the help of maven `mvn spring-boot:run`
* Open any web-client, that supports POST, PUT, GET, DELETE http-methods ([POSTMAN](https://www.postman.com/) is recommended) and feel free to test project's endpoints.
---
