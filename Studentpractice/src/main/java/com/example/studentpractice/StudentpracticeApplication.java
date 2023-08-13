package com.example.studentpractice;

import com.example.studentpractice.entities.Student;
import com.example.studentpractice.respositories.StudentRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;


@SpringBootApplication
public class StudentpracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentpracticeApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){

        return args -> {
            studentRepository.save(new Student(null, "Jam", new Date(), false, 1.2));
            studentRepository.save(new Student(null, "Jen", new Date(), true, 3.2));
            studentRepository.save(new Student(null, "Jok", new Date(), false, 1.0));
            studentRepository.save(new Student(null, "Jos", new Date(), false, 4.2));
            studentRepository.findAll().forEach(p->{
                System.out.println(p.getName());
            });
        };
    }

//    @Bean
//    CommandLineRunner commandLineRunner(SaleRepository salesRepository){
//
//        return args -> {
//            salesRepository.save(new Sales(null,"Jessica Lam","Washing Machine", 4000.00, new Date()));
//            salesRepository.save(new Sales(null,"Janna San","Music System", 3000.00, new Date()));
//
//            salesRepository.findAll().forEach(p->{
//                //		System.out.println(p.getName());
//            });
//        };
//    }
}

