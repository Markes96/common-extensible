package org.mk96.extensible.api.infrastructure.http.crud.id.type;

import org.mk96.extensible.api.domain.model.MkDomain;
import org.mk96.extensible.api.infrastructure.http.crud.id.MkIdCreateController;
import org.mk96.extensible.api.infrastructure.http.dto.MkRequestDto;
import org.mk96.extensible.api.infrastructure.http.dto.MkResponseDto;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface MkTypeIdCreateController<REQ extends MkRequestDto, DOM extends MkDomain, RES extends MkResponseDto, ID>
	extends MkIdCreateController<REQ, DOM, RES, ID> {

	@Override
	@PutMapping("/create/{id}")
	RES create(@RequestParam ID id, @RequestBody REQ body);

}
