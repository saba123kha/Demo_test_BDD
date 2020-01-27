Feature: User can add a product & plan to the cart and successfully checkout with order_id.
Scenario Outline: User can successfully place orders.
Given User is on Homepage of CompanyV1
When User click on the <product V1>
And User click on the <product V1Plan>
Then User click on the Add cart button
And User click on the check out
Then User expect to get product order_id

Examples:
 |product V1       | product V1Plan|
 |washer&dryers    | plan          |
 |electric_dryers  | plan_2        |
 |gas_dryers       | plan_3        |