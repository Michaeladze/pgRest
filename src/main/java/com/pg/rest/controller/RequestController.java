package com.pg.rest.controller;

import com.pg.rest.model.Request;
import com.pg.rest.repository.CategoriesRepository;
import com.pg.rest.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@CrossOrigin(origins = "http://localhost:8000")
@RequestMapping(path = "/requests")
public class RequestController {

    @Autowired
    private RequestRepository requestRepository;

    @Autowired
    private CategoriesRepository categoriesRepository;

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Request> getAllRequests(@RequestParam(value = "q", defaultValue = "") String query) {
        return requestRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody
    Optional<Request> getRequestById(@PathVariable("id") String id) {
        return requestRepository.findById(id);
    }

    @GetMapping(path = "/setFavourite/{id}")
    public @ResponseBody
    Boolean setFavouriteRequest(@PathVariable("id") String id) {
        Optional<Request> optionalRequest = requestRepository.findById(id);
        if (optionalRequest.isPresent()) {
            Request request = optionalRequest.get();
            Boolean isFavourite = !request.getIsFavourite();
            request.setIsFavourite(isFavourite);
            requestRepository.save(request);

            return isFavourite;
        }

        return false;
    }

}
