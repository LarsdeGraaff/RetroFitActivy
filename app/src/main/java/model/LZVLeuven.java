package model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class LZVLeuven {

    @Expose
    private Integer id;
    @Expose
    private String teamName;
    @Expose
    private String teamColors;
    @Expose
    private String Sportzaal;
    @Expose
    private String imageURL;

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
     * The teamName
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     *
     * @param teamName
     * The teamName
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     *
     * @return
     * The teamColors
     */
    public String getTeamColors() {
        return teamColors;
    }

    /**
     *
     * @param teamColors
     * The teamColors
     */
    public void setTeamColors(String teamColors) {
        this.teamColors = teamColors;
    }

    /**
     *
     * @return
     * The Sportzaal
     */
    public String getSportzaal() {
        return Sportzaal;
    }

    /**
     *
     * @param Sportzaal
     * The Sportzaal
     */
    public void setSportzaal(String Sportzaal) {
        this.Sportzaal = Sportzaal;
    }

    /**
     *
     * @return
     * The imageURL
     */
    public String getImageURL() {
        return imageURL;
    }

    /**
     *
     * @param imageURL
     * The imageURL
     */
    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

}