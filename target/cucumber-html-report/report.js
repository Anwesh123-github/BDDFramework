$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/anwes/IdeaProjects/BDDFramework/src/test/Resoruces/ResultPage.feature");
formatter.feature({
  "line": 1,
  "name": "Resultpage functionality",
  "description": "",
  "id": "resultpage-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13226239601,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is in the homepage of Argos website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User types any product to search in the search box and clicks on the search button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should be able to see all the products related to search",
  "keyword": "Then "
});
formatter.match({
  "location": "Homepage_SearchBox.user_is_in_the_homepage_of_Argos_website()"
});
formatter.result({
  "duration": 170056000,
  "status": "passed"
});
formatter.match({
  "location": "Homepage_SearchBox.user_types_any_product_to_search_in_the_search_box_and_clicks_on_the_search_button()"
});
formatter.result({
  "duration": 2791041601,
  "status": "passed"
});
formatter.match({
  "location": "Homepage_SearchBox.user_should_be_able_to_see_all_the_products_related_to_search()"
});
formatter.result({
  "duration": 131803999,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "click on travel",
  "description": "",
  "id": "resultpage-functionality;click-on-travel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Travel"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user in nike result page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user clicks on travel category",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user can see travel category products",
  "keyword": "Then "
});
formatter.match({
  "location": "Resultpage_TravelCategory.user_in_nike_result_page()"
});
formatter.result({
  "duration": 1006358800,
  "status": "passed"
});
formatter.match({
  "location": "Resultpage_TravelCategory.user_clicks_on_travel_category()"
});
formatter.result({
  "duration": 34401,
  "status": "passed"
});
formatter.match({
  "location": "Resultpage_TravelCategory.user_can_see_travel_category_products()"
});
formatter.result({
  "duration": 39000,
  "status": "passed"
});
formatter.after({
  "duration": 40900,
  "status": "passed"
});
});