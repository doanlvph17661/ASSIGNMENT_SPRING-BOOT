package Assignment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Assignment.entitis.OrderDetail;

@Repository
public interface orderDetailRepositori extends JpaRepository<OrderDetail, Integer>{

}
