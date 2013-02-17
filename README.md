# Servlet 3.0 UTF-8 encoding filter

Include this JAR into your Servlet 3.0 application, it will install
a filter that sets both request and response encoding to UTF-8.

Use with Maven:
-----------------------

    <repositories>
      <repository>
        <id>maven2.gueck.com-releases</id>
        <url>http://maven2.gueck.com/releases</url>
      </repository>
    </repositories>

    <dependencies>
        <dependency>
            <groupId>com.gueck</groupId>
            <artifactId>encodingfilter</artifactId>
            <version>1.0</version>
        </dependency>
    </dependencies>
