package lk.pubudu.backend.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lk.pubudu.backend.dto.DepartmentDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.AttributeConverter;

public class DepartmentConverter implements AttributeConverter<DepartmentDTO, String> {

    private static final Logger logger = LoggerFactory.getLogger(DepartmentConverter.class);
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(DepartmentDTO departmentDTO) {
        String departmentInfo = null;
        try {
            departmentInfo = objectMapper.writeValueAsString(departmentDTO);
        } catch (Throwable e) {
            logger.error("JSON writing error", e);
        }
        return departmentInfo;
    }

    @Override
    public DepartmentDTO convertToEntityAttribute(String dbData) {
        DepartmentDTO departmentDTO = null;
        try {
            departmentDTO = objectMapper.readValue(dbData, new TypeReference<DepartmentDTO>() {});
        } catch (Throwable e) {
            logger.error("JSON reading error", e);
        }
        return departmentDTO;
    }
}
