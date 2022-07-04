package unit_tests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestedClass {
    private String testedField;

    private String privateTest() {
        return "private-test-string";
    }
}
