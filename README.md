## Team2_PP2

Project Summary:
This project uses ANTLR to translate KnightCode programs into Java. A .g4 grammar file was created to allow ANTLR to build the .lexer, .tokens, and .java files that would be used later in the compilation. An error listener was created and extended to catch any potential errors with the grammar and to ensure that any errors that did occur were reported. A compiler class was created to generate .class files for the lexer and parser. All these pieces were tied together by an ANT script that allows for quick step-by-step building and execution of the compiler.

Team Members:
- Ryan Meyer
- Caleb Proffitt
- Elena Milan Lopez

Ant Usage:
     'ant usage': Lists options of available commands for ANT script 
     'ant build-grammar': Receives the .g4 file  and builds .java files to parse the grammar
     'ant compile-grammar': Compiles .java files
     'ant clean-grammar': Cleans and deletes all files/build files in the directory
     'ant clean': Cleans and removes all .class files in the directory
     
Running the Compiler:
To run the compiler, simply enter these commands into the console:
     ant build-grammar
     ant compile-grammar
Once the compile command is executed, it will ask if you would rather have java sourcecode or bytecode, then the name of the program you wish to run, and finally what you would like to name the created java .class file.

Project Log:

10/3/19 | Ryan Meyer | 1.5 hours | Created the github repository and added other team members as collaborators, so they can pull down files to edit. Began investigating changing 
KnightCode into a grammar file. Need to find a way to allow other team members to push correctly to the git repository.

10/3/19 | Elena Milan Lopez | 1.5 hours | Assisted with finding beginning steps to translate KnightCode to a grammar file. Found the correct way to copy the repository initially, then
we can push and pull any changes needed to git hub after this. Tested this method works correctly with github.

10/3/19 | Caleb Proffitt | 1.5 hours | Helped to understand the translation of KnightCode to a grammar file. Researched the correct way to be able to push and pull from the
team repository and discovered how branches can be incorporated into the project.
 
10/6/19 | Caleb Proffitt | 1.5 hours | Wrote initial drafts of the grammar file. Tested creating new branches in the project and using pull requests to merge the new branch into the master branch.

10/7/19 | Ryan Meyer | 1.0 hours | Pulled new files from GitHub. Helped to update the grammar file for the STRING components which allowed it to compile upon further bug testing.

10/7/19 | Caleb Proffitt | 1.0 hours | Pulled project onto the server for testing. Helped finalize the grammar file so that it can be compiled by antlr on the server.

10/7/19 | Elena Milan Lopez | 1.0 hours | Helped complete the grammar file.

10/17/19 | Ryan Meyer | 30 minutes | Made plan to finish the rest of the project. Determined the ANT file needs to be setup next.

10/17/19 | Caleb Proffitt | 30 minutes | Helped plan next steps for project. Going to meet up to work on the ANT file.

10/22/19 | Ryan Meyer | 30 minutes | Created the usage and build sections of the ANT script.

10/23/19 | Ryan Meyer | 1.2 hours | Finished the ANT file by adding the compile-grammar, grun, and clean sections. Helped to create directories for src and bin for grammar and 
class files.

10/24/19 | Ryan Meyer | 2 hours | Worked on editing and creating the ErrorListener.java and MyListener.java to handle different error handling for compilation. 

10/24/19 | Caleb Proffitt | 2 hours | Assisted with adding arguements into ANT file. Began work on the compiler java files.

10/24/19 | Elena Milan Lopez | 2 hours | Helped setup and construct the ErrorListener.java files and researched correct file structure for project. Beginning setup of
MyListener.java file.
