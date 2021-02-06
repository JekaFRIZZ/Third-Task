package com.epam.task.third.data;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    private final Logger LOGGER = Logger.getLogger(DataReader.class);

    public List<String> readDate(String filename) throws DataException, IOException {

        List<String> data = new ArrayList<>();

        BufferedReader bufferedReader =null;
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(filename);
            bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            while(line != null) {
                data.add(line);
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            LOGGER.error(e.getMessage(),e);
            throw new DataException(e.getMessage(), e);
        }finally {
            if(bufferedReader != null) {
                bufferedReader.close();
            }
            if(fileReader != null) {
                fileReader.close();
            }
        }

        return data;
    }

}
