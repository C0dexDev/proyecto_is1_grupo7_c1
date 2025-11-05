package com.is1.proyecto.models;

//import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.Table;

@Table("teachers") // Esta anotación asocia explícitamente el modelo 'Teacher' con la tabla 'teacher' en la DB.
public class Teacher extends Person {
    
    private Person persona;

    public Person getPerson(){
        if(persona == null){
            persona = parent(Person.class);
        }
        return persona;
    }

    @Override
    public String getFirstName() {
        return getPerson().getString("first_name"); // Obtiene el valor de la columna 'name'
    }

    @Override
    public void setFirstName(String name) {
        getPerson().set("first_name", name);
    }

    @Override
    public String getLastName() {
        return getPerson().getString("last_name");
    }

    @Override
    public void setLastName(String lastname) {
        getPerson().set("last_name", lastname);
    }

    @Override
    public Integer getDNI(){
        return getPerson().getInteger("dni");
    }

    @Override
    public void setDNI(int dni) {
        getPerson().set("dni", dni);
    }
    
// Atributos propios de Teacher

    public String getDegree(){
        return getString("degree");
    }

    public void setDegree(String degree){
        set("degree", degree);
    }
    
    public String getMail(){
        return getString("mail");
    }

    public void setMail(String mail){
        set("mail", mail);
    }
}

