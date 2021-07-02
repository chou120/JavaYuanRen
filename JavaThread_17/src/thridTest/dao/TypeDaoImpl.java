package thridTest.dao;

import thridTest.db.DbUtil;
import thridTest.pojo.Type;

import java.util.List;

public class TypeDaoImpl implements TypeDao{
    @Override
    public Type getById(Integer id) {
        List<Type> typeList = DbUtil.getTypeList();
        for (Type type : typeList) {
            if(type.getId().equals(id)){
                return  type;
            }
        }
        return null;
    }

    @Override
    public List<Type> getAlltype() {

        return DbUtil.getTypeList();
    }
}
