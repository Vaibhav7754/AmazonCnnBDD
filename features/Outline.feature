Feature: Search

Scenario: Search From Header
        Given The "<URL>" page of CNN is opened
        When I select Search from the Screen and enter text
        #Then Select article and given the result

        Examples:
            | URL                                                   |
            | https://edition.cnn.com/ |