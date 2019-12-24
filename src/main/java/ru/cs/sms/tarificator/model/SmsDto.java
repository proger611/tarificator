package ru.cs.sms.tarificator.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.cs.sms.tarificator.cnst.Const;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SmsDto implements Serializable {
	
	private Long messageId;
	
	private String phone;
	
	private String userId;
	
	private String subUserId;
	
	private Const.TYPE type;
	
	private String msg;
	
	private String comment;
	
	private List<String> pduMsg;
	
	private Integer count;
	
	private Integer retr;
	
	private LocalDateTime dateReceived;
	
	private Const.STATUS status;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
