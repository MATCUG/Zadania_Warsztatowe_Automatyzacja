<h1>Warsztaty z automatyzacji testów ZADANIA zaliczeniowe</h1>

<h2>**Zadanie warsztatowe 1 - Selenium WebDriver + Cucumber**</h2>

<h4>Utwórz użytkownika manualnie na stronie https://mystore-testlab.coderslab.pl.

Możesz wykorzystać tymczasowego maila do utworzenia użytkownika: https://10minutemail.com/.</h4>

<h3>Napisz skrypt, który:</h3>

<h4><li>będzie logować się na tego stworzonego użytkownika</li>

<li>wejdzie klikając w kafelek Addresses po zalogowaniu (adres, na którym powinniśmy się znaleźć to: https://mystore-testlab.coderslab.pl/index.php?controller=addresses )</li>

<li>kliknie w + Create new address</li>

<li>wypełni formularz New address - dane powinny być pobierane z tabeli Examples w Gherkinie (alias, address, city, zip/postal code, country, phone)</li>

<li>sprawdzi czy dane w dodanym adresie są poprawne</li></h4>

<h3>Dodatkowe kroki dla chętnych:</h3>

<h4><li>usunie powyższy adres klikając w "delete",</li>

<li>sprawdzi czy adres został usunięty.</li></h4>





<h2>**Zadanie warsztatowe 2 (dowolny sposób)**</h2>

<h3>**Napisz skrypt, który:**</h3>

<h4><li>zaloguje się na tego samego użytkownika z zadania 1 </li>

<li>wybierze do zakupu Hummingbird Printed Sweater (opcja dodatkowa: sprawdzi czy rabat na niego wynosi 20%)</li>

<li>wybierze rozmiar M (opcja dodatkowa: zrób tak żeby można było sparametryzować rozmiar i wybrać S,M,L,XL)</li>

<li>wybierze 5 sztuk według parametru podanego w teście (opcja dodatkowa: zrób tak żeby można było sparametryzować liczbę sztuk)</li>

<li>dodaj produkt do koszyka</li>

<li>przejdzie do opcji - checkout</li>

<li>potwierdzi address (możesz go dodać wcześniej ręcznie)</li>

<li>wybierze metodę odbioru - PrestaShop "pick up in store"</li>

<li>wybierze opcję płatności - Pay by Check</li>

<li>kliknie na "order with an obligation to pay"</li>

<li>zrobi screenshot z potwierdzeniem zamówienia i kwotą</h4></li>

<h3>Dodatkowe kroki dla chętnych:</h3>

<h4><li>Wejdź w historię zamówień i detale (najpierw kliknij w użytkownika zalogowanego, później kafelek)</li>

<li>sprawdź czy zamówienie znajduje się na liście ze statusem "Awaiting check payment" i kwotą taką samą jak na zamówieniu dwa kroki wcześniej</li></h4>

