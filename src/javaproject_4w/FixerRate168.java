package javaproject_4w;
/*
 * 객체를 이용하여 환율 구하기 
 * 힌트: 한 객체에 여러 데이터(정보)를 저장하거나 전송할 수 있다.
 * 
 */
public class FixerRate168 {

	public String base;
	public String date;
	public double usd;
	public double jpy;
	public double krw;
	public double cny;
	public double eur;
	
	@Override
	public String toString() {
		return "FixerRate [base=" + base + ", date=" + date + ","
				+ " usd=" + usd + ", jpy=" + jpy + ", krw=" + krw
				+ ", cny=" + cny + ", eur=" + eur + "]";
	}
	
	/*
	http://api.fixer.io/2017-06-09?base=USD
	{
	  "base": "USD",
	  "date": "2017-06-08",
	  "rates": {
	    "AUD": 1.3264,
	    "BGN": 1.7417,
	    "BRL": 3.2819,
	    "CAD": 1.3514,
	    "CHF": 0.96678,
	    "CNY": 6.7978,
	    "CZK": 23.393,
	    "DKK": 6.6242,
	    "GBP": 0.7726,
	    "HKD": 7.7969,
	    "HRK": 6.6104,
	    "HUF": 274.3,
	    "IDR": 13298,
	    "ILS": 3.5358,
	    "INR": 64.241,
	    "JPY": 110.22,
	    "KRW": 1123.3,
	    "MXN": 18.23,
	    "MYR": 4.2685,
	    "NOK": 8.481,
	    "NZD": 1.387,
	    "PHP": 49.536,
	    "PLN": 3.7461,
	    "RON": 4.0667,
	    "RUB": 57.008,
	    "SEK": 8.7172,
	    "SGD": 1.3826,
	    "THB": 34.037,
	    "TRY": 3.5502,
	    "ZAR": 12.867,
	    "EUR": 0.89055
	  }
	}
	 */

}
