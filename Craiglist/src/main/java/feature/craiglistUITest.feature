Feature: San Francisco Bay Craigslist site

Scenario: San Francisco Bay Craigslist

Given Log into craigslist site
When check the title of the page

Then Go to myAccount
Then Open searches tab
Then Click edit on toyota search
Then Change name to toyota prius
Then Click save
Then Verify name was changed
Then Click delete
Then Verify search was deleted
Then Close the browser

