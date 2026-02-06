# CSCI 4041 Assignment: Project 1  
###### *Professor Alexi Brooks*  
###### *TA Maryam Kameli*  
###### *Written by Ben Youngbauer*  

**Assignment Language**  
> "For this challenge problem, you will implement one of the algorithms or data structures we discuss."  
> "The point of the exercise is to get you into the weeds - there are often application specific modifications that will need to be made to an algorithm or data structure and this challenge is about dealing with those."  
> "You must document your program, including both in-code comments AND a standalone reference document in searchable format."  
> "You must document your process. Use version control (e.g. git) to document implementation stages and maintain a dev blog with your observations."  
> "Organize and submit a text document containing your notes from Step 2. I'm expecting at least two pages of notes between your user-facing reference document and your dev blog."  
> "Then, either prepare and submit a short (5 minute maximum) video demonstrating your program, or schedule a time to meet with me and present your program (5-10 minutes)"  

**Original Proposal**  
My idea is to use a B-Tree to store a text file, where each node represents a word that occurs in the file, and also stores the index of this occurrence.  
This will then be used not only for searching the text in O(log N) time, but also for more efficient file storage (possibly: it would be reliant on repeated instances of the same word throughout the text).  
After converting the text into a B-Tree, I would flatten it and store it as a binary file to be read later by the program and reconstruct the original text file.  

**TODO**
+ ~~Create basic binary tree implementation~~
+ Convert binary tree to B-tree
+ Implement file scanning for text files
+ Have program scan text files into a B-tree
  + Implement restructuring measures for B-tree nodes (possibly array with index of each instance of each word?)
+ Flatten B-tree into binary file
+ Implement reconstruction protocol from binary file
