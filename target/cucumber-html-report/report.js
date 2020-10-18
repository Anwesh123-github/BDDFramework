$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/anwes/IdeaProjects/BDDFramework/src/test/Resoruces/IcelandHomepage.feature");
formatter.feature({
  "line": 1,
  "name": "Iceland Search Box",
  "description": "",
  "id": "iceland-search-box",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10684356400,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Iceland Search Functionality",
  "description": "",
  "id": "iceland-search-box;iceland-search-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@IcelandRegression"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User is in the iceland website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User types an item in the search box and clicks on search button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User should be able to see all the products related to that item",
  "keyword": "Then "
});
formatter.match({
  "location": "Homepage_IcelandSearch.user_is_in_the_iceland_website()"
});
formatter.result({
  "duration": 198987900,
  "status": "passed"
});
formatter.match({
  "location": "Homepage_IcelandSearch.user_types_an_item_in_the_search_box_and_clicks_on_search_button()"
});
formatter.result({
  "duration": 2387379700,
  "status": "passed"
});
formatter.match({
  "location": "Homepage_IcelandSearch.user_should_be_able_to_see_all_the_products_related_to_that_item()"
});
formatter.result({
  "duration": 109533400,
  "status": "passed"
});
formatter.after({
  "duration": 10000715200,
  "status": "passed"
});
});