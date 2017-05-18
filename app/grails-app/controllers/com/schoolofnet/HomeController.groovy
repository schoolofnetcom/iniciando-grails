package com.schoolofnet

class HomeController {

    def index() { 
    	Person person = new Person(fistName: '', lastName: 'Luppi', age: 21)
    	[ person : person ]
    }
    
    def greeting() { 
    	render "Hello from School of net"
    }
}
