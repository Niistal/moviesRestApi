# MoviesMongoRestApi Iker Nistal-en eskutik

Proiektu hau Datu Atzipena ikasgaian garatu da. Jarduera nagusia Rest API bat garatzea da, MongoDB datu basera sartzeko, eta nola kokatzen den jakitea Web aplikazio batean Rest API bat. Kasu honetan, JSON datu multzo bat hautatu eta MongoDB datu basera kargatu da. Datu multzoak irabazi ziren azken mendean eman ziren Nobel sari guztiak biltzen ditu. Hauexek dira orokorrean hartu beharreko pauso nagusiak:

- Swagger sarrera: http://localhost:8080/swagger-ui/index.html
- MongoDB konexio Stringa: mongodb://localhost
- Datu-base izena: nobelprize
- Bilduma izena: movies
- Maven exekuzio agindua (pom.xml fitxategiaren direktorio berean): mvn spring-boot:run

## Dataset eta MongoDB

Datuak pelikulen json batetik atera ditut eta bertan actoreak daude eta haien pertsonaia pelikula bakoitzeko. Baita ere , bertan parte hartu duten pertsonak eta taldea (diretora, editoreak,artista, cameraman) .

aipatu dudan bezala guztia json batetik atera nuen eta bertan arrayak daude.

## REST Zerbitzua

REST zerbitzuak egitura berezia du. Zerbitzu hau erabiliz, erabiltzaileak hainbat motatako eskaerak egin ditzake; sortu(POST), irakurri(GET), eguneratu(PUT), eta ezabatu(DELETE). End-point bakoitzak eskaera mota desberdin bat kudeatzen du, beraz, exekutatzen dena zerbitzuak mota bat edo bestea egingo du Swagger erabiliz.

<img src="img/restapiMongo.png" width=%40>
<br> <br> <br> <br>

| Type   | Endpoint                    | Result                                                                                                                                                          |
| ------ | --------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| GET    | /movies/allmovies           | This returns all movies in JSON format.                                                                                                                         |
| GET    | /movies/findmovie           | This returns a movie using the title for finding.                                                                                                               |
| GET    | /movies/findActor           | This returns an actor using name for finding.                                                                                                                   |
| GET    | /movies/findByGender        | This returns actors using the gender, where 1 represents female and 2 represents male.                                                                          |
| POST   | /movies/addmovie            | This creates a movie using name and ID.                                                                                                                         |
| PUT    | /movies/updatemovie/{title} | This returns connection: keep-alive <br> content-length: 0 <br> date: Mon,19 Feb 2024 14:32:03 GMT <br>keep-alive: timeout=60<br> CODE: 200<br> Description: OK |
| DELETE | /movies/deletemovie/{title} | Success<br> pelicula ezabatu duzu: 2<br> Failure<br> Errorea title pelicula ezabatzerakoa                                                                       |
| DELETE | /movies/deleteActor/{name}  | Success<br> name actorea borratu <br> duzu pelicula guztietatik <br> Failure<br> Errorea borratzeko actorea name : ex.getMessage()                              |

## MongoDb

This SpringBoot application is a service that creates request for a MongoDB database. For creating the database is neccesary to install the Community edition of MongoDB and MongoDB Compass that is a MongoDB client.

In the left side you can see the databases, there you create the database and the collection where the data is going to be kept. The name of the database is called movies and the collection is called movie3.

### Why movie3?

_In my folder you can see my JSON files:_

- **movie**: _This is the original file, which is quite large and causes issues when loaded on the web. It contains 4791 objects in the first array, with two arrays within each object._

- **movie2**: _This is the second larger version. I structured it with an array of 500 objects, each containing only one array.Which is quite large and causes issues when loaded on the web_

- **movie3**:_This is a more usable version with 200 objects in the array, and only one array within each object._

- **movie4**: _This is another usable version with 100 objects, also with only one array within each object. This version is the lightest if the third version doesn't work properly._
  <br><br><br>
- MovieId (int)
- Title (String)<br>
- Cast (List<Cast>)
  Each cast have:<br>
  1 - Cast_id (int)<br>
  2 - Character (String)<br>
  3- Credit_id (String)<br>
  4- Gender (int)<br>
  5- Id (int)<br>
  6- Name (String)<br>
  7- Order (int)<br>
