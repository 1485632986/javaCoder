package standlone.impl;

import standlone.IRuleConfigParserFactory;
import standlone.abstracts.RuleConfigParser;
import standlone.entity.YamlRuleConfigParser;

public class YamlRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public RuleConfigParser createParser() {
        return new YamlRuleConfigParser();
    }
}
