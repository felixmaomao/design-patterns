package mediator;

public class PersistentCloud implements Persistent {

    @Override
    public void save(String data) {
        System.out.println("data has been saved to cloud:" + data);
    }

    @Override
    public void save(String data, Midiator midiator) {
        save(data);
        midiator.notifyOthers(this, data);
    }
}
