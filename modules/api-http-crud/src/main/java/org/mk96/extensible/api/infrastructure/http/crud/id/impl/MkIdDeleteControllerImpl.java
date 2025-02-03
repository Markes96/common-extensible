package org.mk96.extensible.api.infrastructure.http.crud.id.impl;

import org.mk96.extensible.api.crud.domain.service.id.MkIdDeleteService;
import org.mk96.extensible.api.domain.model.MkDomain;
import org.mk96.extensible.api.infrastructure.http.AbstractMkController;
import org.mk96.extensible.api.infrastructure.http.crud.id.MkIdDeleteController;
import org.mk96.extensible.api.infrastructure.http.dto.MkRequestDto;
import org.mk96.extensible.api.infrastructure.http.dto.MkResponseDto;
import org.mk96.extensible.api.infrastructure.http.mapper.MkControllerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;

public class MkIdDeleteControllerImpl<REQ extends MkRequestDto, DOM extends MkDomain, RES extends MkResponseDto, ID>
	extends AbstractMkController<REQ, DOM, RES>
	implements MkIdDeleteController<REQ, DOM, RES, ID> {

	@Autowired
	protected MkIdDeleteService<DOM, ID> service;

	public MkIdDeleteControllerImpl(
			final MkIdDeleteService<DOM, ID> service,
			final MkControllerMapper<REQ, DOM, RES> mapper) {
		this.service = service;
		super.mapper = mapper;
	}

	@Override
	public RES delete(@ModelAttribute final ID id) {
		final DOM domResponse = this.service.delete(id);
		return this.mapper.map(domResponse);
	}

}
