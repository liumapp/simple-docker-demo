#!/bin/bash

echo '============================================================='
echo '$                                                           $'
echo '$                      liumapp                              $'
echo '$                                                           $'
echo '$                                                           $'
echo '$  email:    liumapp.com@gmail.com                          $'
echo '$  homePage: http://www.liumapp.com                         $'
echo '$  Github:   https://github.com/liumapp                     $'
echo '$                                                           $'
echo '============================================================='
echo '.'

cd docker-config

mvn clean package docker:build

cd ..

cd docker-eureka

mvn clean package docker:build

cd ..

cd docker-gateway

mvn clean package docker:build

cd ..

cd docker-weba

mvn clean package docker:build

cd ..

cd docker-webb

mvn clean package docker:build

cd ..

