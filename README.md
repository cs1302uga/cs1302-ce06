# ce06 Interfaces (ADTs)

This class exercise is designed to get you aquainted with Interfaces in Java.

## Prerequisite Knowledge

* A basic understanding of creating and implementing interfaces in Java.
* https://github.com/cs1302uga/cs1302-tutorials/blob/master/interfaces/interfaces.md

## Questions

In your notes, clearly answer the following questions. These instructions assume that you are 
logged into the Nike server. 

**NOTE:** If a step requires you to enter in a command, please provide in your notes the full 
command that you typed to make the related action happen. If context is necessary (e.g., the 
command depends on your present working directory), then please note that context as well.

### Getting Started

1. Use Git to clone the repository for this exercise onto Nike into a subdirectory called `cs1302-ce06`:

   ```
   $ git clone https://github.com/cs1302uga/cs1302-ce06.git
   ```
1. Change into the `cs1302-ce06` directory that was just created and look around. There should be
   multiple Java files contained within the directory structure. To see a listing of all of the 
   files under the current directory, use the `find` command as follows:
   
   ```
   $ find .
   ```
   
   For each Java file in each `cs1302-ce06` subdirectory, fill out a table similar to the following:
   
   | Name of the Java file | Interface or Implementing Class | Fully Qualified Name (FQN) |
   |-----------------------|---------------------------------|----------------------------|
   |-----------------------|---------------------------------|----------------------------|
   |-----------------------|---------------------------------|----------------------------|
   |-----------------------|---------------------------------|----------------------------|
   

1. List the abstract methods found in the `Driveable` interface.

1. Generate the javadoc for all code in the `cs1302` package. Host the documentation on nike using 
   `cs1302-ce06-doc` as the name for your symbolic link. 
   
1. Look in the `speedUp` method in the source code for `Car.java`. Note that there are no Javadoc 
   comments for that method. How is it possible that it is documented on the website?

**CHECKPOINT**

1. Make sure you are still in the `cs1302-ce06` directory. Compile `Drivable.java` and place the compiled
   code under the `bin` directory. Notice that interfaces are really just Java classes that are compiled
   in the same way.
   
1. Compile `Car.java`.  Uh-oh.  What compile-time error was generated?  Modify `Car.java` to fix the error
   and recompile.
   
1. 

1. Verify that files were generated and placed in the `doc` directory before continuing.
   What do the `-d`, `-sourcepath`, and `-subpackages` options mean?

1. Use `ln` to create a symbolic link (shortcut) named `cs1302-ce05-doc` in your `public_html` 
   directory. The symbolic link should link to the `doc` subdirectory containing the API documentation 
   website created in a previous step. Write the exact command used in your notes. 
   
   **NOTE:** You are fully responsible for anything that you host through your Nike website.
   
1. The symbolic link created in the last step is called `cs1302-ce05-doc`. You can see it if you
   change into your `public_html` directory and perform an `ls -l`. What are two things in
   the output of `ls -l` that let you know `cs1302-ce05-doc` is a symbolic link?

1. Navigate to the following URL in your web browser, replacing `user` with your Nike
   username:

   ```
   http://cs.uga.edu/~user/cs1302-ce05-doc/
   ```

   You should see the API documentation website that you generated. Does this website look 
   similar to any other websites that you may have visited? If so, what? You can be general 
   in your response.

**CHECKPOINT**
    
### Writing API Documentation

1. From the API documentation website, click on one of the links to the `House` class. How many 
   methods currently contain Javadoc comments?
   
1. In `House.java`, some of the methods already have multiline, non-Javadoc comments.  Transform the 
   comments into Javadoc using the appropriate syntax. In each Javadoc comment, include one or more 
   properly punctuated sentences that describe the method. You may base these sentences off the existing
   comments. Be sure to also include tags that document, as needed, the parameters and return type. 
   Leave out any propagated exceptions for now. 
   
   Use the `@code` tag where appropriate in your description.
   
1. In `House.java`, the class itself also has multiline, non-Javadoc comments.  Transform the comments 
   into Javadoc using the appropriate syntax. Try to preserve the multi-paragraph nature of the existing
   comment.
   
1. Run the `javadoc` tool to update your API documentation website on `nike`.

**CHECKPOINT**

### Throwing Exceptions

1. To ensure that a `House` object cannot have a negative price, modify the constructor and the
   `setPrice` method to throw an exception when the `price` parameter is negative.
   
1. Update your Javadoc comments with the appropriate `@throws` tags.

1. Run the `javadoc` tool to update your API documentation website on `nike`.

**CHECKPOINT**
    
<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/)

<small>
Copyright &copy; Michael E. Cotterell, Brad Barnes, and the University of Georgia.
This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>
