package standlone.source;

import standlone.IRuleConfigParserFactory;
import standlone.abstracts.IRuleConfigParser;
import standlone.abstracts.RuleConfig;


public class RuleConfigSource {
    public RuleConfig load(String ruleConfigFilePath) throws Exception {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        IRuleConfigParserFactory parserFactory =
                RuleConfigParserFactoryMap.getParserFactory(ruleConfigFileExtension);
        if (parserFactory == null) {
            throw new Exception("Rule config file format is not supported: " +
                    ruleConfigFilePath);
        }
        IRuleConfigParser parser = (IRuleConfigParser) parserFactory.createParser();
        String configText = "";
        //从ruleConfigFilePath⽂件中读取配置⽂本到configText中
        RuleConfig ruleConfig = parser.parse(configText);
        return ruleConfig;
    }
    private String getFileExtension(String filePath) {
        //...解析⽂件名获取扩展名，⽐如rule.json，返回json
        return "json";
    }
}


