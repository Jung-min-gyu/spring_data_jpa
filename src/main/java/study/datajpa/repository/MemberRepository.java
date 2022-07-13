package study.datajpa.repository;

import org.apache.catalina.LifecycleState;
import org.springframework.data.jpa.repository.JpaRepository;
import study.datajpa.entity.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {  //인터페이스를 상속받았는데도 구현체가 없다?!

//    List<Member> findByUsername(String username);  //굳이 구현하지 않아도 동작한다!! 이게 바로 query method 방식.

    List<Member> findByUsernameAndAgeGreaterThen(String username, int age);
}
