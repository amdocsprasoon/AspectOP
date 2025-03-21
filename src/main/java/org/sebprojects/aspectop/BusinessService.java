package org.sebprojects.aspectop;

import org.springframework.stereotype.Service;

@Service
public class BusinessService {

    private final DataRepository dataRepository;

    public BusinessService(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public int findTheGreatestFromAllData() {
        int[] data = dataRepository.findAllNumbers();
        int greatest = Integer.MIN_VALUE;
        for (int value : data) {
            if (value > greatest) {
                greatest = value;
            }
        }
        return greatest;
    }
}
