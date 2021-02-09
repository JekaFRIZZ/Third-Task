package com.epam.task.third.data;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    private final Logger LOGGER = Logger.getLogger(DataReader.class);

    public List<String> readDate(String filename) throws DataException {

        List<String> data = new ArrayList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

            String line = bufferedReader.readLine();

            while(line != null) {
                data.add(line);
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            LOGGER.error(e.getMessage(),e);
            throw new DataException(e.getMessage(), e);
        }

        return data;
    }

}
