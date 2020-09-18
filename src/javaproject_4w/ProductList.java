package javaproject_4w;
import java.util.*;
public class ProductList {
	private int[] catg={6,1,4,3,3,1,1,3,3,3,1};
	public String [] splist(String str){
		String[] ss=new String[catgLength()];
		ss[0]=str.substring(0,catNumTo(catg,0)).trim();
		for(int i=1;i<ss.length;i++){
			ss[i]=str.substring(catNumTo(catg,i-1),
			               catNumTo(catg,i)).trim();
		}
		return ss;
	}
	public Product splistP(String str){
		Product p=new Product();
		String[] ss=splist(str);
		p.setProduct(ss);
		return p;
	}
	public List<Product> getAllProducts(List<String> v){
		List<Product> products=new ArrayList<Product>();
		for(int i=0;i<v.size();i++){
			String str=v.get(i);
			Product p=splistP(str);
			products.add(p);
		}
		return products;
	}
    public List<Product> getAllProdInGrade(String []ss1, List<Product> v){
    	List<Product> products=new ArrayList<Product>();
		for(int i=0;i<v.size();i++){
			Product p=v.get(i);
			for(int j=0;j<ss1.length;j++){
				if(p.getPGrade().equals(ss1[j])){
					products.add(p);
				}
			}
		}
		return products;
	}
	private int catgLength(){
		return this.catg.length;
	}
	private int catNumTo(int [] aa,int a){
		int toto=0;
		if(aa.length<a){
			toto=0;
		}else{
			for(int i=0;i<=a;i++){
				toto+=aa[i];
			}
		}
		return toto;
	}
		
}
