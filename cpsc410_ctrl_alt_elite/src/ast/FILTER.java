package ast;

import java.util.ArrayList;
import java.util.List;

public class FILTER extends STATEMENT{
    String filterOption;
    String photo;
    List<String> photos = new ArrayList<>();

    @Override
    public void parse() {
        tokenizer.getAndCheckNext("filter");
        filterOption = tokenizer.getNext();

        tokenizer.getAndCheckNext(":");
        if (tokenizer.checkToken("all")){
            photo = tokenizer.getNext();
            photos.add(photo);
        }
        else {
            while(!tokenizer.checkToken("end")){
                photo = tokenizer.getNext();
                photos.add(photo);
            }
            tokenizer.getAndCheckNext("end");
        }



    }

    @Override
    public void evaluate() {

    }
}