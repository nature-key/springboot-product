package com.springboot.Mapper;

import com.springboot.bean.Product;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper
public interface ProductMapper {
    @Insert("insert into product(pname,type,price) values (#{pname},#{type},#{price})")
    public void add(Product product);

    @Delete("delete from product where pid = #{args1}")
    public void deleteByID(Integer id);

    @Update("update product set pname=#{pname},type=#{type},price=#{price} where pid=#{pid}")
    public Integer update(Product product);

    @Select("select  *  from  product order by pid desc ")
    public List<Product> queryByLists();

    @Select("select *  from  product where pid =#{args1} ")
    public Product getById(Integer id);
}
