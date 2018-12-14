package cos.net.glowny;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import podmodulPackage.PodmodulService;
import innyPodmodulPackage.InnyService;

@Service
public class GlownyService {

    @Autowired
    PodmodulService podmodulService;
    @Autowired
    InnyService innyService;


    public void piszDupa(){

        podmodulService.costam();
        innyService.innyPisz();

        System.out.println(" !!!!!!!! wywolany przez serwis glowny !!!!! " );
    }





}



