# groovy-idea-14.1
Expose Groovy compilation bug in IntelliJ IDEA 14.1

Affected versions: 14.1 and above.

Checked on Java 1.8.0.45.

How to reproduce:

1. Import project in IntelliJ IDEA.
2. Create Groovy run configuration for script src/main/groovy/HelloGrapes.groovy.
3. Run this script and you will see "Error:Groovyc: Cannot @Grab without Ivy, please add it to your module dependencies (NoClassDefFoundError: org/apache/ivy/Ivy)"

Additions:

* Script without @Grab (src/main/groovy/Hello.groovy) is executed perfectly from IDEA.
* Both scripts are perfectly runnable from shell.

