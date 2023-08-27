package lk.pubudu.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDetailsDTO implements Serializable {
    private static final long serialVersionUID = 2546832985237464395L;
    private Integer employeeId;
    private String employeeName;
    private String employeeDesignation;
    private DepartmentDTO responsibleDepartment;
}
