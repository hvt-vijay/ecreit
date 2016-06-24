#SyncOn - Provides Sync between Selenium and JIRA

syncOn provides a complete sync between Selenium and JIRA i.e. every failed test case while running an automation script is uploaded to JIRA as a Bug and assigned to the respective developer. Once done an automated summary report is sent over email to all the configured users. SyncOn also updates the status of a test cases if it has passed now which failed earlier in last run. 


### Prerequisities
Add these mentioned below librarries into your project OR You can simply use the <b>pom.xml</b> included in the project
* Apache POI
* JavaMail API
* TestNG
* Log4j


### Configuring syncOn
It involves two simple steps

#### STEP 1: Simply Copy and Paste this listener in your testng.xml file 

```
<listeners>
<listener class-name="org.syncon.utils.SyncListner"></listener>
</listeners>
```

