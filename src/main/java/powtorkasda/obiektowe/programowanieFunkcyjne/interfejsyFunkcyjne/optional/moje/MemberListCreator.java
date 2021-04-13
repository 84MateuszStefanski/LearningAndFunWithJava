package powtorkasda.obiektowe.programowanieFunkcyjne.interfejsyFunkcyjne.optional.moje;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class MemberListCreator {
    List<Member> members;
    Optional<List> optionalMember;

    public MemberListCreator() {
        createList();
       optionalMember = Optional.ofNullable(members);
       if (optionalMember.isPresent()){
           System.out.println("Optional is working");
           optionalMember.stream().sorted().forEach(System.out::println);
       }else {
           System.out.println("Empty optional");
       }
    }

    private void createList() {
        members = new ArrayList<>();
        members.add(new Member("Zlatan", "Ibrahimovic", 1982));
        members.add(new Member("Janko", "Zlatkovic", 1992));
        members.add(new Member("Arhan", "Marahagiri", 1989));
        members.add(new Member("Paatan", "Drahmovic", 1999));
    }

    public static void main(String[] args) {
        new MemberListCreator();
    }

}
