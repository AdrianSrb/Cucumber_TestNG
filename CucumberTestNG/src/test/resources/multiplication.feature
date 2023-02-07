Feature: Multiplication no
  @noformultiplication
  Scenario: No Multiplication
    Given  do a = 40
    And  do b = 50
    And do c = {int}
    When do c = a * b{int}
    Then Should see c

#  Step 1:
#
#    Given (/^ I am on career.guru99.com$/) do
#
#  Browser.goto "http://career.guru99.com" -This will visit career.guru99 on browser
#
#  end
#
#  Step 2:
#    When (/^ click on career guide menu$/) do
#
#  Browser.text (:name, " career guide" ).click – This will click "career guide menu"
#
#  end
#
#  Step 3:
#
#    Then (/^ I should see career guide page$/) do
#
#  Browser.goto "http://career.guru99.com/category/career-guide/" - It will visit "career guide page"
#
#  end