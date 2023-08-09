package com.example.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import scala.math.BigDecimal;

public record ProductRecordDto(@NotBlank String name, @NotNull BigDecimal value) {

}
