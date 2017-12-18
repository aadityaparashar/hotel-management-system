# Hotel Management System

This is a VERY simple Hotel Management System. There are five forms, home plus four more including Visitor Management, Room Availibility, House Keeping and Customer Registration. <br>
I'll explain each briefly below, but a better expanation would be talking to me in person ;D 
<hr>

### Visitor Management 
This is used to see the entire list of registered guests, and delete them if needed. 
In the next version of the app, they will be linked in the database to the room reservation table so that we can get more funcionality in this form.

### Room Availibility
This is a form to reserve rooms in the hotel, there is a jDateChooser used for simplicity and better UI. 
This version shows the list of rooms and you can only book by entering a Customer ID, and if the room is not availible then it will prompt you then. 
In the next version we shall filter out the unavailible rooms before and add better oprions to register them.

### House Keeping
This is to mentain which rooms are cleaned - this version is for a "cheap" hotel, so the housekeeping only cleans the room after you Check-Out,
The 'Refresh' button filters the database and then marks the room 'not clean' (cleaned = no) in the database.

### Customer Registeration
This is to add new customer registrations in the databse, you can also search before you add - to avoid redundancy.
In future this might be fully incorporated in the Visitor management form.

### Home
Does nothing great in itself, just provides links to forms which matter - and it looks cool. 

<hr>

### History
This example was created by me in 2015 as a high school project and has been slightly modified in 2017 for this project..
For the demo a localhost database is being used, but the commands to create your own database are provided in the 'data.sql' file.
I have uploaded a screenshot of one of the files to proove that this is my work, as I did a bulk upload of the project, screenshot in '2015' folder.

NB! If you find bugs (which you will) - let me know, I'll tell you they are features (and then fix them :P) <br>
NB! The code is mostly not commented, I'll be commenting some of it and pushing it in the next couple of days.. 
<hr>

## Language
Java

## Running

Import the project folder in your IDE or run the '.jar' from the 'dist' folder <br>
[Use the '.jar', It seems more legit thanks to the splash screen]

<hr>
END OF README, THIS IS
<hr>
