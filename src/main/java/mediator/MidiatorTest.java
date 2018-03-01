package mediator;

public class MidiatorTest {
    public static void main(String[] args) {
        String data = "felix data";
        PersistantDB persistantDB = new PersistantDB();
        PersistentCloud persistentCloud = new PersistentCloud();
        Midiator midiator = new Midiator();
        midiator.setPersistantCloud(persistentCloud).setPersistantDB(persistantDB);
        persistantDB.save(data, midiator);
        persistentCloud.save(data, midiator);
    }
}
