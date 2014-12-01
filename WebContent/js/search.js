var app = angular.module('ui.bootstrap.demo', ['ui.bootstrap', 'mgcrea.ngStrap']);
app.controller('SearchCtrl', function ($scope, $window) {
  $scope.tabs = [
    { title:'Dynamic Title 1', content:'Dynamic content 1' },
    { title:'Dynamic Title 2', content:'Dynamic content 2', disabled: true }
  ];
  
  $scope.departureStationArray = [
	"Station1", 
	"Station2", 
	"Station3"
  ];
  
  $scope.arrivalStationArray = [
	"Station1", 
	"Station2", 
	"Station3"
  ];
  
  // Ticket Number Limitation
  $scope.adultsValue = 0;
  $scope.seniorsValue = 0;
  $scope.childrenValue = 0;
  

});

  
