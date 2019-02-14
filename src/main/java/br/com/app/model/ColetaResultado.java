package br.com.app.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "coleta_resultado")
public class ColetaResultado implements Serializable {

  private static final long serialVersionUID = 8385278695918255359L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(columnDefinition = "LONGVARCHAR")
  private String json;

  private LocalDateTime scanDateTime;

  private Boolean enviadoStatus;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getJson() {
    return json;
  }

  public void setJson(String json) {
    this.json = json;
  }


  public LocalDateTime getScanDateTime() {
    return scanDateTime;
  }

  public void setScanDateTime(LocalDateTime scanDateTime) {
    this.scanDateTime = scanDateTime;
  }

  public Boolean getEnviadoStatus() {
    return enviadoStatus;
  }

  public void setEnviadoStatus(Boolean enviadoStatus) {
    this.enviadoStatus = enviadoStatus;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    ColetaResultado other = (ColetaResultado) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }



}
