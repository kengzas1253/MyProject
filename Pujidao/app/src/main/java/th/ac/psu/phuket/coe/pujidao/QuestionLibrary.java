package th.ac.psu.phuket.coe.pujidao;

public class QuestionLibrary {
    private String mQuestion[] = {
            "พิพิธภัณฑ์ภูเก็ตไทยหัวเดิมเคยเป็นอะไร",
            "ธนาคารชาร์เตอร์สร้างด้วยดำริของใคร",
            "โอต้าวมีลักษณะคล้ายอะไร",
            "คำว่า大姊(ตัวจี้)หมายความว่าอะไร "
    };
    private String mChoice[][]={
            {"โรงเรียนสอนภาษาจีน","โรงแรม","ภัตตาคาร"},
            {"รัชกาลที่ 5","พระยาพิทักษ์","พระยารัษฎานุประดิษฐ์"},
            {"ปลาทอด","หอยทอด","หมูทอด"},
            {"พี่สาว","พี่สาวคนโต","น้องสาวคนโต"}
    };
    private String mCorrectAnswer[] = {"โรงเรียนสอนภาษาจีน","พระยารัษฎานุประดิษฐ์","หอยทอด","พี่สาวคนโต"};

    public String getQuestion(int a) {
        String question = mQuestion[a];
        return question;
    }
    public String getChoice1(int a) {
        String chice0 = mChoice[a][0];
        return chice0;
    }
    public String getChoice2(int a) {
        String chice1 = mChoice[a][1];
        return chice1;
    }
    public String getChoice3(int a) {
        String chice2 = mChoice[a][2];
        return chice2;
    }
    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswer[a];
        return answer;
    }
}
