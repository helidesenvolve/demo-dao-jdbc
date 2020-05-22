package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Department obj);
	void findBuId(Department obj);
	List<Department> findAll();
	
}
