Feature: As a resident from England, Scotland, Wales, Northren Ireland I need to know estimate of electrical appliances cost to run

  /**Comments: Scenario Outline can also be used to pass multiple appliances data as data sets,
               but to avoid adding each appliance at each execution not tried that.
               Data can also be passed from any constants file instead of hard coded values in feature file,
               but little more time required for that to do. So approaching with hard coded values for now.
  **/

  Scenario: As a resident from England I need to know appliances cost to run
  	Given I navigate to the URL "https://www.citizensadvice.org.uk/consumer/energy/energy-supply/get-help-paying-your-bills/check-how-much-your-electrical-appliances-cost-to-use/"
    Then I should see Energy Cost Calculator Page
    Then I Select Advice Applies to England
    And I enter "34" kwh
    When I select appliance "PC or desktop computer"
    Then I enter "8" hours
    And I enter "00" minutes
    And I Click on Add Appliance
    Then I verify "PC or desktop computer" appliance added to the list
    When I select appliance "Dishwasher"
    Then I enter "2" hours
    And I enter "00" minutes
    And I Click on Add Appliance
    Then I verify "Dishwasher" appliance added to the list
    When I select appliance "Washing machine"
    Then I enter "2" hours
    And I enter "00" minutes
    And I Click on Add Appliance
    Then I verify "Washing machine" appliance added to the list
    When I select appliance "Light bulb - energy-saving CFL"
    Then I enter "6" hours
    And I enter "00" minutes
    And I Click on Add Appliance
    Then I verify "Light bulb - energy-saving CFL" appliance added to the list
    When I select appliance "Light bulb - energy-saving LED"
    Then I enter "6" hours
    And I enter "00" minutes
    And I Click on Add Appliance
    Then I verify "Light bulb - energy-saving LED" appliance added to the list
    When I select appliance "TV"
    Then I enter "4" hours
    And I enter "00" minutes
    And I Click on Add Appliance
    Then I verify "TV" appliance added to the list
    When I select appliance "Microwave"
    Then I enter "1" hours
    And I enter "00" minutes
    And I Click on Add Appliance
    Then I verify "Microwave" appliance added to the list
    When I select appliance "Electric car charger (wallbox)"
    Then I enter "8" hours
    And I enter "00" minutes
    And I Click on Add Appliance
    Then I verify "Electric car charger (wallbox)" appliance added to the list
    Then I verify Daily, Weekly, Monthly, Yearly costs showing for added appliances


  Scenario: As a resident from Scotland I need to know appliances cost to run
    Given I navigate to the URL "https://www.citizensadvice.org.uk/consumer/energy/energy-supply/get-help-paying-your-bills/check-how-much-your-electrical-appliances-cost-to-use/"
    Then I should see Energy Cost Calculator Page
    Then I Select Advice Applies to Scotland
    And I enter "67" kwh
    When I select appliance "PC or desktop computer"
    Then I enter "8" hours
    And I enter "00" minutes
    And I Click on Add Appliance
    Then I verify "PC or desktop computer" appliance added to the list
    When I select appliance "Dishwasher"
    Then I enter "2" hours
    And I enter "00" minutes
    And I Click on Add Appliance
    Then I verify "Dishwasher" appliance added to the list
    When I select appliance "Washing machine"
    Then I enter "2" hours
    And I enter "00" minutes
    And I Click on Add Appliance
    Then I verify "Washing machine" appliance added to the list
    When I select appliance "Light bulb - energy-saving CFL"
    Then I enter "6" hours
    And I enter "00" minutes
    And I Click on Add Appliance
    Then I verify "Light bulb - energy-saving CFL" appliance added to the list
    When I select appliance "Light bulb - energy-saving LED"
    Then I enter "6" hours
    And I enter "00" minutes
    And I Click on Add Appliance
    Then I verify "Light bulb - energy-saving LED" appliance added to the list
    When I select appliance "TV"
    Then I enter "4" hours
    And I enter "00" minutes
    And I Click on Add Appliance
    Then I verify "TV" appliance added to the list
    When I select appliance "Microwave"
    Then I enter "1" hours
    And I enter "00" minutes
    And I Click on Add Appliance
    Then I verify "Microwave" appliance added to the list
    When I select appliance "Electric car charger (wallbox)"
    Then I enter "8" hours
    And I enter "00" minutes
    And I Click on Add Appliance
    Then I verify "Electric car charger (wallbox)" appliance added to the list
    When I select appliance "Fan heater"
    Then I enter "8" hours
    And I enter "00" minutes
    And I Click on Add Appliance
    Then I verify "Fan heater" appliance added to the list
    When I select appliance "Phone or tablet charger"
    Then I enter "1" hours
    And I enter "00" minutes
    And I Click on Add Appliance
    Then I verify "Phone or tablet charger" appliance added to the list
    Then I verify Daily, Weekly, Monthly, Yearly costs showing for added appliances

  Scenario: As a resident from Wales I need to know appliances cost to run
    Given I navigate to the URL "https://www.citizensadvice.org.uk/consumer/energy/energy-supply/get-help-paying-your-bills/check-how-much-your-electrical-appliances-cost-to-use/"
    Then I should see Energy Cost Calculator Page
    Then I Select Advice Applies to Wales
    And I enter "67" kwh
    When I select appliance "PC or desktop computer"
    Then I enter "8" hours
    And I enter "00" minutes
    And I Click on Add Appliance
    Then I verify "PC or desktop computer" appliance added to the list
    When I select appliance "Dishwasher"
    Then I enter "2" hours
    And I enter "00" minutes
    And I Click on Add Appliance
    Then I verify "Dishwasher" appliance added to the list
    When I select appliance "Washing machine"
    Then I enter "2" hours
    And I enter "00" minutes
    And I Click on Add Appliance
    Then I verify "Washing machine" appliance added to the list
    When I select appliance "Light bulb - energy-saving CFL"
    Then I enter "6" hours
    And I enter "00" minutes
    And I Click on Add Appliance
    Then I verify "Light bulb - energy-saving CFL" appliance added to the list
    When I select appliance "Light bulb - energy-saving LED"
    Then I enter "6" hours
    And I enter "00" minutes
    And I Click on Add Appliance
    Then I verify "Light bulb - energy-saving LED" appliance added to the list
    Then I verify Daily, Weekly, Monthly, Yearly costs showing for added appliances

  Scenario: As a resident from Northern Ireland I need to know appliances cost to run
    Given I navigate to the URL "https://www.citizensadvice.org.uk/consumer/energy/energy-supply/get-help-paying-your-bills/check-how-much-your-electrical-appliances-cost-to-use/"
    Then I should see Energy Cost Calculator Page
    When I Select Advice Applies to Northern Ireland
    Then I get this website doesn't cover Northern Ireland Message

