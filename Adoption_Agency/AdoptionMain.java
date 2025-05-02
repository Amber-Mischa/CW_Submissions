/**                                                                           
 * This class is used to generate Dog and                                     
 * PuppyDog objects, and call all the                                         
 * methods associated with those objects.                                     
 * Like increasing the age, comparing two                                     
 * Dog or PuppyDog objects, print out its                                     
 * information and if it is adoped.                                           
 * @author amberkanthack                                                      
 */                                                                           
public class AdoptionMain {                                                   
                                                                              
	public static void main(String[] args) {                                  
		//creates all the Dog and PuppyDog objects                            
		Dog sky = new Dog(3, "Sky", true);                                    
		PuppyDog snow = new PuppyDog(10, "Snow", false, true);                
		PuppyDog pup = new PuppyDog(4, "Pip", true, false);                   
		PuppyDog pip = new PuppyDog(4, "Pip", true, false);                   
		                                                                      
		//shows if the dog and puppy is adopted                               
		System.out.println(sky.getAdoptionStatus());                          
		System.out.println(snow.getAdoptionStatus());                         
		                                                                      
		//states age for the dog and puppy                                    
		sky.stateAge();                                                       
		snow.stateAge();                                                      
		//increases the age and then restates the name                        
		sky.increaseAge();                                                    
		snow.increaseAge();                                                   
		sky.stateAge();                                                       
		snow.stateAge();                                                      
		                                                                      
		//Prints out the dog\puppy's information                              
		System.out.println(sky);                                              
		System.out.println(snow);                                             
		/*                                                                    
		 * Dog@ea30797                                                        
		 * PuppyDog@7e774085                                                  
		 * These are the hex string of the objects sky and snow               
		 */                                                                   
		System.out.println(pup.equals(pip));                                  
	}                                                                         
	                                                                          
                                                                              
}                                                                             
                                                                              
