package org.mk96.extensible.api.crud.application.id;

import org.mk96.extensible.api.application.AbstractMkUseCase;
import org.mk96.extensible.api.crud.domain.port.id.MkIdDeletePort;
import org.mk96.extensible.api.crud.domain.service.id.MkIdDeleteService;
import org.mk96.extensible.api.domain.model.MkDomain;
import org.springframework.beans.factory.annotation.Autowired;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.Delegate;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class MkIdDeleteUseCase<DOM extends MkDomain, ID>
	extends AbstractMkUseCase<DOM>
	implements MkIdDeleteService<DOM, ID> {

	@Delegate
	@Autowired
	protected MkIdDeletePort<DOM, ID> port;

}
