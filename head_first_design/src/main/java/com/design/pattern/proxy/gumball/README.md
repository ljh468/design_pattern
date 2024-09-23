# Gumball Machine with Proxy Pattern

To get code running on localhost: 

1. Change directories to the same level with headfirst/ folder in bin/

2. Run rmiregistry in background:
rmiregistry &

3. Run:
java design_pattern/head_first_design/src/main/java/com/design/pattern/proxy/gumball/GumballMachineTestDrive localhost 300

4. In a different window, run:
java design_pattern/head_first_design/src/main/java/com/design/pattern/proxy/gumball/GumballMonitorTestDrive localhost