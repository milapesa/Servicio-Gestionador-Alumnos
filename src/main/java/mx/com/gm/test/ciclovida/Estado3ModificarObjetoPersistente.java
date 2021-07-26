package mx.com.gm.test.ciclovida;

import javax.persistence.*;
import mx.com.gm.domain.Contacto;

public class Estado3ModificarObjetoPersistente {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        //difinimos la variable
        Contacto contacto = null;
        
        //recuperamos el objeto
        //1.Transitivo
        contacto = em.find(Contacto.class, 3);
        
        //2.modificamos
        contacto.setEmail("clara@mail.com");
        
        
        em.getTransaction().begin();
      
        //2.Persistente
        em.persist(contacto);
        
        em.getTransaction().commit();
        
        //3. detached
        System.out.println("contacto = " + contacto);
    }    
}
