package dylanbricar.bmi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BMIResponse {
    private double bmi;
    private String corpulence;
}