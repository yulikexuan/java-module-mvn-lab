# Java Module with Maven

## How to know the Java Module Name of a jar

- ``` jar --file=<the jar name> --describe-module```. 
    - For example, ``` lombok-1.18.16.jar ``` is a modular jar and currently in the current folder, then, 
        ``` 
        jar --file=lombok-1.18.16.jar --describe-module
        lombok jar:file:///C:/Users/yul/.m2/repository/org/projectlombok/lombok/1.18.16/lombok-1.18.16.jar/!module-info.class
        exports lombok
        exports lombok.experimental
        exports lombok.extern.apachecommons
        exports lombok.extern.flogger
        exports lombok.extern.java
        exports lombok.extern.jbosslog
        exports lombok.extern.log4j
        exports lombok.extern.slf4j
        requires java.base mandated
        requires java.compiler
        requires java.instrument
        requires jdk.unsupported
        provides javax.annotation.processing.Processor with lombok.launch.AnnotationProcessorHider$AnnotationProcessor
        qualified exports lombok.launch to lombok.mapstruct
        ```
        - The first word in the first line of the output is the module name, "``` lombok ```"
    - ``` guava-30.0-jre.jar ``` is not a modular jar and currently in the current folder, then, 
        ``` 
        jar --file=guava-30.0-jre.jar --describe-module
        No module descriptor found. Derived automatic
        com.google.common@30.0-jre automatic         
        requires java.base mandated                  
        contains com.google.common.annotations       
        contains com.google.common.base              
        contains com.google.common.base.internal     
        contains com.google.common.cache             
        contains com.google.common.collect           
        contains com.google.common.escape            
        contains com.google.common.eventbus          
        contains com.google.common.graph             
        contains com.google.common.hash              
        contains com.google.common.html              
        contains com.google.common.io                
        contains com.google.common.math              
        contains com.google.common.net               
        contains com.google.common.primitives        
        contains com.google.common.reflect           
        contains com.google.common.util.concurrent   
        contains com.google.common.xml               
        contains com.google.thirdparty.publicsuffix  
        ```
        - "com.google.common" in the second line of the output is the module name