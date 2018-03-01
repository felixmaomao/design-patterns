package mediator;

public interface Persistent {

    void save(String data);

    void save(String data, Midiator midiator);
}
