package com.example.TestProject.Section3.BusinessCalculationService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component @Qualifier("MySqlDataServiceQualifier")
public class MySqlDataService implements DataService{

        public int[] retrieveData() {
            return new int[]{11, 22, 33, 44, 55};
        }


}
