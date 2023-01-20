var app=angular.module('calc',[]);
app.controller('calculate',function($scope){
    $scope.result=0;
    $scope.operator=function(ch){
        switch(ch){
            case '+':
                $scope.result=$scope.n1+$scope.n2;
                break;
            case '-':
                $scope.result=$scope.n1-$scope.n2;
                break;

        }
    };
});