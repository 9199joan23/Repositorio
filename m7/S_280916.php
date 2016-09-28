<?php
	
	class Persona {
		// Atributos
		//  public $name = "Pedro";
		// public $surname = "Garcia";	
		public --construcct($name,$surname)
		{
		$this->name=$name
		$this->surname=$surname	

		}
	/*
	public function mostrar2(){
		echo $this->name;
		echo " ";}
	public function mostrar(){
		echo $this->surname;
	}
	*/
	}
	$personita=new Persona();
	/*
	$personita->mostrar2();
	$personita->mostrar();
	*/
	// echo $personita -> name;
	$personita=new Persona("Pedro","Garcia")

?>