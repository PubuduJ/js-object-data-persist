package lk.pubudu.backend.company.profile.controller;

import lk.pubudu.backend.company.profile.service.CompanyProfileService;
import lk.pubudu.backend.dto.CompanyProfileDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/company-profiles")
public class CompanyProfileController {

    private final CompanyProfileService companyProfileService;

    @Autowired
    public CompanyProfileController(CompanyProfileService companyProfileService) {
        this.companyProfileService = companyProfileService;
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public ResponseEntity<CompanyProfileDTO> createCompanyProfile(@RequestBody CompanyProfileDTO companyProfileDTO) {
        companyProfileService.createCompanyProfile(companyProfileDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(companyProfileDTO);
    }

    @GetMapping(produces = "application/json")
    public ResponseEntity<List<CompanyProfileDTO>> getAllCompanyProfiles() {
        return ResponseEntity.status(HttpStatus.OK).body(companyProfileService.getAllCompanyProfiles());
    }
}
