<?php


require_once("Account.php");
require_once("Car.php");

$car = new Car("TDF344", new Account("Angel Cruz", "133551"));
$car->passenger = 2;

$car->DataCar();
