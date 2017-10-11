package reader;

import reader.criteria.AllLines;
import reader.criteria.Both;
import reader.criteria.Criterion;
import reader.criteria.ContainsWord;
import reader.criteria.EndsWithQuestionOrExclamationMark;
import reader.criteria.LengthAtLeast;
import reader.criteria.Not;

public class Main {

    public static void main(String[] args) {
        String address = "https://www.gutenberg.org/files/55404/55404-h/55404-h.htm";
        GutenbergReader book = new GutenbergReader(address);

        Criterion criterion = new Not(new LengthAtLeast(10));

        for (String line : book.linesWhichComplyWith(criterion)) {
            System.out.println(line);
        }
    }
}
