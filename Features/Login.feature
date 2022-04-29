Feature:login demo nopecommerce
  Scenario:login success
    Given the user launch the browser
    When the user open the page of the admin as "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And the user enter the valid email as "admin@yourstore.com" and valid password as "admin"
    And the user click to login button
    Then verify that the user login successfully
    And close the browser

