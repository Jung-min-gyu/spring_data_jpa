package study.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.datajpa.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {  //JpaRepository를 상속하면 @Repository 어노테이션을 하지 않아도 된다.

}
