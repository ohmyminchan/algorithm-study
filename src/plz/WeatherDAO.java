package plz;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class WeatherDAO extends DefaultHandler {
	    private final File xml = new File("./src\\plz\\weather.xml");
	    // 파싱된 내용을 저장할 List
	    private List<Weather> list = new ArrayList<>();
	    // 현재 파싱하고 있는 대상 객체
	    private Weather current;
	    // 방금 읽은 텍스트 내용
	    private String content;

	    public List<Weather> getWeather() {
	        try {
	        	SAXParserFactory factory = SAXParserFactory.newInstance();
	        	SAXParser parser = factory.newSAXParser();
	        	parser.parse(xml,this);
	        } catch(IOException | SAXException | ParserConfigurationException e) {
	        	e.printStackTrace();
	        }
	        return list;
	    }

		@Override
		public void startDocument() throws SAXException {
			System.out.println("문서 읽기 시작");
		
		}

		@Override
		public void endDocument() throws SAXException {
			System.out.println("문서 읽기 종료");
		}

		@Override
		public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
			//System.out.println("태그 시작"+qName);
			if(qName.equals("data")) {
				current = new Weather();
			}
		}

		@Override
		public void endElement(String uri, String localName, String qName) throws SAXException {
			//System.out.println("태그 종료"+qName);
			if(qName.equals("hour")) {
				current.setHour(Integer.parseInt(this.content));
			}else if(qName.equals("temp")) {
				current.setTemp(Double.parseDouble(this.content));
			}else if(qName.equals("wfKor")) {
				current.setWfKor(this.content);
			}else if (qName.equals("reh")) {
				current.setReh(Integer.parseInt(this.content));
			}else if(qName.equals("data")) {
				list.add(current);
				current = null;
			}
		}

		@Override
		public void characters(char[] ch, int start, int length) throws SAXException {
			this.content = new String(ch,start,length);
		}
	    
	    // TODO: 필요한 매서드를 재정의 하여 Weather.xml을 파싱하시오.
	    
	    
	    // END:
	}


