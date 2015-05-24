(function() {
	angular.module('wp').factory('dataService', dataService);
	
	function dataService() {
				
		var getCitiesByCountryCode = function(code) {
			switch (code) {
				case 'ABW':
					return [{
							id: 129,
							countryCode: "ABW",
							district: "Â–",
							name: "Oranjestad",
							population: 29034
							}];
				case 'AFG':
					return [{
							id: 1,
							countryCode: "AFG",
							district: "Kabol",
							name: "Kabul",
							population: 1780000
						}];
				default:
					return [];
			}
		} 
		
		var getAllCountries = function() {
			return [
				{
					"code":"ABW",
					"capital":129,
					"code2":"AW",
					"continent":"North America",
					"gnp":828.0,
					"governmentForm":"Nonmetropolitan Territory of The Netherlands",
					"headOfState":"Beatrix",
					"indepYear":null,
					"lifeExpectancy":78.4,
					"localName":"Aruba",
					"name":"Aruba",					
					"population":103000,
					"region":"Caribbean",
					"surfaceArea":193.0,
					"gnpold":793.0
				},
				{
					"code":"AFG",
					"capital":1,
					"code2":"AF",
					"continent":"Asia",
					"gnp":5976.0,
					"governmentForm":"Islamic Emirate",
					"headOfState":"Mohammad Omar",
					"indepYear":1919,
					"lifeExpectancy":45.9,
					"localName":"Afganistan/Afqanestan",
					"name":"Afghanistan",
					"population":22720000,
					"region":"Southern and Central Asia",
					"surfaceArea":652090.0,
					"gnpold":null					
				}
			];
		};
		
		return {
			getAllCountries : getAllCountries,
			getCitiesByCountryCode: getCitiesByCountryCode 
		};
	}
	
}());