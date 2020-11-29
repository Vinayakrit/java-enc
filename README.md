# Java message, text & psd encryption & decryption java-enc
code written in _java_ to _encypt_ and _decrypt_ message. Based on _AES_.

compile code using :
>$ javac enc.java

run code using : 

>$ java enc



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
            4DTehqp/mbdY03fF2HqXAw==      //<------ encrypted message                                
                                                                                                    

![Screenshot of encryption](/images/enc.png)


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

![Screenshot of decryption](/images/dec.png)

Hang on __GUI__ for same cooming soon with new features
