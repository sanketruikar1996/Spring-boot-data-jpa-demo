package com.jpa.demo;



import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
@Component
public class DataLoader implements ApplicationListener<ContextRefreshedEvent> {
    private final StudentRepository repository;

    public DataLoader(StudentRepository repos) {
        this.repository = repos;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent cm) 
    {
   
        Student student1 = new Student();
        student1.setage(23);
        student1.setfirst_name("Sanket");
        student1.setlast_name("HInge");
       
        repository.save(student1);

        Student student2 = new Student();
        student2.setage(23);
        student2.setfirst_name("Sanket");
        student2.setlast_name("HInge");
        repository.save(student2);

        Student student3 = new Student();
        student3.setage(23);
        student3.setfirst_name("Sanket");
        student3.setlast_name("HInge");
        repository.save(student3);

       
       
        

       
         
       
      
       

    }


    
}