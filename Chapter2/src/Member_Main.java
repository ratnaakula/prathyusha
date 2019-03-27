

public class Member_Main
{
	
	public static void main(String [] args) {
		FamilyMember venkata = new FamilyMember();
		venkata.setName("Venkata");
		venkata.setRelationship("Mamayya");
		venkata.setAge(50);
		System.out.println("Name: " + venkata.getName() + " Relationship:" + venkata.getRelationship() + " Priority: "
				+ venkata.priorityOfAMember(1) + " Age: " + venkata.getAge());
		
		FamilyMember ratna = new FamilyMember();
		ratna.setName("ratna");
		ratna.setRelationship("Athamma");
		ratna.setAge(40);
		System.out.println("Name: " + ratna.getName() + " Relationship:" + ratna.getRelationship() + " Priority: "
				+ venkata.priorityOfAMember(1) + " Age: " + ratna.getAge());
		
		FamilyMember raj = new FamilyMember();
		
		FamilyMember prathyusha = new FamilyMember();
		prathyusha.setName("prathyusha");
		prathyusha.setRelationship("daughterinlaw");
		prathyusha.setAge(20);
		
		System.out.println("Name: " + prathyusha.getName() + " Relationship:" + prathyusha.getRelationship() + " Priority: "
				+ prathyusha.priorityOfAMember(1) + " Age: " + prathyusha.getAge());
	}

}
