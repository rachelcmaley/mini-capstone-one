package com.techelevator.models.file_io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    public static void logMessage(String message)
    {
        File logFile = new File("src/main/resources/log.txt");

        try(FileWriter fileWriter = new FileWriter(logFile,true);
            PrintWriter writer = new PrintWriter(fileWriter)
        )
        {
            // open the log file to append and write the message
            // format: <current date, 12 hr time> <message>
            String dateStamp = LocalDate.now().toString();

            String pattern = "hh:mm:ss a";
            LocalTime now = LocalTime.now();
            String timeStamp = (now.format(DateTimeFormatter.ofPattern(pattern)));


            writer.println(dateStamp + " " + timeStamp + " " + message);
        }
        catch (IOException ex)
        {
            // swallow the exception
        }

    }

}
