# Sopho-Solutions---reto1
reto automatización

-Requerimientos
Chrome Version >= 77.0.3865.90


-Feature: Search item and add to cart

  scenario: Search the product and adding the first item in search modal

    Given that Diego has a emtpy cart, in new session

    When he adds buy the first element

    Then his cart page should contain in coherence all releted info about the selected item
