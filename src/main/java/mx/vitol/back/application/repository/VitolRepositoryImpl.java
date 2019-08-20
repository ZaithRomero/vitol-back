package mx.vitol.back.application.repository;

import mx.vitol.back.application.model.Usrs;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class VitolRepositoryImpl {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public boolean save(Usrs inputUsr) {
        if (inputUsr.getName() == null) {
            return false;
        } else {
            try {
                String q = "Insert into Guests values (0,:Name,:empresa,:giro,:puesto,:email,:celular)";
                em.createNativeQuery(q)
                        //.setParameter("id",inputUsr.getId())
                        .setParameter("Name", inputUsr.getName())
                        .setParameter("empresa", inputUsr.getEmpresa())
                        .setParameter("giro", inputUsr.getGiro())
                        .setParameter("puesto", inputUsr.getPuesto())
                        .setParameter("email", inputUsr.getEmail())
                        .setParameter("celular", inputUsr.getCelular()).executeUpdate();

                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
    }
}
