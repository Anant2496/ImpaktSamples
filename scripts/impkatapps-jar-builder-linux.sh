#!/bin/bash

# Navigate to the parent directory
cd ..

# Run the Maven commands
mvn com.act21.impaktapps.plugin:impaktapps-code-generator-maven-plugin:1.0.1:generate-impaktapps-code && mvn clean install package -Pdefault

# Print a message indicating that all tasks are completed
echo "All tasks completed."
