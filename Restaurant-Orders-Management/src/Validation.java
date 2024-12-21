import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Validation {
    public static Date dateValidation(String date) {
        DateFormat simpledateformat= new SimpleDateFormat("dd/MM/yyyy");
        simpledateformat.setLenient(false);
        while (true){
            try {
                Date formattedDate = simpledateformat.parse(date);
                if(formattedDate.before(new Date())) throw new ParseException("",0);
                return formattedDate;
            } catch (ParseException parseException){
            }
        }
    }
}
