Feature: Adactin Login Functionality testing
Scenario: Adactin login using valid username and valid password
Given User launch Adactin application
When user enter username and password
And User click login button
Then User see nextpage text Welcome to adactin group of Hotels

Scenario Outline: To validate login using different set of credentials
Given User launch Adactin application
When user enter username "<username>" and password "<password>"
And user click login button
Then user see the results based on credential type"<credentialtype>"


Example:
|username|password|credentialType|
|vaithy2410|vaithy@2410|positive|
|vsalgg|75475|negative|
|jkmnbk|74509|negative|








