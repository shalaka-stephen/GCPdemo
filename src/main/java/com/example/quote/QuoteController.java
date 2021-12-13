package com.example.quote;
import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
public class QuoteController {
    private ArrayList<Quote> quotes = new ArrayList<>();

//    @GetMapping("/quotes")
//    public ArrayList<Quote> getQuotes(){
//        return quotes;
//    }

    @GetMapping("/quotes")
    public ResponseEntity<ArrayList<Quote>> getQuotes() {
        //return ResponseEntity.ok().body(greetings);
        return ResponseEntity.status(HttpStatus.OK).body(quotes);
    }




//    @PostMapping("/quote")
//    public String CreateQuotes(@RequestBody Quote quote){
//        quotes.add(quote);
//        return "quotes Added";
//    }

    @PostMapping("/quote")
    public ResponseEntity<String> CreateQuote(@RequestBody Quote quote){
        quotes.add(quote);
        return ResponseEntity.status(HttpStatus.CREATED).body("Quote Added: ");
    }


}

