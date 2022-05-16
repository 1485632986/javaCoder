package standlone.abstracts;

import lombok.Data;


@Data
public abstract class IRuleConfigParser extends RuleConfigParser{
    private String name;
    private String passWord;

    public RuleConfig parse(String configText) {
        return null;
    }
}
