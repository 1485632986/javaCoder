package standlone;

import standlone.abstracts.IRuleConfigParser;
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
    public static IRuleConfigParser createParser(String configFormat) {
        if (configFormat == null || configFormat.isEmpty()) {
            return null;//返回null还是IllegalArgumentException全凭你⾃⼰说了算
        }
        IRuleConfigParser parser = (IRuleConfigParser) cachedParsers.get(configFormat.toLowerCase());
        return parser;
    }
}
