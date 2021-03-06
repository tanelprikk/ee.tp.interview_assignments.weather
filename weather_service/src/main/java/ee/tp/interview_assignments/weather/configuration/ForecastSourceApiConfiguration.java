package ee.tp.interview_assignments.weather.configuration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

import java.util.Map;

@ConstructorBinding
@ConfigurationProperties(prefix = "forecast.source-api")
@Getter
@AllArgsConstructor
public class ForecastSourceApiConfiguration {
    private final String host;
    private final String path;
    private final Map<String, String> parameters;
}
