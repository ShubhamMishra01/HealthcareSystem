package com.cg.dao;


import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.bean.Diagnostic_center;


@Repository
public interface Diagnostic_centerRepository extends JpaRepository<Diagnostic_center,Serializable>
{

}