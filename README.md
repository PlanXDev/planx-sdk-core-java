# planx-sdk-core-java
Here is the java version of PlanXSDK.


## First step:
> * Go to the **[PlanX CP](https://cp.planx.io)** to register.
> * Get **AppId** and **SecretKey**.
## Second step:
> * Install library into your Maven's local repository by running `mvn install`
```
    git clone https://github.com/PlanXDev/planx-sdk-core-java
    cd planx-sdk-core-java
    mvn install
```
> * Add the following Maven dependency to your project's `pom.xml`:
```
    <dependency>
      <groupId>io.planckx.api</groupId>
      <artifactId>planx-sdk-core-java</artifactId>
      <version>0.1.0</version>
    </dependency>
```
## Example Usage
> * This example get balance information for all token accounts:
```java
    String baseUrl = "http://cp-api.planx.io";
    String appId = "Go to the PlanX CP website to get";
    String secretKey = "Go to the PlanX CP website to get";
    PlanXClientFactory planXClientFactory = PlanXClientFactory.newInstance(baseUrl,appId, secretKey);
    List<ResponseBalancesBase> balancesBase = planXClientFactory.newAccountClient().getAccountBalancesBase();
    
    // Process your bussiness ...
```

## Other
> * Supports JDK 1.8+
