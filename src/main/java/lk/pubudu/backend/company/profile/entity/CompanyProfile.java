package lk.pubudu.backend.company.profile.entity;

import lk.pubudu.backend.dto.DepartmentDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "company_profile")
public class CompanyProfile implements Serializable {
    private static final long serialVersionUID = -5748043505016535782L;
    @Id
    private Integer id;
    @Column(name = "company_name", nullable = false, columnDefinition = "VARCHAR(100)")
    private String companyName;
    @Column(name = "company_address", nullable = false, columnDefinition = "VARCHAR(250)")
    private String companyAddress;
    @Column(name = "established_date", nullable = false, columnDefinition = "DATE")
    private Date establishedDate;
    @Column(nullable = false, columnDefinition = "LONGTEXT")
    private DepartmentDTO principleDepartment;
}
