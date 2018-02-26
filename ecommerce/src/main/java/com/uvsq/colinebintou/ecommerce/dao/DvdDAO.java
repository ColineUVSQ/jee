package com.uvsq.colinebintou.ecommerce.dao;

import java.util.ArrayList;

import com.uvsq.colinebintou.ecommerce.modele.DVD;

public interface DvdDAO extends DAO<DVD>{
	ArrayList<DVD> findAll();
}
