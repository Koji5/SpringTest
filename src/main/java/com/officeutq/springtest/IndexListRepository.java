package com.officeutq.springtest;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndexListRepository extends JpaRepository<IndexListDto, Long>  {
	IndexListDto findByScreenId(String screenId);
	List<IndexListDto> findAll(Sort sort);
}
