package com.uvsq.colinebintou.ecommerce.dao;

import java.util.ArrayList;

import com.uvsq.colinebintou.ecommerce.modele.CD;

public interface CdDAO extends DAO<CD>{
	ArrayList<CD> findAll();
}
