@manager_login_sayfasi
Feature: odev_manager_login_test

  Scenario Outline: TC01_odev_manager_login_test

#  USER STORY : US167854_manager_login_test
#  NAME:kullanici tum manager login bilgileriyle giriş yapabilmeli
#  AC:
    Given kullanici "https://www.bluerentalcars.com/" ya gider
    When kullanici "<login>" sayfasina gider
    And kullanıcı adini "<mail>" girer
    And kullanici sifreyi "<Sifre>" girer
    And kullanici login buttoning basar
    Then kullanici login islemi gerçekleşir


    Examples: personel_bilgileri
      | mail                               |   Sifre     |
      | sam.walker@bluerentalcars.com      | c!fas_art   |
      | kate.brown@bluerentalcars.com      | tad1$Fas    |
      | raj.khan@bluerentalcars.com        | v7Hg_va^    |
      | pam.raymond@bluerentalcars.com     | Nga^g6!     |

#  ARTIFACT:
#  url : https://www.bluerentalcars.com/
#  Credentials:
#  {"sam.walker@bluerentalcars.com","c!fas_art"},
#  {"kate.brown@bluerentalcars.com","tad1$Fas"},
#  {"raj.khan@bluerentalcars.com","v7Hg_va^"},
#  {"pam.raymond@bluerentalcars.com","Nga^g6!"}
#  NOT: scenario outline kullanalim




