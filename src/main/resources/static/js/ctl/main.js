(function() {
	
	var mainctl = function(worldApp) {
		var scope = this;
		scope.appName = worldApp.appName;
	};
	
	var app = angular.module("wp");
	app.controller("MainController", mainctl);
}());