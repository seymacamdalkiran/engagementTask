Feature: Login

  Scenario: E2E Test
    Given Go to the website
    When Accept cookies
    Then Verify that "Data Hub" is displayed
    And Navigate to "Docs" module
    Then Verify the items on the side menu
      | Docs                      |
      | OS NGD API – Features     |
      | OS NGD API – Tiles        |
      | OS Downloads API          |
      | OS Features API           |
      | OS Linked Identifiers API |
      | OS Maps API               |
      | OS Match & Cleanse API    |
      | OS Names API              |
      | OS Places API             |
      | OS Vector Tile API        |
      | OAuth 2 API               |
      | Legal                     |
      | Our brand logo            |
    When Navigate to "OS Downloads API" module