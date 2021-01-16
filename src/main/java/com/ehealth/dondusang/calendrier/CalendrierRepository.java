package com.ehealth.dondusang.calendrier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@CrossOrigin
@RepositoryRestResource
public interface CalendrierRepository extends JpaRepository<Calendrier, Long> {
	


}
