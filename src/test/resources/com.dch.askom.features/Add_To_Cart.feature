Feature: Add to cart

  Scenario Outline: Add one quantity from store and adding to cart as a
    guest on the store on askomdch website
    Given I am on the store page
    When I add "<productName>" to the cart
    Then I should see 1 "<productName>" in the cart
    Examples:
      | productName     |  |
      | Blue Shoes      |  |
      | Anchor Bracelet |  |

