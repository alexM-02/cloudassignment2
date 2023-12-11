package com.example.demo;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.util.Map;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.text.DecimalFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentEngagement {

    
   
        @GetMapping()
        @CrossOrigins(origins = "*")
        public ResponseEntity<String> calculatedEngagementScore(

        @RequestParam(value = "attendance_1") int lecTotal,
        @RequestParam(value = "attendance_2") int labTotal,
        @RequestParam(value = "attendance_3") int suppTotal,
        @RequestParam(value = "attendance_4") int canvasTotal,
        )
        

            
            int attendance_1 = Integer.parseInt(params[0].split("=")[1]);
            int attendance_2 = Integer.parseInt(params[1].split("=")[1]);
            int attendance_3 = Integer.parseInt(params[2].split("=")[1]);
            int attendance_4 = Integer.parseInt(params[3].split("=")[1]);

            double lecTotal = (attendance_1 * 0.3) / 33;
            double labTotal = (attendance_2 * 0.4) / 22;
            double suppTotal = (attendance_3 * 0.15) / 44;
            double canvasTotal = (attendance_4 * 0.15) / 55;

            double calculatedEngagementScore = lecTotal + labTotal + suppTotal + canvasTotal;

            String response = "{\"Engagement Score\":" + calculatedEngagementScore + "}";

            exchange.getResponseHeaders().set("Content-Type", "application/json");
            exchange.getResponseHeaders().set("Access-Control-Allow-Origin", "*");
            exchange.getResponseHeaders().set("Access-Control-Allow-Credentials", "*");
            exchange.getResponseHeaders().set("Access-Control-Allow-Headers", "true");
            exchange.sendResponseHeaders(200, response.length());

            var res = new ResponseEntity<Double>(response,HttpStatus.OK);
            return res;
           
}
