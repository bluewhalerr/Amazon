Feature: Buy Mobile Phone

@TC_101
Scenario: A user should be able to buy mobile phone successfully on Amazon
Given a user is on the landing page of Amazon
When he clicks on Mobiles
And he hovers the pointer over Mobiles & Accessories
And clicks on Apple in the sub-menu
And he clicks on first avaliable phone
And he switches the focus on the new tab
And he clicks on Buy Now button
Then he must be able to purchase a mobile phone successfully

Scenario: A user should be able to buy a Samsung mobile phone from Amazon
Given a user is on the landing page of Amazon
When he clicks on Mobiles
And he hovers the pointer over Mobiles & Accessories
And he clicks on Samsung in the sub-menu
And he clicks on first available samsung phone
And he switches the focus on the new tab
And he clicks on Add to Cart button
Then he must be able to successfully add the phone to cart