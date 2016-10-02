package book;

/**
 * Created by NotePad.by on 02.10.2016.
 */
public class ProgrammerBook extends Book{
    private String language;
    private int level;

    public ProgrammerBook(String language, int level) {
        this.language = language;
        this.level = level;
    }

    public String GetProgrammerBookLanguage() {
        return language;
    }

    public int GetProgrammerBookLevel() {
        return level;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;

        if (obj == this)
            return true;

        if (getClass() != obj.getClass())
            return false;

        if (!super.equals(obj))
            return false;

        ProgrammerBook currentProgrammerBook = (ProgrammerBook) obj;

        if (this.GetProgrammerBookLanguage().equals(currentProgrammerBook.GetProgrammerBookLanguage()))
            return false;

        if (this.GetProgrammerBookLevel() != currentProgrammerBook.GetProgrammerBookLevel())
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode() ;
        result += this.GetProgrammerBookLevel();

        if (this.GetProgrammerBookLanguage() != null)
            result += this.GetProgrammerBookLanguage().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "(ProgrammerBook)" + "  Language: '" + language + '\'' + ",  Level = " + level;
    }
}
