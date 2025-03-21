package org.sebprojects.aspectop;

import org.springframework.stereotype.Repository;

@Repository
public class DataRepository
{
    public int[] findAllNumbers()
    {
        return new int[] {1, 2, 3, 40, 5};
    }
}
