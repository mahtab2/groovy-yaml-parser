import groovy.yaml.YamlSlurper
import groovy.json.JsonOutput;
import groovy.sql.Sql

class GroovyMain {
    static void main(args) {
        YamlParser parser = new YamlParser(Config.getSql(), "example.yml")
        parser.parse()
    }
}
