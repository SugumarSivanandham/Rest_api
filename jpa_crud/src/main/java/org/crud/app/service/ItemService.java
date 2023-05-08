package org.crud.app.service;

import java.util.List;
import java.util.Optional;

import org.crud.app.model.ItemModel;
import org.crud.app.repository.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class ItemService {
	@Autowired
    ItemRepo i_repo;
	public ItemModel saveInfo(ItemModel i)
	{
		return i_repo.save(i);
	}
	public Optional<ItemModel> getInfo(int item_id)
	{
		return i_repo.findById(item_id);
	}
	public ItemModel updateInfo(ItemModel iu)
	{
		return i_repo.save(iu);
	}
	public void deleteInfo(int item_id)
	{
		i_repo.deleteById(item_id);
	}
	public List<ItemModel> sortDetails(String field)
	{
		return i_repo.findAll(Sort.by(field));
	}
	public List<ItemModel> pagingAndSortingEmployees(int offset,
			int pageSize,String field) {
			Pageable paging = PageRequest.of(offset, pageSize).withSort(Sort.by(field));
			Page<ItemModel> stud=i_repo.findAll(paging);
			return stud.getContent();
			}

	@Transactional
	public List<ItemModel> get()
	{
		return i_repo.findAll();
	}
//	@Transactional
//	public int delete(String username)
//	{
//		return i_repo.DeleteItemByUsername(username);
//	}
//	@Transactional
//
//	 public int update(String name,int id)
//
//	 {
//
//		 return i_repo.UpdateItemById(name,id);
//
//	 }
}
