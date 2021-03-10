package org.ict.di;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DiTest {
	//생성하고 싶은 객체를 선언하고 어노테이션을 이용해 주입합니다.
	@Setter(onMethod_ = @Autowired)
	private Stage stage;
	@Autowired
	private Broadcast broadcast;
	
	//@Test를 받은 메소드가 main 메소드처럼 작송합니다.
	@Test
	public void testExist() {
		//assertNotNull은 ctrl + space로 임포트 시켜야 쓸 수 있습니다.
		assertNotNull(stage);
		assertNotNull(broadcast);
		log.info(stage);
		log.info("====================");
		log.info(broadcast);
		log.info("==========1==========");
	}
	
	//위 메소드와 완전히 같은 동장을 하는 testExist2()를 만들어주세요.
	@Test
	public void testExist2() {
		assertNotNull(stage);
		assertNotNull(broadcast);
		log.info(stage);
		log.info("==================");
		log.info(broadcast);
		log.info("==========2========");
	}
}
