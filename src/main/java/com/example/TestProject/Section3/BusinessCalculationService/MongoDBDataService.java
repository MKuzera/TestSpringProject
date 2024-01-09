package com.example.TestProject.Section3.BusinessCalculationService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component @Qualifier("MongoDBDataServiceQualifier")
public class MongoDBDataService implements DataService {
    public int[] retrieveData() {
        return new int[]{1, 2, 3, 4, 5};
    }
}
