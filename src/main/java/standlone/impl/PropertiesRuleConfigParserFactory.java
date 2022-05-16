package standlone.impl;

import standlone.IRuleConfigParserFactory;
import standlone.abstracts.RuleConfigParser;
import standlone.entity.PropertiesRuleConfigParser;

public class PropertiesRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public RuleConfigParser createParser() {
        return new PropertiesRuleConfigParser();
    }
}
