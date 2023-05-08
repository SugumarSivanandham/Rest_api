package org.crud.app.repository;

import java.util.List;

//import java.util.List;

import org.crud.app.model.ItemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

//@Repository
public interface ItemRepo extends JpaRepository<ItemModel, Integer> {
	//List<ItemModel> findByNameStartingWith(String prefix);
	//List<ItemModel> findByNameEndingWith(String suffix);
	//List<ItemModel> findCountry(String country);
//	ItemModel findByusername(String username);
	@Modifying
	@Query(value="select * from item_model ",nativeQuery=true)
	public List<ItemModel> GetAll();
//    @Modifying
//	@Query("delete from ItemModel i where i.username=?1")
//	public int DeleteItemByUsername(String username);
//    @Modifying



//    @Query("update ItemModel e set e.username=?1 where e.userid=?2")
//
//	public int UpdateItemById(String username,int userid);
}