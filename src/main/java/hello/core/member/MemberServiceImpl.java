package hello.core.member;

//메모리 회원 저장소 구현체
// HashMap은 동시성 이슈가 발생할 수 있다. 이런 경우 ConcurrentHashMap 사용
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
