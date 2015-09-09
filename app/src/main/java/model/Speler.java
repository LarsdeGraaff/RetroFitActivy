package model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Speler {

    @Expose
    private Integer id;
    @Expose
    private Integer LZVLeuvenId;
    @Expose
    private String playerName;
    @Expose
    private Integer playerSelections;
    @Expose
    private Integer playerGoals;
    @Expose
    private Integer playerAssists;

    /**
     *
     * @return
     * The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The LZVLeuvenId
     */
    public Integer getLZVLeuvenId() {
        return LZVLeuvenId;
    }

    /**
     *
     * @param LZVLeuvenId
     * The LZVLeuvenId
     */
    public void setLZVLeuvenId(Integer LZVLeuvenId) {
        this.LZVLeuvenId = LZVLeuvenId;
    }

    /**
     *
     * @return
     * The playerName
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     *
     * @param playerName
     * The playerName
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    /**
     *
     * @return
     * The playerSelections
     */
    public Integer getPlayerSelections() {
        return playerSelections;
    }

    /**
     *
     * @param playerSelections
     * The playerSelections
     */
    public void setPlayerSelections(Integer playerSelections) {
        this.playerSelections = playerSelections;
    }

    /**
     *
     * @return
     * The playerGoals
     */
    public Integer getPlayerGoals() {
        return playerGoals;
    }

    /**
     *
     * @param playerGoals
     * The playerGoals
     */
    public void setPlayerGoals(Integer playerGoals) {
        this.playerGoals = playerGoals;
    }

    /**
     *
     * @return
     * The playerAssists
     */
    public Integer getPlayerAssists() {
        return playerAssists;
    }

    /**
     *
     * @param playerAssists
     * The playerAssists
     */
    public void setPlayerAssists(Integer playerAssists) {
        this.playerAssists = playerAssists;
    }

}
