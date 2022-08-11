Feature: Search
    Scenario: Search From Header
        Given The "<url>" page of amazon is opened
        When Enter text and search for mobile
        Then select add to cart  and check out
        
        
Examples:
            | url                                                  |
            | https://www.amazon.in |