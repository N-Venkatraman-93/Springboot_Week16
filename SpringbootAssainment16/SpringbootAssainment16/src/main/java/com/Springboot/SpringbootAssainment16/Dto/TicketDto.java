package com.Springboot.SpringbootAssainment16.Dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TicketDto {

  private Long id;
  @NotEmpty private String title;
  private String url;
  @NotEmpty private String content;
  @NotEmpty private String shortDescription;
  private LocalDateTime createdOn;
  private LocalDateTime updatedOn;
}
