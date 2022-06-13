package hello.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

@Configuration
@ComponentScan (
	basePackages = "hello.core",
	excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {
	/* 충돌 테스트를 위한 코드
	@Bean(name = "memoryMemberRepository")
	MemberRepository memberRepository() {
		return new MemoryMemberRepository();
	}*/
}
