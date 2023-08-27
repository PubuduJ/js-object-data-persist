package lk.pubudu.backend.company.profile.entity;

import lk.pubudu.backend.dto.DepartmentDTO;
import lk.pubudu.backend.util.DepartmentConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "company_name", unique = true, nullable = false, columnDefinition = "VARCHAR(100)")
    private String companyName;
    @Column(name = "company_address", nullable = false, columnDefinition = "VARCHAR(250)")
    private String companyAddress;
    @Column(name = "established_date", nullable = false, columnDefinition = "DATE")
    private Date establishedDate;
    @Convert(converter = DepartmentConverter.class)
    @Column(nullable = false, columnDefinition = "LONGTEXT")
    private DepartmentDTO principleDepartment;
}
