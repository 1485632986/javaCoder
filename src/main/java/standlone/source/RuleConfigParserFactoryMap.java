package standlone.source;

import standlone.IRuleConfigParserFactory;
import standlone.impl.JsonRuleConfigParserFactory;
import standlone.impl.PropertiesRuleConfigParserFactory;
import standlone.impl.XmlRuleConfigParserFactory;
import standlone.impl.YamlRuleConfigParserFactory;

import java.util.HashMap;
import java.util.Map;

public class RuleConfigParserFactoryMap {
    public static IRuleConfigParserFactory getParserFactory(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        IRuleConfigParserFactory parserFactory = cachedFactories.get(type.toLowerCase());
        return parserFactory;
    }
    private static final Map<String, IRuleConfigParserFactory> cachedFactories = new HashMap<>();
   static {
        cachedFactories.put("json", new JsonRuleConfigParserFactory());
        cachedFactories.put("xml", new XmlRuleConfigParserFactory());
        cachedFactories.put("yaml", new YamlRuleConfigParserFactory());
        cachedFactories.put("properties", new PropertiesRuleConfigParserFactory());
    }
}
