package com.example.member.dto;

import com.example.member.entity.MemberEntity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor // 기본생성자를 자동으로 만들어줌
@AllArgsConstructor // 필드를 모두다 매개변수로 하는 생성자를 만들어줌
@ToString // DTO객체가 가지고있는 필드값을 출력할때 Tostring 메소드를 자동으로 만들어줌
public class MemberDTO {
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;

    public static MemberDTO toMemberDTO(MemberEntity memberEntity) {
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(memberEntity.getId());
        memberDTO.setMemberEmail(memberEntity.getMemberEmail());
        memberDTO.setMemberPassword(memberEntity.getMemberPassword());
        memberDTO.setMemberName(memberEntity.getMemberName());
        return memberDTO;
    }
}
