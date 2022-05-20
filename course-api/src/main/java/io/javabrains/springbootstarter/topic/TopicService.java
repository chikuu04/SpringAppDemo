package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service     //identifies that the class is a service  
public class TopicService {
	
//	Spring MVC understands that the java code has to be returned in JSON format , 
//	hence, here we are returning objects and Spring MVC is converting the result in JSON format 
//	that will be seen on the screen.
	private List<Topic> topics = new ArrayList<> (Arrays.asList(
			new Topic("spring","spring Framework","Spring Framework Description"),
			new Topic("java","core java","core java Description"),
			new Topic("javaScript","javascript Framework","javaScript Framework Description")
			));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();  //lambda expression 
		//t is a variable checking that the id we get matches the id that we requested , find it and return the
		// value by get function
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id,Topic topic) {
		for(int i= 0;i < topics.size();i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}	
	}

	public void deleteTopic(String id) {
		for(int i= 0;i < topics.size();i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.remove(i);
			}
		}	
	}
	
	
}
