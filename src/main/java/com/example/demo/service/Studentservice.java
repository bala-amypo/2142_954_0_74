// package com.example.demo.service;
// import java.util.*;
// import org.springframework.stereotype.Service;
// import com.example.demo.entity.Studententity;

// @Service
// public class Studentservice{
//     private Map<Integer,Studententity>
//     details=new HashMap<>();
//     public Studententity savedata(Studententity st){
//         details.put(st.getId(),st);
//         return st;
//     }
//     public Studententity getStudent(int id){
//         return details.get(id);
//     }
//     public List<Studententity> getStudents(){
//         return details.values().stream().collect(Collectors.toList());
//     }
//     public Studententity updateStudent(int id,Studententity st){
//         if(details.containsKey(id)){
//             Studententity existing=details.get(id);
//             existing.setName(st.getName());
//             existing.setEmail(st.getEmail());
//             return existing;
//         }
//         return null;
//     }
// }

package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Studententity;

public interface Studentservice {

    Studententity saveData(Studententity st);

    List<Studententity> getStudents();

    Studententity getStudent(int id);

    Studententity updateStudent(int id, Studententity st);

    void deleteStudent(int id);
}
