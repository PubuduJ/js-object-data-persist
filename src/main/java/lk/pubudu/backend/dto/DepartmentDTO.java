package lk.pubudu.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDTO implements Serializable {
    private static final long serialVersionUID = 2611854922815303303L;
    private String departmentName;
    private Integer noOfEmployees;
    private Set<EmployeeDetailsDTO> employeeDetails;
}
