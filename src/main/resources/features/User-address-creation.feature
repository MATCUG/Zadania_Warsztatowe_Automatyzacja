Feature: Mystore User account creation

  Scenario: User can add and delete address
    When User add address using proper credentials: Wiejska 2, Warszawa, 61-550, United Kingdom
    And User deletes account
    Then Alert Address successfully deleted! shows up
