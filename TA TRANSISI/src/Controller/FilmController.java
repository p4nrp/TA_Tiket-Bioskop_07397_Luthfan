package Controller;

import Entity.FilmEntity;
import Model.Film;

public class FilmController {

    public void create(String code, String title, String author, String publisher )
    {
        Film.create(new FilmEntity(code,title,author,publisher));
    }

    public void update(String code, String title, String author, String publisher )
    {
        Film.update(new FilmEntity(code,title,author,publisher));
    }

    public void delete(String code)
    {
        Film.remove(code);
    }

    public FilmEntity search(String code)
    {
        return Film.search(code);
    }

}
