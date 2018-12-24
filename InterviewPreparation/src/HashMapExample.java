import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

class HashMapExample1 {
 String megha;
 int n;
 public HashMapExample1(String megha, int n) {
	super();
	this.megha = megha;
	this.n = n;
}
 
public String getMegha() {
	return megha;
}

public void setMegha(String megha) {
	this.megha = megha;
}

public int getN() {
	return n;
}

public void setN(int n) {
	this.n = n;
}

@Override
public int hashCode() {
	System.out.println("in hashcode");
	final int prime = 31;
	int result = 1;
	result = prime * result + ((megha == null) ? 0 : megha.hashCode());
	result = prime * result + n;
	return result;
}
@Override
public boolean equals(Object obj) {
	System.out.println("in equals");
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	HashMapExample1 other = (HashMapExample1) obj;
	if (megha == null) {
		if (other.megha != null)
			return false;
	} else if (!megha.equals(other.megha))
		return false;
	if (n != other.n)
		return false;
	return true;
}
}

public class HashMapExample
{
	public static void main(String[] args)
	{
		HashMap <HashMapExample1,String> hm=new HashMap();
		hm.put(new HashMapExample1("megha",2),"valueone");
		hm.put(new HashMapExample1("megha",2),"valuetwo");
		hm.put(new HashMapExample1("megha1",3),"valuethree");
		//System.out.println(hm);
		Iterator itr =hm.entrySet().iterator();
		while(itr.hasNext())
		{
			Entry e=(Entry) itr.next();
			System.out.println(e.getKey()+""+e.getValue());
			HashMapExample1 obj= (HashMapExample1) e.getKey();
			System.out.println(obj.getN());
			System.out.println(obj.getMegha());
		}
	}
	
}
