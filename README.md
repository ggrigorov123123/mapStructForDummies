# MapStruct For Dummies

## 1.What is MapStruct
This API contains functions that automatically map between two Java Beans (In our case we are mapping Entities to DTOs and vice versa). With MapStruct, we only need to create the interface, and the library will automatically create a concrete implementation during compile time.

## 2. Dependency
If you’re using Maven to build your own project add the following to your pom.xml to use MapStruct:

```sh
...
<properties>
    <org.mapstruct.version>1.5.3.Final</org.mapstruct.version>
</properties>
...
<dependencies>
    <dependency>
        <groupId>org.mapstruct</groupId>
        <artifactId>mapstruct</artifactId>
        <version>${org.mapstruct.version}</version>
    </dependency>
</dependencies>
...
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.8.1</version>
            <configuration>
                <source>1.8</source> <!-- depending on your project -->
                <target>1.8</target> <!-- depending on your project -->
                <annotationProcessorPaths>
                    <path>
                        <groupId>org.mapstruct</groupId>
                        <artifactId>mapstruct-processor</artifactId>
                        <version>${org.mapstruct.version}</version>
                    </path>
                    <!-- other annotation processors -->
                </annotationProcessorPaths>
            </configuration>
        </plugin>
    </plugins>
</build>
```
If you are using Project Lombock:
```sh
...
<properties>
    <org.mapstruct.version>1.5.2.Final</org.mapstruct.version>
</properties>
...
<dependencies>
            <dependency>
			    <groupId>org.projectlombok</groupId>
			    <artifactId>lombok</artifactId>
			    <version>1.18.24</version>
			    <scope>provided</scope>
		    </dependency>
		    <dependency>
			    <groupId>org.mapstruct</groupId>
			    <artifactId>mapstruct</artifactId>
			    <version>${org.mapstruct.version}</version>
		    </dependency>
</dependencies>
...	
</dependencies>
...
<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
				<configuration>
					<excludes>
						<exclude>
							<groupId>org.projectlombok</groupId>
							<artifactId>lombok</artifactId>
						</exclude>
					</excludes>
				</configuration>
				<executions>
					<execution>
						<goals>
							<goal>build-info</goal>
						</goals>
					</execution>
				</executions>
			</plugin>
			<plugin>
				<groupId>pl.project13.maven</groupId>
				<artifactId>git-commit-id-plugin</artifactId>
			</plugin>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.8.1</version>
				<configuration>
					<source>17</source>
					<target>17</target>
					<annotationProcessorPaths>
						<path>
							<groupId>org.mapstruct</groupId>
							<artifactId>mapstruct-processor</artifactId>
							<version>1.4.2.Final</version>
						</path>
						<path>
							<groupId>org.projectlombok</groupId>
							<artifactId>lombok</artifactId>
							<version>1.18.20</version>
						</path>
						<path>
							<groupId>org.projectlombok</groupId>
							<artifactId>lombok-mapstruct-binding</artifactId>
							<version>0.2.0</version>
						</path>
					</annotationProcessorPaths>
				</configuration>
			</plugin>
</build>
```
P.S. You don't need to add those dependencies if there are already other mappers in ./service/mapper/ folder.

## Project with examples
Link for the github repo: https://github.com/ggrigorov123123/mapStructForDummies
Examples may be a little bit different from the implementation in the project, but the main idea is the same.
To test different mappers uncomment the code in the GlobalCommandLineRunner file for the example you want!
- P1: Basic mapper, where the fields and structure of the Entity and the DTO are the same.
- P2: Mapping fields with different names
- P3: Converting object to field
- P4: Mapper using another mapper (Some kind of dependency injection)
  -- You need to add external dependencies like this:
```sh
@Mapper(componentModel = "spring", uses = CountryMapper.class)
public interface PersonMapper {
   ...
}
```
- StackOverflowSolution
  -- StackOverflow can occur when we have a bidirectional connection between two Entities. Here you can see the solution with additional '@Named' methods and an attribute 'qualifiedByName = ...'
- Usage of constants and expressions
  [df1]: <http://daringfireball.net/projects/markdown/>
