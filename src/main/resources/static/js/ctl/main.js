(function() {
	
	var mainctl = function($scope) {
		$scope.title = "World-project using spring boot and Angular";
	};
	
	var app = angular.module("wp");
	app.controller("MainController", mainctl);
}());