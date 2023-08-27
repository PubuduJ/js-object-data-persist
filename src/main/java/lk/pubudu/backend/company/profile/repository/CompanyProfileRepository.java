package lk.pubudu.backend.company.profile.repository;

import lk.pubudu.backend.company.profile.entity.CompanyProfile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CompanyProfileRepository extends JpaRepository<CompanyProfile, Integer> {

    Optional<CompanyProfile> getCompanyProfileByCompanyName(String companyName);
}
