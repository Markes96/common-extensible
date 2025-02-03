package org.mk96.extensible.api.infrastructure.http.crud.id;

import org.mk96.extensible.api.domain.model.MkDomain;
import org.mk96.extensible.api.infrastructure.http.MkController;
import org.mk96.extensible.api.infrastructure.http.dto.MkRequestDto;
import org.mk96.extensible.api.infrastructure.http.dto.MkResponseDto;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

public interface MkIdDeleteController<REQ extends MkRequestDto, DOM extends MkDomain, RES extends MkResponseDto, ID>
	extends MkController<REQ, DOM, RES> {

	@DeleteMapping("/delete")
	RES delete(@ModelAttribute ID id);

}
