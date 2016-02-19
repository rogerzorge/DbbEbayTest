Feature: Add to cart

  Scenario: Running a Full Text Quick Search
    Given I set search request "iPhone 6s" and perform search
    When I add product to cart and pass to cart
    Then the term query "iPhone 6s" should be available in cart

#  Scenario Outline: Running a Full Text Quick Search
#    Given I set search request "<request>" and perform search
#    When I add product to cart and pass to cart
#    Then the term query "<request>" should be available in cart
#    Examples:
#      | request |
#      | iPhone 6s |


#  Scenario Outline: Running a Full Text Quick Search
#    Given I set search request "<request>"
#    When I perfom search
#    Then the term query "<request>" should be the first in the Search Result grid
#
#    Examples:
#      | request        |
#      | iPhone 4S      |
#      | Samsung Galaxy |
