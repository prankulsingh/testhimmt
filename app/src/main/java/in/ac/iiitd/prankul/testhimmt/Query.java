package in.ac.iiitd.prankul.testhimmt;

import java.util.ArrayList;

/**
 * Created by Prankul on 27-10-2016.
 */

public class Query {
    String title,query;
    ArrayList<Messege> messeges;

    public Query(String title, String query, ArrayList<Messege> messeges) {
        this.title = title;
        this.query = query;
        this.messeges = messeges;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public ArrayList<Messege> getMesseges() {
        return messeges;
    }

    public void setMesseges(ArrayList<Messege> messeges) {
        this.messeges = messeges;
    }
}
