package standlone;

import standlone.abstracts.RuleConfigParser;
import standlone.entity.JsonRuleConfigParser;
import standlone.entity.PropertiesRuleConfigParser;
import standlone.entity.XmlRuleConfigParser;
import standlone.entity.YamlRuleConfigParser;

import java.util.HashMap;
import java.util.Map;

public class RuleConfigParserFactory {
    private static final Map<String, RuleConfigParser> cachedParsers = new HashMap<>();
    static {
        cachedParsers.put("json", new JsonRuleConfigParser());
        cachedParsers.put("xml", new XmlRuleConfigParser());
        cachedParsers.put("yaml", new YamlRuleConfigParser());
        cachedParsers.put("properties", new PropertiesRuleConfigParser());
    }
}
