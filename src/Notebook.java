import java.util.ArrayList;


public class Notebook
{

    private ArrayList<String> notes;

    public Notebook()
    {
        notes = new ArrayList<String>();
    }

    public void storeNote(String note)
    {
        notes.add(note);
    }

    public int numberOfNotes()
    {
        return notes.size();
    }

    public void showNote(int noteNumber)
    {
        if(noteNumber < 0) {
            // This is not a valid note number, so do nothing.
        }
        //-1 used so the input can be index 1
        else if(noteNumber-1 < numberOfNotes()) {
            // This is a valid note number, so we can print it.
            System.out.println(notes.get(noteNumber-1));
        }
        else {
            // This is not a valid note number, so do nothing.
        }
    }

    public void listNotes()
    {
        //For each note in the notes collection, print the note
        //any string can replace 'note'
        for (String note : notes) {
            System.out.println(note);
        }
    }

    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        notebook.storeNote("This is a note");
        notebook.storeNote("This is another note");
        System.out.println(notebook.numberOfNotes());
        notebook.listNotes();
        notebook.showNote(1);
        notebook.showNote(2);
        notebook.storeNote("This is the 3rd and final note");
        notebook.showNote(3);
    }
}
