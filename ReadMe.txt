About Project:
The project covers the 4 end-to-end scenarios of openweathermap.org site.

Project Configuration:
Its a Maven project which is based on Cucumber BDD framework based on JUnit. 

Project Execution:
The entire project could be executed via 3 different ways:
1. Run feature file directly (right click on feature file> run as > Cucumber Feature)
2. Run as Maven Build (right click on project > run as > Maven build)
3. Run as JUnit Test (right click on project > run as > JUnit Test)

Key Features
1. Its a BDD framework, made such that many more scenarios could be added either to the same feature files or in multiple feature files.
2. Since it is a maven project, it can be configured with CI pipeline, for ex using Jenkins.
3. The report is easily configurable and format can be changed simple by altering in TestRunner class. 
4. All the locators are mentioned separately in OR.properties file so the scripts need minimum maintenance, if locators are changed. 
5. All the config details are fetched from CONFIG.properties file
6. None of the values are hardcoded in stepdefination.

Features that can be implemented, if i have more time
1. Cucumber reporting
2. Error handling i.e. try/catch or throws clause
3. Log4j logs (instead of System.out.print statements, which is used currently)
