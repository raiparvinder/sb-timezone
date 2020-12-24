package examples.springboot.sbtimezone.rest;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Greeting {
    private final long id;
	private final String content;
    private final LocalDateTime dateLastModified;
	public Greeting(long id, String content) {
		this.id = id;
        this.content = content;
        this.dateLastModified = LocalDateTime.now();
	}

	public long getId() {
		return id;
	}

	public String getContent() {
        StringBuilder sb = new StringBuilder();
        sb.append(content);
        sb.append(" Time now is: ");
        sb.append(dateLastModified);
		return sb.toString();
    }
    
    public LocalDateTime getDateLastModified(){
        return dateLastModified;
    }
}
