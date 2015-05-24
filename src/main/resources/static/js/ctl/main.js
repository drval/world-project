(function() {
	
	var mainctl = function(worldApp, dataService, logger) {
		var scope = this;
		scope.appName = worldApp.appName;
		scope.allCountries = dataService.getAllCountries();
		logger.output('WorldApp Main controller has been created');
	};
	
	var app = angular.module("wp");
	app.controller("MainController", mainctl);
}());