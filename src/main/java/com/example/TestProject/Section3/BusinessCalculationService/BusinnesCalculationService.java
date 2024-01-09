package com.example.TestProject.Section3.BusinessCalculationService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.example.TestProject.Section3.BusinessCalculationService.DataService;
import java.util.Arrays;

@Component
public class BusinnesCalculationService {
    DataService dataService;

    BusinnesCalculationService(@Qualifier("MySqlDataServiceQualifier") DataService dataService){
        this.dataService = dataService;
    }
    public int findMax(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }

}
