package ClientService;

import com.leyou.pojo.SepcParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("spec")
public interface SpecService {

    @RequestMapping("paramsBycid")
    public List<SepcParam> findSepcParamAndSearching(@RequestParam(value = "cid") Long cid);
}
