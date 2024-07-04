package coveloper.coveloper_spring.member;

public class member {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFirst_track() {
        return first_track;
    }

    public void setFirst_track(String first_track) {
        this.first_track = first_track;
    }

    public String getSecond_track() {
        return second_track;
    }

    public void setSecond_track(String second_track) {
        this.second_track = second_track;
    }

    String id;
    String password;
    int age;
    String nickname;
    String first_track;
    String second_track;

    public member(String id, String password, int age, String nickname, String first_track, String second_track) {
        this.id = id;
        this.password = password;
        this.age = age;
        this.nickname = nickname;
        this.first_track = first_track;
        this.second_track = second_track;
    }


}
