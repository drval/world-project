(function() {
	
	var mainctl = function(worldApp, dataService) {
		var scope = this;
		scope.appName = worldApp.appName;
		scope.allCountries = dataService.getAllCountries();
	};
	
	var app = angular.module("wp");
	app.controller("MainController", mainctl);
}());