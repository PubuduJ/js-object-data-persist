package lk.pubudu.backend.company.profile.repository;

import lk.pubudu.backend.company.profile.entity.CompanyProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyProfileRepository extends JpaRepository<CompanyProfile, Integer> {
}
