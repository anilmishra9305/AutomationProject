Feature:I am going To test Gmail create Account

Scenario Outline: I am entering All New user Creation Details

Given I am opening gmail page

When I enter firstName as "<firstname>"

And  I enter lastName as "<lastname>"

And I enter userName as "<username>"

And I enter password as "<password>"

And I enter confirm password as "<cpass>"







Examples:

|firstname | lastname| username| password|cpass|

|anil12345|mi12345|abcanil12345|123qwertyu|123qwertyu|
|sachin12345|grover12345|abcsachin12345|123qwertyusach|123qwertyusach|