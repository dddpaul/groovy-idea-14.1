#!/usr/bin/env groovy

@Grab('org.apache.commons:commons-lang3:3.3.2')
import org.apache.commons.lang3.StringUtils

class HelloGrapes {
    static void main(String... args) {
        println StringUtils.upperCase("Hello world")
    }
}
