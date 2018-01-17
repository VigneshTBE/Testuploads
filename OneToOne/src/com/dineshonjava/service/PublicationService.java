package com.dineshonjava.service;

import java.util.List;

import com.dineshonjava.bean.PublicationBean;

public interface PublicationService {
	
	public void addPublication(PublicationBean publicationBean);
	
	public List<PublicationBean> getPublications();
	
	public PublicationBean getPublication(int pubId);
	
	public void deletePublication(int pubId);
}
