package standlone;

import standlone.abstracts.RuleConfigParser;

/**
 * 工厂接口
 */
public interface IRuleConfigParserFactory {
    RuleConfigParser createParser();
}
