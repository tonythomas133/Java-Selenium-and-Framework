**Web Elements**
They are different elements in a web page. In order to access these web elements through Selenium we have to use locators.
There are 8 locators in Selenium, they are id, class, name, linktext, partialLinktext, cssSelector, xpath and tagName. The most common locator used in xpath.

**Xpath**
Xpath can be captured using inspect element (you can access that by right clicking the desired web element and click on inspect). 
In the inspect window, top right button is known as the inspecting tool. once clicked, click on the desired web element and it will take you to the correspondng html tags (violet colour div) and attributes (orange type, id) and corresponding values and black is text that you can find in the web page

**Xpath Syntax**
//tagname[@attributeName='attributeValue']

There are 2 types of xpath, namely, absolute and relative path

**Absolute xpath:**
This will be the exact path from root node. It can be identified by starting with /
Eg: /html/body/form/div[3]/div[2]/div/div[3]/div[2]/div[1]/ul/li[3]

**Relative xpath:**
This will be a path that is defined in relation to a particular node. This is used more widely. Relative xpath start with //.
Eg: //*[@id="SignIn_divSignInSlidePanel"]/div[2]/div[1]/ul/li[3]

**Using visible text in Xpath**
Usually visible text doesnt change , if change is made it will usually be a release change. Release changes are functional changes.
//h3[text()='Sachin Tendulkar -Wikipedia']

**Indexing**
Whatever that is to be indexed has to be put within () followed by the index in []
indexing always starts with 1 in xpath as this is a physical element
Eg: (//ul[@id='primaryNavigation']/li)[3] 


//div[contains(@id,'homePanel')]//img[contains(@title, 'Inside Country Dubai Visa Extension' )]
a better version of the above xpath is as follows
//a[contains(text(), 'Dubai Visa Extension')]/parent::*/preceding-sibling::img


There are various other methods that can be used to extract xpaths. Go through the following link to learn more about xpaths:
http://pragmatictestlabs.com/2020/01/28/mastering-xpath-for-selenium-test-automation-engineers/




