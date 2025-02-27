package edu.icet.repository.custom;

import edu.icet.model.entity.order_detail.OrderDetailsEntity;
import edu.icet.repository.SuperDao;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface OrderDetailsRepository extends SuperDao, JpaRepository<OrderDetailsEntity,String> {

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM order_details WHERE order_Id = :orderId AND item_Id = :itemId",nativeQuery = true)
    void deleteByOrderIdItemId(@Param("orderId") String orderId,@Param("itemId") String itemId);

    @Transactional
    @Query(value = "SELECT * FROM order_details WHERE order_Id = :orderId AND item_Id = :itemId",nativeQuery = true)
    OrderDetailsEntity findByOrderIdItemId(@Param("orderId") String orderId, @Param("itemId") String itemId);

    @Transactional
    @Query(value = "SELECT * FROM order_details WHERE order_Id = :orderId",nativeQuery = true)
    List<OrderDetailsEntity> findByOrderId(@Param("orderId")String orderId);

}
