Feature: To Validate the Home Page button Are Working Fine Or Not
Scenario: Fly With Us button Click and Validate Working or not
When User Should click the Fly with Us button
And The page will be load and print titile & url
Then User Verify Fly With Us page is load or not

Scenario: Aircraft Charter button click and validate working or not
When User Should click the  button Aircraft Charter
And The page will be load and print titile & url
Then User Verify Aircraft Charter page is load or not

Scenario: Aircraft Sales and Lease button click and validate working or not
When User Should click the  button Aircraft Sales and Lease 
And The page will be load and print titile & url
Then User Verify Aircraft Sales and Lease page is load or not

Scenario: FAQs button click and validate working or not
When User Should click the  button FAQs
And The page will be load and print titile & url
Then User Verify FAQs page is load or not

Scenario: Contact Us button click and validate working or not
When User Should click the  button Contact Us
And The page will be load and print titile & url
Then User Verify Contact Us page is load or not

Scenario Outline: Charter An Airlines To check the validation
When User should type company name'<cname>'
And User should type contact name'<coname>'
And User should type contact number'<contactno>'
And User should type contact emailId'<emailid>'
And User should type origin'<orgin>'
And User should type destination'<destination>'
And User Should Select date
And User should Select time
And User Should select passanger
And User should select service style
And User should type comments'<comments>'
And User should click the send button

Examples:
|cname|coname|contactno|emailid|orgin|destination|comments|
|GVsja|govind|9898787890|jijojoy@gmail.com|canada|american|onnum illa poda|
|joyss|daviden|9876543457|joyalukas@ymail.com|singapur|kannamapet|vera level flight|
|joijo|jinjo|90989098789|jinjo@gmail.com|kanchipuram|perumbakkam|hi iam taking flight to kanchipuram so please give me a best price|