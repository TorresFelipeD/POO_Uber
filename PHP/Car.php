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
        echo "License: ".$this->license;
        echo "\nDriver Name: ".$this->driver->name;
        echo "\nPassenger: ".$this->passenger;
    }
}
