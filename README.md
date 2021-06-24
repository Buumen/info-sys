# info-sys

Oktatási Nyilvántartó Rendszer

Mielőtt elindítaná az applikációt, szükség lesz egy MySQL szerverre és azon belül egy "enaplodb" nevű adatbázisra.

Az adatbázis bejelentkezéshez, ha szükséges, meg kell változtatni a bejelentkezési felhasználónevet és jelszót a enaplo > src > main > resources > application.properties nevű fájlban az alábbi sorok javításával. 
spring.datasource.username=felhasználónév
spring.datasource.password=jelszó

--- RUN --- 
Back-end: enaplo > mvn spring-boot:run
Front-end: enaplo-app > ng serve

Alapesetben 4 felhasználó léphet be (felhasználónév/jelszó): 
Rendszergazda: admin/admin 
Tanár: tanár(1-9)/tanár (kivéve tanár2 és tanár3) 
Igazgató: tanár(2-3)/tanár 
Tanuló: tanuló(1-20)/tanuló
