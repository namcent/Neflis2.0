package neflis.neflisdemo.model;

import javax.print.DocFlavor;

public class EpisodeApi{
    private int id;
    private String number;
    private String runtime;
    private String guest_actors;

    public EpisodeApi(int id, String number, String runtime, String guest_actors) {
        this.id = id;
        this.number = number;
        this.runtime = runtime;
        this.guest_actors = guest_actors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getGuest_actors() {
        return guest_actors;
    }

    public void setGuest_actors(String guest_actors) {
        this.guest_actors = guest_actors;
    }


}