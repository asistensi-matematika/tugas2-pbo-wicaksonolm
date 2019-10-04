/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

public class Costumer {

    private String name;
    private boolean member = false;
    private String memberType;


    Costumer(String name) {
       this.name=name;
    }

    public String getName() {
        return name;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String getMember() {
        return memberType;
    }

    public void setMemberType(String Type) {
        this.memberType = Type;
    }

    @Override
    public String toString() {
        return "costumer{" + "name=" + name + ", member=" + member + ", memberType=" + memberType + '}';
    }

   
}
