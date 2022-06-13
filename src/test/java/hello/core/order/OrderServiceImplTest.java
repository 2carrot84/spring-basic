package hello.core.order;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import hello.core.discount.RateDiscountPolicy;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemoryMemberRepository;

public class OrderServiceImplTest {

	@Test
	void createOrder() {
		MemoryMemberRepository memberRepository = new MemoryMemberRepository();
		memberRepository.save(new Member(1L, "memeberA", Grade.BASIC));
		OrderServiceImpl orderService = new OrderServiceImpl(memberRepository, new RateDiscountPolicy());

		Order order = orderService.createOrder(1L, "itemA", 20000);
		assertThat(order.getDiscountPrice()).isEqualTo(0);
	}
}
