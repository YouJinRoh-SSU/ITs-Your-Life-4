package mulcam.kb04.bootjpa0831.ifs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mulcam.kb04.bootjpa0831.entity.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer>{
//JPA=> insert, select 등등 정의할 필요가 없음
}
