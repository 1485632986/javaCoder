package standlone.impl;

import standlone.IRuleConfigParserFactory;
import standlone.abstracts.RuleConfigParser;
import standlone.entity.JsonRuleConfigParser;

public class JsonRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public RuleConfigParser createParser() {
        return new JsonRuleConfigParser();
    }
}
