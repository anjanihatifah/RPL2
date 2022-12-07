package com.toko.bunga.service;

import com.toko.bunga.dao.TokoBungaDao;
import com.toko.bunga.model.TokoBunga;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("TokoBungaService")
@Transactional
public class TokoBungaServiceImpl implements TokoBungaService {
    @Autowired
    private TokoBungaDao tokoBungaDao;

    @Override
    public void save(TokoBunga tokobunga) {
        tokoBungaDao.save(tokobunga);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(TokoBunga tokobunga) {
        tokoBungaDao.update(tokobunga);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(TokoBunga tokobunga) {
        tokoBungaDao.delete(tokobunga);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TokoBunga> getList() {
        return tokoBungaDao.getList();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}