package me.repackage;

import io.inversion.cloud.action.lambda.ApiGatewayRequestStreamHandler;
import io.inversion.cloud.action.rest.RestAction;
import io.inversion.cloud.action.sql.SqlDb;
import io.inversion.cloud.model.Api;

/**
 * Quick start example to wire up and run a REST API  
 * that exposes relational db tables as REST collections.
 * 
 * See https://github.com/inversion-api/inversion-engine for full configuration options.
 *      
 */
public class MyInversionApiGatewayRequestStreamHandler extends ApiGatewayRequestStreamHandler
{
   /**
    * Constructs a REST API that exposes database tables and REST collections. 
    */
   public Api buildApi()
   {
      return new Api()//
                      .withName("demo")

                      //-- DATABASE CONFIGURATION OPTION #1.
                      //-- you can set your database connection information explicitly in the code here... 
                      .withDb(new SqlDb("myDb", //
                                        "org.h2.Driver", //
                                        "jdbc:h2:mem:northwind;DB_CLOSE_DELAY=-1", //
                                        "sa", //
                                        "", SqlDb.class.getResource("northwind-h2.ddl").toString()))

                      //-- DATABASE CONFIGURATION OPTION #2 & #3
                      //-- comment out the above  "withDb()" method and uncomment below
                      //.withDb(new SqlDb("myDb"))

                      //-- then add the following name value pairs to one of the following
                      //--   - to an 'inversion.properties' file in the classpath
                      //--   - OR as java system properties
                      //--   - OR as environment variables
                      //-- 
                      //--  myDb.driver=${YOUR_JDBC_DRIVER}
                      //--  myDb.url=${YOUR_JDBC_URL}
                      //--  myDb.user=${YOUR_JDBC_USERNAME}
                      //--  myDb.pass=${YOUR_JDBC_PASSWORD

                      .withEndpoint("GET,PUT,POST,DELETE", "/*", new RestAction());
   }
}
