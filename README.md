# GDG-School-Android-Workshop

A small application that brings data of books from an XML file and put it in a RecyclerView which shows the details by clicking on each item, and allow the user to read pdf files using implicit intents.

# The way the Workshop happened

* A [Talk](https://www.slideshare.net/fa_gattal/gdg-school-android-workshop) that covered	
  * XML 
  * App components
    * Activity 
    * Service
    * Broadcast receivers 
    * Content providers
  * Activity lifecycle
  * What Happens on Rotation 
  * Views & ViewGroups
  * Some Layouts
    * Linear layout
    * Relative layout (legacy)
    * Constraint layout
    * Grid layout
    * Table layout
    * ListView
    * RecyclerView
  * Intents:
    * explicit intents
    * implicit intents
* A Codelab that was developing that app using the Code above Covering : 
  - Handling events (listeners, onClick, ...)
  - RecyclerView & Adapters
  - Intents
    - explicit intents
    - implicit intents

# Project way of happening:

* One activity Page (MainActivity) : Apply on Views, Layouts, lifecycle,XML,... (Contains the details of the books). 
* RecyclerView + Communication between 2 activities (BookMenu without DB) : Handling Events, Intents, RecyclerView, adapters, XML files like Manifest, Strings, dimens ...
* Connecting to PDF Reader (implementing the button of read the book in the MainActivity) : Apply on communication between two apps. 

# Built With
  - [**Android Studio**](https://developer.android.com/studio/)
  - JAVA

# Authors
- **Abderraouf GATTAL** 

# License
This project is licensed under the MIT License
