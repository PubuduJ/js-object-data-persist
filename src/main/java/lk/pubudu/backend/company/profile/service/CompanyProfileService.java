package lk.pubudu.backend.company.profile.service;

import lk.pubudu.backend.company.profile.entity.CompanyProfile;
import lk.pubudu.backend.company.profile.repository.CompanyProfileRepository;
import lk.pubudu.backend.dto.CompanyProfileDTO;
import lk.pubudu.backend.util.Transformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
