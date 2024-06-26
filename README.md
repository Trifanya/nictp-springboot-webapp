# Система управления задачами. Веб-приложение на Spring Boot.

## Структура проекта.
Данный проект представляет собой клиентскую часть учебного проекта "Система управления задачами", структура которого представлена на диаграмме:

![Схема проекта](https://github.com/Trifanya/nictp-springboot-webapp/assets/80362982/c92b3370-8cc9-46e8-bcc1-0a2aea3f0f7f)

## Стек технологий.
- Maven
- Spring Boot, Spring MVC
- Thymeleaf
- HTML
- CSS
- JMS
- ActiveMQ

## Описание проекта.
В данном проекте реализован веб-клиент, взаимодействие с которым осуществляется посредством протокола HTTP.
Основной задачей клиента является взаимодействие с серверным приложением с помощью JMS и ActiveMQ сервера и отображение
данных, полученных оттуда. Данный клиент предназначен только для чтения информации с сервера.

Взаимодействие с приложением осуществляется по следующим адресам:
- ```host_name:port/tasks/list```
- ```host_name:port/tasks/task_{taskId}```
- ```host_name:port/users/list```
- ```host_name:port/users/user_{userId}```

## Контакты.
- Gmail: trifanya.dev@gmail.com
- Telegram: @Trifanya
