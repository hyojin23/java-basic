package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct memeber1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct memeber2 = new MemberConstruct("user2", 16);

        MemberConstruct[] members = {memeber1, memeber2};

        for (MemberConstruct s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
    }
}
