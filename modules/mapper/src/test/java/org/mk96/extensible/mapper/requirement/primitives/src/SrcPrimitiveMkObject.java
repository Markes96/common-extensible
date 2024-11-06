package org.mk96.extensible.mapper.requirement.primitives.src;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.mk96.common.type.MkObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldNameConstants
public class SrcPrimitiveMkObject extends MkObject {

	private boolean bol = true;

	private byte byt = 1;
	private short shor = 2;
	private int in = 3;
	private long lon = 4L;

	private float flo = 5.0F;
	private double doub = 6.0;

	private char cha = 'A';
	private String stri = "I'm an String";

	private LocalDate date = LocalDate.of(1996, 4, 22);
	private LocalDateTime dateTime = LocalDateTime.of(1996, 4, 22, 10, 30);

}
