package program;

import java.util.ArrayList;

import uml. *;

public class Main {
	
	public static void main (String[] args) {
		refer(new ContainerShip());
	}
	
	public static void refer(Object o) {

		ArrayList<String> refTypes = new ArrayList<String>();
		
		if (o instanceof ContainerShip) {
			refTypes.add(ContainerShip.class.getSimpleName());
		}
		
		if (o instanceof CruiseShip) {
			refTypes.add(CruiseShip.class.getSimpleName());
		}
		
		if (o instanceof IFrieght) {
			refTypes.add(IFrieght.class.getSimpleName());
		}
		
		if (o instanceof Journey) {
			refTypes.add(Journey.class.getSimpleName());
		}
		
		if (o instanceof OilTanker) {
			refTypes.add(OilTanker.class.getSimpleName());
		}
		
		if (o instanceof Port) {
			refTypes.add(Port.class.getSimpleName());
		}
		
		if (o instanceof Vessel) {
			refTypes.add(Vessel.class.getSimpleName());
		}
		
		Class<? extends Object> objectClass = o.getClass();
		String className = objectClass.getSimpleName();
		String classPackage = objectClass.getPackageName();
 		String allTypes = refTypes.toString();
		
		System.out.println("Class   : " + className);
		System.out.println("Package : " + classPackage);
		System.out.println(refTypes.size() + " reference types can be used to refer to a " + className + " object.");
		System.out.println("Following : " + allTypes.substring(1, allTypes.length()-1) + ".");
		
	}
}
