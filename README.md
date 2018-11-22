# Ktor Sample

## What is Ktor

Ktor is a framework to easily build connected applications – web applications, HTTP services, mobile and browser applications. Modern connected applications need to be asynchronous to provide the best experience to users, and Kotlin coroutines provide awesome facilities to do it in an easy and straightforward way.

- More info: https://ktor.io/

## About project

This project creates sample HTTP client and HTTP servers with minimum configurations.

## How to run

1. Make a clone of this project.
    ```shell
    $ git clone https://github.com/ldclakmal/ktor-sample.git
    ```

2. Build the project.
    ```shell
    $ mvn clean install
    ```

3. Open the project with [IntelliJ IDEA](https://www.jetbrains.com/idea/) for better user experience.

4. Run the `*.kt` files with `main` functions.
    ```kotlin
    fun main(args: Array<String>) {

    }
    ```

5. Access the services with the configured port and path.
    ```
    Eg.: http://localhost:9090/demo
    ```

#### References:
1. https://blog.jetbrains.com/kotlin/2018/11/ktor-1-0/
2. https://ktor.io/quickstart/index.html