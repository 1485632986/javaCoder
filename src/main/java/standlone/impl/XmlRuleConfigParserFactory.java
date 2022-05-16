package standlone.impl;

import standlone.IRuleConfigParserFactory;
import standlone.abstracts.RuleConfigParser;
import standlone.entity.XmlRuleConfigParser;

public class XmlRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public RuleConfigParser createParser() {
        return new XmlRuleConfigParser();
    }
}
