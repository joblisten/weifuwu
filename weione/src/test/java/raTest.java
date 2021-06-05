import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootTest
@ComponentScans(value = {@ComponentScan(basePackages = ""),@ComponentScan(basePackages = "")})
public class raTest {
}
