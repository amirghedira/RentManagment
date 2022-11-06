# Overview 

 After discovering java and diving into it in 2019, I wanted to use my knowledge in java to create an application from scratch using swing. So this application is all about managing rents, cars and clients, this app could be helpful for managers who rent cars.
Actually, with it you can control your rents, your cars and getting all details about a specific client or a specific rents such as  the history of clients who rented the car, or the history of cars which been rented by a client 

 # Features / Technologies 
 To begin the main feature I toggled it was the facility to manage rends and cars and clients, actually, you can add cars with all the specific details of it such as serial number, color, price for one day renting, you can even upload the photo of the car.
In addition you can add rents which is the main feature of this application. In fact, if the client exists previously, his in will show up while you type it and you can select it. Once you select the NCIN all the fields will be filled automatically for that client. The other case, when the client doesn't exist, you need to feel the fields specific to that client such as his name his address his NCIN number, etc..., and you need to upload an image about his NCIN for rent security purposes.
After validating the rent, the client will be added automatically with the rent. The car will not be available anymore.
Also, the manager can free his cars and get the list of available cars and the rented cars with all the details of each car.
In addition, when a specific location expires the manager will automatically receive a notification, which mention location ( car serial number, NCIN client) has been expired.
Adding to all that, this application can be shared between the managers and his workers. In fact, accessing the application is requiring an account. The first account created is the 'root' account which belongs to the manager. The root account has access which a user account don't have, such as deleting client, editing the username or password of a specific client, etc...
To create an account you have to click on login and add a secret key which is hardcoded in the database, with that, you guarantee that not anyone can create an account and access the application. Only the root account can edit that key.
Finally, the root account can access the history of the application is self and can see all the actions made in the application such as deleting a car, adding a location, etc... 
# Platform & Libraries 

Actually the file contains the database file, you can simply import it and work with it. surely I used MySQL as a database. 
I used MySQL driver for Java which I added in the project folder 
The project itself is in the project folder you will find all the classes.
The main class which I implemented the swing application and other classes such as database, client, location, car, agency and etc..
I used ImageCellRenderer class to display an image in the cell of a Jtable.
And i used also IconCellRendered to display an icon in the cell of a Jtable.
Finally, I used JTattoo-1.6.11 jar file to make the application looks good and well designed. I wanted to use jcalendar but I didn't find a use case for it. With this jar file, you can display a nice selector of date without actually coding it. 
# What I learned ?

 When I finished learning coding with java, the goal was to make a functional user interface with java. So with this application, I learned how components work in java and how you apply layouts to style your application. Also, I learned how to connect to a database and managing requests. it was a long project and a nice experience for me.
