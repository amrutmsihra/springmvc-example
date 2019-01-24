package com.journaldev.spring.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.journaldev.spring.model.RestRequest;
import com.journaldev.spring.model.RestResponse;
import com.journaldev.spring.model.User;

@Controller
public class HomeController {

	/**
	 * JSON as response
	 */
	
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public @ResponseBody RestResponse get() {
		RestResponse response = new RestResponse();
		response.setStatus("SUCCESS");
		response.setMessage("Successful");
		return response;
	}
	/**
	 * Method to display accepting json request
	 * {
		"productId":"1",
		"description":"Message"
		}
		Set header Content-Type:application/json
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
	public @ResponseBody RestResponse saveData(@RequestBody RestRequest request ) {
		
		RestResponse response = new RestResponse();
		response.setStatus("SUCCESS");
		response.setMessage("Message"+request.getDescription());
		List<RestRequest> requestList = new ArrayList();
		requestList.add(request);
		response.setSampleRequest(requestList);
		return response;
	}
	/**
	 * Sample Request /queryParam?productId=1&message=TEst
	 * @param productId
	 * @param message
	 * @return
	 */
	@RequestMapping(value = "/queryParam", method = RequestMethod.GET)
	public @ResponseBody RestResponse showQueryData(@RequestParam int productId,String message ) {
		
		RestResponse response = new RestResponse();
		response.setStatus("SUCCESS");
		response.setMessage("Message :"+message);
		return response;
	}
	/**
	 * Sample Request pathParam/1/HiMessage2
	 * @param productId
	 * @param message
	 * @return
	 */
	@RequestMapping(value = "/pathParam/{productId}/{message}", method = RequestMethod.GET)
	public @ResponseBody RestResponse showPathData(@PathVariable("productId") int productId,@PathVariable("message") String message ) {
		
		RestResponse response = new RestResponse();
		response.setStatus("SUCCESS");
		response.setMessage("Message :"+message);
		return response;
	}
	
}
