To execute login test you need to specify a path to your Geckodriver in "geckoDrivPath" parameter.
It's locales in TestBase.java file.

Also you can add test data in data providers in DataProviders.java file.
To check a positive login please add your credentials including a username (a name that you will se after login) in "correctData()" method.
To check a negative login please add a path to your csv file with test credentials. You can download Book1.csv as an example.