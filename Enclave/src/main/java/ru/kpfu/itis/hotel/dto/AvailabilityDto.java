package ru.kpfu.itis.hotel.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AvailabilityDto {
    private Long dateFrom;
    private Long dateTo;
    private Integer roomsNumber;
    private Integer adultsNumber;
    private Integer childNumber;
}
