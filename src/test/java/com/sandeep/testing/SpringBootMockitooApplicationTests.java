package com.sandeep.testing;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.sandeep.testing.controller.ProductRestController;
import com.sandeep.testing.repository.IProductService;
import com.sandeep.testing.service.ProductServiceImpl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
//@WebMvcTest
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
@TestPropertySource(locations = "classpath:application-test.properties")
class SpringBootMockitooApplicationTests
{
	@Autowired
	private MockMvc mockMvc;
	
	//1. Post Method case
	
	  @Test 
	  public void testProductSave() throws Exception 
	  { 
		  MvcResult result = mockMvc.perform(post("/product/register")
	                        .contentType(MediaType.APPLICATION_JSON)
	                        .content("{\"prodCode\":\"ABCD\",\"prodCost\":88.55,\"vendorCode\": \"V11\"}" )) 
				             .andReturn(); 
		                      MockHttpServletResponse resp = result.getResponse();
	                          assertEquals(HttpStatus.OK.value(), resp.getStatus());
	                         System.out.println(resp.getContentAsString());
	                         assertNotNull(resp.getContentAsString()); 
	                         
	   }
	 
	
	//2. Get Method Test Case
	
	/*  @Test 
	  public void testProductGet() throws Exception 
	  {
		  MvcResult result = mockMvc.perform(get("/product/get/5")).andReturn(); 
		  MockHttpServletResponse  resp = result.getResponse(); 
		  assertEquals(HttpStatus.OK.value(),resp.getStatus()); 
		  assertNotNull(resp.getContentAsString()); 
	   }
	 */
	
	//3. Put Method Test Case
	
	/*  @Test
	  public void testProductPut()throws Exception 
	  {
		  MvcResult  result= mockMvc.perform(put("/product/edit")
	                        .contentType(MediaType.APPLICATION_JSON)
	                        .content("{\"prodId\":5, \"prodCode\":\"ABCDE\",\"prodCost\":38.55,\"vendorCode\": \"V14\"}" ))
				            .andReturn();
		                    MockHttpServletResponse resp=result.getResponse();
	                        assertEquals(HttpStatus.OK.value(), resp.getStatus());
	                        System.out.println(resp.getContentAsString());
	                        assertNotNull(resp.getContentAsString()); 
	   }
	 */
	
	//4. Delete Method Test Case
	
	/*  @Test
	  public void testProductDelete()throws Exception 
	  {
		  MvcResult  result =  mockMvc.perform(delete("/product/delete/5")).andReturn();
	      MockHttpServletResponse resp=result.getResponse();
	      assertEquals(HttpStatus.OK.value(), resp.getStatus());
	      System.out.println(resp.getContentAsString());
	      assertNotNull(resp.getContentAsString()); 
	  }
	 */
}
	
	
	
	

	

