package model;

import java.util.ArrayList;
import java.util.List;

public class MyProfile {

    private String name;
    private int age;
    private String currentLocation;
    private String workPlace;
    private List<MyProfile> friendsList;
    private List<Event> upcomingEvents;

    public MyProfile(String nm, int age, String locn, String work) {
        name = nm;
        this.age = age;
        currentLocation = locn;
        workPlace = work;
        friendsList = new ArrayList<>();
        upcomingEvents = new ArrayList<>();
    }

    // getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getCurrentLocation() {
        return currentLocation;
    }
    public String getWorkPlace() {
        return workPlace;

    }
    public int upcomingEventNum() {
        return upcomingEvents.size();

    }
    public List<MyProfile> getFriendsList() {
        return friendsList;
    }
    public List<Event> getEventList() {
        return upcomingEvents;
    }

    // REQUIRES: f is not already in friendsList
    // MODIFIES: this
    // EFFECTS: consumes a MyProfile object, a friend f, and adds it to the friendsList
    public void addFriend(MyProfile f) {
        friendsList.add(f);
    }

    // MODIFIES: this
    // EFFECTS: removes a friend with the given name from this. If removal is successful, return true, else
    //          return false
    public boolean unFriend(String nm) {
        for(MyProfile friend : friendsList){
            if(friend.getName().equals(nm)){
                friendsList.remove(friend);
                return true;
            }
        }
        return false;
    }

    // REQUIRES: ev is not in upcomingEvents
    // MODIFIES: this
    // EFFECTS: adds the given event to the list of upcoming events
    public void addEvent(Event ev) {
        upcomingEvents.add(ev);
    }

    // MODIFIES: this
    // EFFECTS: removes an event with the given name. If removal is successful, return true, else return false
    public boolean removeEvent(String nm) {
        for(Event event : upcomingEvents){
            if(event.getName().equals(nm)){
                upcomingEvents.remove(event);
                return true;
            }
        }
        return false;
    }

    // EFFECTS: returns the number of events that are at the current location of this person
    public int eventNumNearMe() {
        int num = 0;
        for(Event event : upcomingEvents){
            if(event.getLocation().equals(currentLocation)){
                num++;
            }
        }
        return num;
    }

    // EFFECTS: returns the number of events of the given type et
    public int specificEventType(EventType et) {
        int num = 0;
        for(Event event : upcomingEvents){
            if(event.getEventType() == et){
                num++;
            }
        }
        return num;
    }

    // EFFECTS: prints events of  type et to the console
    //          Hint: is there a method you have already written that you can use?
    public void printEventSchedule(EventType et) {
        for(Event event : upcomingEvents){
            if(event.getEventType() == et){
                System.out.println(event.getName());
            }
        }
    }

    // EFFECTS: prints out the list of friends that this MyProfile has
    public void printFriendNames() {
        for(MyProfile friend : friendsList){
            System.out.println(friend.getName());
        }
    }

    // EFFECTS: prints out the names of friends who live at the same location associated with this profile
    public void printFriendsNearMe() {
        for(MyProfile friend : friendsList){
            if(friend.getCurrentLocation().equals(currentLocation)){
                System.out.println(friend.getName());
            }
        }
    }

    // EFFECTS: produces true if this profile has a friend with the given name,
    //          OR if any of this profile's friends has a friend with the given name
    //          Hint: use recursion!
    public boolean canFindPerson(String name) {
        boolean check = false;
        for(MyProfile friend : friendsList){
            if(friend.getName().equals(name)){
                return true;
            } else{
                check = check || friend.canFindPerson(name);
            }
        }
        return check;
    }


}
