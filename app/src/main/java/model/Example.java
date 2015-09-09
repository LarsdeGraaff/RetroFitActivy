package model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Example {

    @Expose
    private List<model.LZVLeuven> LZVLeuven = new ArrayList<model.LZVLeuven>();
    @Expose
    private List<Speler> Spelers = new ArrayList<Speler>();

    /**
     *
     * @return
     * The LZVLeuven
     */
    public List<model.LZVLeuven> getLZVLeuven() {
        return LZVLeuven;
    }

    /**
     *
     * @param LZVLeuven
     * The LZVLeuven
     */
    public void setLZVLeuven(List<model.LZVLeuven> LZVLeuven) {
        this.LZVLeuven = LZVLeuven;
    }

    /**
     *
     * @return
     * The Spelers
     */
    public List<Speler> getSpelers() {
        return Spelers;
    }

    /**
     *
     * @param Spelers
     * The Spelers
     */
    public void setSpelers(List<Speler> Spelers) {
        this.Spelers = Spelers;
    }

}