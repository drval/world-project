(function() {
	var app = angular.module("wp", []);
	
	app.provider('worldApp', function() {
		
		this.$get = function() {
			var appName = "Справочник стран";
			var appDesc = "Отображает информацию о странах";
			var version = "1.0";
			
			if (includeVersionInTitle) {
				appName += ' ' + version;
			}
			
			return {
				appName : appName,
				appDesc : appDesc
			}
		};
		
		var includeVersionInTitle = false;
		this.setIncludeVersionInTitle = function(value) {
			includeVersionInTitle = value;
		};
	});
	
	app.config(function(worldAppProvider) {
		worldAppProvider.setIncludeVersionInTitle(true);
	});
	
}());