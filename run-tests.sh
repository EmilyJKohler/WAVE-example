#!/bin/bash

ENV=local
BROWSER=chrome



sbt -Dlogback.configurationFile=logback.xml -Dbrowser=$BROWSER -Denvironment=$ENV 'test-only wave.example.runner.Runner'
