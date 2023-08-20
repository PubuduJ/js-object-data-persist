package lk.pubudu.backend.util;

import lk.pubudu.backend.company.profile.entity.CompanyProfile;
import lk.pubudu.backend.dto.CompanyProfileDTO;
import org.springframework.stereotype.Component;

@Component
public class Transformer {

    public CompanyProfileDTO toCompanyProfileDTO(CompanyProfile companyProfile) {
        CompanyProfileDTO companyProfileDTO = new CompanyProfileDTO();
        companyProfileDTO.setCompanyName(companyProfile.getCompanyName());
        companyProfileDTO.setCompanyAddress(companyProfile.getCompanyAddress());
        companyProfileDTO.setEstablishedDate(companyProfile.getEstablishedDate());
        companyProfileDTO.setPrincipleDepartment(companyProfile.getPrincipleDepartment());
        return companyProfileDTO;
    }

    public CompanyProfile toCompanyProfile(CompanyProfileDTO companyProfileDTO) {
        CompanyProfile companyProfile = new CompanyProfile();
        companyProfile.setCompanyName(companyProfileDTO.getCompanyName());
        companyProfile.setCompanyAddress(companyProfileDTO.getCompanyAddress());
        companyProfile.setEstablishedDate(companyProfileDTO.getEstablishedDate());
        companyProfile.setPrincipleDepartment(companyProfileDTO.getPrincipleDepartment());
        return companyProfile;
    }
}
