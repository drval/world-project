(function() {
	
	angular.module('wp').service('logger', WorldAppLogger);
	
	function LoggerBase() {
		
	}
	
	LoggerBase.prototype.output = function(message) {
		console.log('LoggerBase: ' + message);
	}
	
	function WorldAppLogger() {
		LoggerBase.call(this);
		
		this.logCountry = function(country) {
			console.log('Country: ' + country.name);
		}
	}
	
	WorldAppLogger.prototype = Object.create(LoggerBase.prototype);
}());