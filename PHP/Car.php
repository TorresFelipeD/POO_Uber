<?php

class Car
{
    public $id;
    public $license;
    public $driver;
    public $passenger;

    public function __construct($license,$driver)
    {
        $this->license = $license;
        $this->driver = $driver;
    }

    public function DataCar(){
        $strCar = "License: ".$this->license;
        $strCar = $strCar."\nDriver Name: ".$this->driver->name;
        $strCar = $strCar."\nPassenger: ".$this->passenger;
        return $strCar;
    }
}
