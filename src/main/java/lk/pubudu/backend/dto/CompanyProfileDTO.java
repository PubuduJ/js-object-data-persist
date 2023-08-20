package lk.pubudu.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyProfileDTO implements Serializable {
    private static final long serialVersionUID = -6596350326347644271L;
    private String companyName;
    private String companyAddress;
    private Date establishedDate;
    private DepartmentDTO principleDepartment;
}
