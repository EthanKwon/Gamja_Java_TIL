package exam18;

public class ShowMeTheCity {
	public static void main(String[] args) {
		CityDAO cDao = new CityDAO();
		
		System.out.println("          [국내 인구 100만명 이상인 도시 목록]");
		System.out.println("--------------------------------------------------------");
		System.out.println(String.format("[ %s %5s %5s %10s  %6s   ]","도시ID","도시이름", "국가코드", "도시 구역","인구수"));
		
		for(CityDTO write : cDao.selectManyPeople()) {
			System.out.println(write.toString());
		}
		
	}

}
