É necessário criar uma chave de API no site a seguir: https://api.nasa.gov/

Com a chave da API em mãos, crie uma imagem docker usando o Dockerfile na raiz do projeto

Antes rode o comando para criar o artefato: mvn clean install

Criar imagem: docker build -t eraldopaes/weather:v1 .

Iniciar container com a imagem criada: docker run -p 8080:8080 -e NASA_API_KEY=${API_KEY} eraldopaes/weather:v1

Com a imagem rodando acesse http://localhost:8080/nasa/temperature