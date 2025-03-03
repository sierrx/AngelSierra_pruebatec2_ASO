package com.bbva.uuaa.helloWorld.facade.v0.impl;

import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponseCreated;
import com.bbva.uuaa.helloWorld.business.v0.IBSrvHelloWorld;
import com.bbva.uuaa.helloWorld.facade.v0.ISrvHelloWorld;
import com.bbva.uuaa.helloWorld.facade.v0.dto.DataIn;
import com.bbva.uuaa.helloWorld.facade.v0.dto.DataOut;
import com.bbva.uuaa.helloWorld.facade.v0.mapper.ISrvHelloWorldMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bbva.jee.arq.spring.core.servicing.annotations.SMC;
import com.bbva.jee.arq.spring.core.servicing.annotations.SN;
import com.bbva.jee.arq.spring.core.servicing.annotations.VN;
import javax.validation.Valid;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


@Service
@SN (registryID = "SNGG20240999", logicalID = "helloWorld")
@VN (vnn = "v0")
@Path("/v0")
public class SrvHelloWorld implements ISrvHelloWorld {

	@Autowired
	private IBSrvHelloWorld bSrvHelloWorld;

	@Autowired
	private ISrvHelloWorldMapper mapper;

	@Override
	@POST
	@Path("/simulations/{nuip}")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	@SMC(registryID = "SMGG20240680", logicalID = "ejercicio")
	public ServiceResponseCreated<DataOut> login(@Valid DataIn dataIn, @PathParam("nuip") String nuip) {
		dataIn.setNuip(nuip);
		return ServiceResponseCreated.data(mapper.toDataOut(bSrvHelloWorld.mapBusiness(mapper.toBDataIn(dataIn)))).build();
	}

}
