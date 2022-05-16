package standlone.entity;

import lombok.Data;
import standlone.abstracts.IRuleConfigParser;

@Data
public class JsonRuleConfigParser extends IRuleConfigParser {
    private Integer configParser;
}
