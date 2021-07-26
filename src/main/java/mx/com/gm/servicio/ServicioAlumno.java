package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.domain.Alumno;
import mx.com.gm.dao.AlumnoDAO;

public class ServicioAlumno {
  private AlumnoDAO alumnoDao = new AlumnoDAO();
  
  public List<Alumno> listarAlumnos(){
      return alumnoDao.listar();
  }
  
  public void guardarAlumno(Alumno alumno){
      if( alumno != null && alumno.getIdAlumno() == null){
          alumnoDao.insertar(alumno);
      }
      else{
          alumnoDao.actualizar(alumno);
      }
  }
  
  
  public void eliminarAlumno(Alumno alumno){
      alumnoDao.eliminar(alumno);
  }
  
  public Alumno encontrarAlumno(Alumno alumno){
      return alumnoDao.buscarPorId(alumno);
  }
}
