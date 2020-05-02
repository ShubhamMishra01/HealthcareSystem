package com.cg.dao;


import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.bean.Test;


@Repository
public interface TestRepository extends JpaRepository<Test,Serializable>
{

}