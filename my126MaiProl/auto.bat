@echo on
set LIB=C:\eclipse-jee-oxygen-2-win32\eclipse\eclipse-workspace\my126MaiProl
set CLASSPATH =%LIB%\selenium-server-standalone.jar;%LIB%\auto.jar
javaw org.testng.TESTNG %LIB%\testng.xml
pause


