package com.putstack.msa_order_service_command.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
public class CancelDTO {
    private String orderId;
}
