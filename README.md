<h1>SyncOn - Provides Sync between Selenium and JIRA</h1>


<p>syncOn provides a complete sync between Selenium and JIRA i.e. every failed test case while running an automation script is uploaded to JIRA as a Bug and assigned to the respective developer. Once done an automated summary report is sent over email to all the configured users. SyncOn also updates the status of a test cases if it has passed now which failed earlier in last run. </p>


<p>This project uses GPL-LICENSE.</p>

<h3>Prerequisities </h3>
<p>Add these mentioned below librarries into your project OR You can simply use the <b>pom.xml</b> included in the project</p>
<ul>
<li>Apache POI</li>
<li>JavaMail API</li>
<li>TestNG</li>
<li>Log4j</li>
</ul>

<h3>Configuring syncOn</h3>
<p>It involves two simple steps</p>

<h5><b>STEP 1:</b> Simply Copy and Paste this listener in your testng.xml file</h5>
<p style="color:#3F7F7F;"><listeners></p>
<p><</p>listener class-name="org.syncon.utils.SyncListner"></listener></p>
<p style="color:#3F7F7F;"></listeners></p>

<p>Congratulation , IonicExtention is added in Netbeans IDE <br> Enjoy!</p>
