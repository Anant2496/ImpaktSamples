@echo off
cd ..

mvn com.act21.impaktapps.plugin:impaktapps-code-generator-maven-plugin:1.0.1:generate-impaktapps-code && mvn clean install package -Pdefault

echo All tasks completed.
