
public class TrainCar 
{
   // string describes this type of car
   private String myType;
   
   // constructor requires car type
   public TrainCar(String aType)
   {
	   myType = aType;
   }
   
   // return this descriptive type
   public String getType()
   {
	   return myType;
   }
   
   // compare input type to my type and return true if equal
   public boolean isType(String aType)
   {
	   return myType.equalsIgnoreCase(aType);
   }
}