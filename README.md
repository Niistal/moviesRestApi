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

Hemen errore bat izan dut, esaten dit "titlea " String bat izan behar duela eta int32 formatuan dudala baina codigoan ez dut title int formatuan eta dembora asko egon naiz errorea bilatzen interneten eta ez dut aurkitu.

Hemen errorea:

    Decoding into a 'Movie' failed with the following exception:

    Failed to decode 'Movie'. Decoding 'title' errored with: readString can only be called when CurrentBSONType is STRING, not when CurrentBSONType is INT32.

    A custom Codec or PojoCodec may need to be explicitly configured and registered to handle this type.] with root cause.

Errorearen ondorioz ez dit rest zerbitzua ondo funtzionatzen.
