#!/bin/bash
################################## Add repo
echo "Adding jenkins repo"
wget -O /etc/yum.repos.d/jenkins.repo https://pkg.jenkins.io/redhat-stable/jenkins.repo > /dev/null 2>&1

if [ $? -eq 0 ]
then
echo "Jenkins repo successfully added into the system"
else
echo "Adding Jenkins repo failed"
fi


################################# Add gpg-pubkey for rpm package from added repo
echo "Importing gpg-key"
rpm --import https://pkg.jenkins.io/redhat-stable/jenkins.io.key > /dev/null 2>&1

if [ $? -eq 0 ]
then
echo "gpg-pubkey successfully added "
else
echo "Adding gpg-pubkey failed"
fi


################################ Install Jenkins and Java
echo "Installing Jenkins"
dnf -y install jenkins java-1.8.0-openjdk-devel > /dev/null 2>&1
if [ $? -eq 0 ]
then
echo "Jenkins Installed"
else
echo "Jenkins Installation Failed"
fi


############################# Configure Jenkins service startup and Firewall rules
firewall-cmd --add-port=8080/tcp --add-port=8123/tcp --permanent && firewall-cmd --reload
systemctl --now enable jenkins.service

