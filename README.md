#SyncOn - Provides Sync between Selenium and JIRA

syncOn provides a complete sync between Selenium and JIRA i.e. every failed test case while running an automation script is uploaded to JIRA as a Bug and assigned to the respective developer. Once done an automated summary report is sent over email to all the configured users. SyncOn also updates the status of a test cases if it has passed now which failed earlier in last run. 


### Prerequisities
Add these mentioned below librarries into your project OR You can simply use the <b>pom.xml</b> included in the project
* Apache POI
* JavaMail API
* TestNG
* Log4j


### Configuring syncOn
It involves two steps :

##### STEP 1: Simply Copy and Paste this listener in your testng.xml file 

```
<listeners>
<listener class-name="org.syncon.utils.SyncListner"></listener>
</listeners>
```

##### STEP 2: Add syncon.properties file in classpath

Syncon can be completely configured by simply adding syncon.properties file in classpath. Below are the mandatory properties keys which we need to define in this properties file before running a syncon project:

```
#Use tool JIRA
syncon.initiateTool = JIRA

#Default assignee to whom all the created bugs will be assigned
defaultAssignee = assignee

#Default priority of the issues
defaultPriority = Highest

#JIRA project under which all the Bugs will be upadated
defaultJIRAProject = TestJIRAProject

#Unique syncon_projectID 
syncon.ProjectID = SyncOnProject

#Element ID for the passed testcases (Can be retrieved by using )
syncon.JIRAPassedElementID = action_id_11

#Element ID for the failed testcases
syncon.JIRAFailedElementID = action_id_15

#URL to the JIRA tool used
syncon.initiateTool.URL = https://yourURL.atlassian.net/login

#Login Username for JIRA
syncon.initiateTool.Username = admin

#Login Password for JIRA
syncon.initiateTool.Password = admin

```



