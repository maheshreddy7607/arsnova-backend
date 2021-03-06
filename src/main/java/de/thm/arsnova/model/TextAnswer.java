package de.thm.arsnova.model;

import com.fasterxml.jackson.annotation.JsonView;
import de.thm.arsnova.model.serialization.View;
import org.springframework.core.style.ToStringCreator;

import java.util.Date;

public class TextAnswer extends Answer {
	private String subject;
	private String body;
	private boolean read;

	@JsonView({View.Persistence.class, View.Public.class})
	public String getSubject() {
		return subject;
	}

	@JsonView({View.Persistence.class, View.Public.class})
	public void setSubject(final String subject) {
		this.subject = subject;
	}

	@JsonView({View.Persistence.class, View.Public.class})
	public String getBody() {
		return body;
	}

	@JsonView({View.Persistence.class, View.Public.class})
	public void setBody(final String body) {
		this.body = body;
	}

	@JsonView({View.Persistence.class, View.Public.class})
	public boolean isRead() {
		return read;
	}

	@JsonView({View.Persistence.class, View.Public.class})
	public void setRead(boolean read) {
		this.read = read;
	}

	@Override
	@JsonView({View.Persistence.class, View.Public.class})
	public Date getCreationTimestamp() {
		return creationTimestamp;
	}

	@Override
	protected ToStringCreator buildToString() {
		return super.buildToString()
				.append("subject", subject)
				.append("body", body)
				.append("read", read);
	}
}
