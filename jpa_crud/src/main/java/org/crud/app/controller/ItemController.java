package org.crud.app.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.crud.app.model.ItemModel;
import org.crud.app.service.ItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

	@Autowired
	ItemService i_ser;
	@PostMapping("/savepost")
	public ItemModel addDetails(@RequestBody ItemModel item_id)
	{
		return i_ser.saveInfo(item_id);
	}
	
	@GetMapping("/gethm/{item_id}")
	public Optional<ItemModel> getDetails(@PathVariable("item_id") int item_id)
	{
		return i_ser.getInfo(item_id);
	}
	@PutMapping("/puthm")
	public ItemModel updateDetails(@RequestBody ItemModel item_id)
	{
		return i_ser.updateInfo(item_id);
	}
	@DeleteMapping("/delhm/{item_id}")
	public void deleteDetails(@PathVariable ("item_id") int item_id)
	{
		i_ser.deleteInfo(item_id);
	}
	@GetMapping("/sortStudents/{field}")
	public List<ItemModel> sortDetails(@PathVariable String field)
	{
		return i_ser.sortDetails(field);
	}
	@GetMapping("/pagingAndSortingStudents/{offset}/{pageSize}/{field}")

	public List<ItemModel> pagingAndSortingEmployees(@PathVariable int offset,
			@PathVariable int pageSize,
			@PathVariable String field) 
	{
		return i_ser.pagingAndSortingEmployees(offset, pageSize, field);
	}
//	@DeleteMapping("/deleteStudentByName/{username}")
//	public String deleteStudentByName(@PathVariable String username)
//	{
//	int result=i_ser.delete(username)	;
//	if(result >0)
//		return "Student record deleted";
//	else
//		return "Problem occured while deleting";
//	}
	@GetMapping("/get")
	public List<ItemModel>get()
	{
		return i_ser.get();
	}
//	@PutMapping("/update/{name}/{id}")
//
//	public String update(@PathVariable String name,@PathVariable int id)
//
//	{
//
//		int result=i_ser.update(name,id);
//
//		if(result>0)
//
//			return "Updated Successfully";
//
//		else
//
//			return "Problem occur while updating";
//
//	}
}
