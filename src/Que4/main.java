package Que4;

import java.util.ArrayList;

class Report{
    int id;
    String name;
    ArrayList<Group> groups;

    public Report(int id, String name, ArrayList<Group> groups) {
        this.id = id;
        this.name = name;
        this.groups = groups;
    }
    void addGroup(Group group){
        groups.add(group);
    }
    void showDetails(){
        System.out.println("Report ID: " +id);
        System.out.println("Report Name: " +name);
        System.out.println("Groups:");

        for(Group g : groups){
            System.out.println("  Group Name: " + g.groupName);
            System.out.println("  Description: " + g.groupDescription);
        }
    }
}

class DyanmicReport extends Report{
    String query;

    public DyanmicReport(int id, String name, ArrayList<Group> groups, String query) {
        super(id, name, groups);
        this.query = query;
    }

}
public class main {
    public static void main(String[] args) {

    }
}
