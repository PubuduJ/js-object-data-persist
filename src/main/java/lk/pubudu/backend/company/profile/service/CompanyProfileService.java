package lk.pubudu.backend.company.profile.service;

import lk.pubudu.backend.company.profile.entity.CompanyProfile;
import lk.pubudu.backend.company.profile.repository.CompanyProfileRepository;
import lk.pubudu.backend.dto.CompanyProfileDTO;
import lk.pubudu.backend.util.Transformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyProfileService {

    private final CompanyProfileRepository companyProfileRepository;
    private final Transformer transformer;

    @Autowired
    public CompanyProfileService(CompanyProfileRepository companyProfileRepository, Transformer transformer) {
        this.companyProfileRepository = companyProfileRepository;
        this.transformer = transformer;
    }

    @Transactional(rollbackFor = Throwable.class)
    public void createCompanyProfile(CompanyProfileDTO companyProfileDTO) {
        CompanyProfile incomingCompanyProfile = transformer.toCompanyProfile(companyProfileDTO);
        companyProfileRepository.save(incomingCompanyProfile);
    }

    public List<CompanyProfileDTO> getAllCompanyProfiles() {
        ArrayList<CompanyProfileDTO> allProfiles = new ArrayList<>();
        List<CompanyProfile> all = companyProfileRepository.findAll();
        for (CompanyProfile companyProfile : all) {
            CompanyProfileDTO companyProfileDTO = transformer.toCompanyProfileDTO(companyProfile);
            allProfiles.add(companyProfileDTO);
        }
        return allProfiles;
    }
}
