# java-enc
code written in java to encypt and decrypt message. Based on AES.
compile code using : $ javac enc.java
run code using : $ java enc

E.g suppose i have msg and i want to encrypt then: 
            Enter key here...                                                                      
            qwerty  // <---- key                                                                   
            Enter number if                                                                        
              you have message and you want to decrypt -----------> 1                              
              you have encrypted message and you want decrypt ----> 2                             
            1   //<---- your choice                                                                
           Enter message here...                                                                  
            hello there!    //<---- message                                                        
            Here is your encrypted message...                                                      
            4DTehqp/mbdY03fF2HqXAw==    //<------ encrypted message                                
                                                                                                    

Now lets decrypt same again
            Enter key here...                                                                       
            qwerty                                                                                  
            Enter number if                                                                         
              you have message and you want to encrypt -----------> 1                               
              you have encrypted message and you want decrypt ----> 2                                
            2                                                                                       
            Enter encrypted message here...                                                         
            4DTehqp/mbdY03fF2HqXAw==                                    
            Here is your message...
                                    ---->  hello there!  //<---- this is your message

Inorder to decrypt that one you need to enter same key.

Hang on GUI for same cooming soon with new features
