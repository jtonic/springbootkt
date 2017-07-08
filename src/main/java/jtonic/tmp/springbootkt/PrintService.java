package jtonic.tmp.springbootkt;

import org.springframework.stereotype.Service;

/**
 * Created by Antonel Ernest Pazargic on 08/05/2017.
 *
 * @author Antonel Ernest Pazargic
 */
@Service
public class PrintService {

    private String name = "Minolta";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(String msg) {
        System.out.println(msg);
    }
}



