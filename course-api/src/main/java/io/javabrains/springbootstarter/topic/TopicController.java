package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired   //marks that rquires a dependency injection
	private TopicService topicService;
	
	@RequestMapping("/topics")  // by default it is a GET method
	public List<Topic> getAllTopics() {  //get all the topics
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}") // id is a variable which we are passing
	public Topic getTopic(@PathVariable String id) { // path variable links the vale that is given in path toh the argument of function 
														// if the name of value would be different , we could have written @PathVariable("foo")
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics") //map this method to any request when it is POST and url is /topics
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}") //map this method to any request when it is PUT and url is /topics/ID
	public void updateTopic(@RequestBody Topic topic,@PathVariable String id) {
		topicService.updateTopic(id,topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}") //map this method to any request when it is DELETE and url is /topics/ID
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
	
	
}
