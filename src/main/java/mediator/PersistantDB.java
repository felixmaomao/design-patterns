package mediator;

public class PersistantDB implements Persistent {


    @Override
    public void save(String data) {
        System.out.println("data has been saved to db:" + data);
    }

    @Override
    public void save(String data, Midiator midiator) {
        save(data);
        midiator.notifyOthers(this, data);
    }
}
