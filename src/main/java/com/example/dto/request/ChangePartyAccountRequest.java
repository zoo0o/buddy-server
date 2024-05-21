package com.example.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ChangePartyAccountRequest {
    private Long partyId;
    private String newLeaderId;
    private String newLeaderPwd;
}
