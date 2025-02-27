package edu.icet.repository.custom;

import edu.icet.model.entity.item.ItemEntity;
import edu.icet.repository.SuperDao;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ItemRepository extends SuperDao , JpaRepository <ItemEntity,String> {


    @Transactional
    @Query(value = "SELECT * FROM item WHERE category = :category",nativeQuery = true)
    List<ItemEntity> findByCategory(@Param("category")String category);

    @Modifying
    @Transactional
    @Query(value = "UPDATE item SET quantity = quantity - :qty WHERE id = :id",nativeQuery = true)
    void updateTable(@Param("id")String id,@Param("qty")Integer qty);

    @Transactional
    @Query(value = "SELECT * FROM item WHERE name LIKE %:search% OR id LIKE %:search% ",nativeQuery = true)
    List<ItemEntity> findLikeANameOrId(@Param("search")String search);


}
