package com.Springboot.SpringbootAssainment16.Entity;

import java.time.LocalDateTime;



import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tickets")
public class Ticket {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String title;

  @Column(nullable = false)
  private String url;

  @Lob
  @Column(nullable = false)
  private String content;

  private String shortDescription;

  @CreationTimestamp private LocalDateTime createdOn;

  @UpdateTimestamp private LocalDateTime updatedOn;

  public Object getStatus() {
    // TODO Auto-generated method stub
    return null;
  }

  public void setStatus(Object status) {
    // TODO Auto-generated method stub

  }
}
