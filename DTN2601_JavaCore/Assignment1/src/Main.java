import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Department department1 = new Department();
        Department department2 = new Department();
        Department department3 = new Department();

        //thêm dũ liệu cho department1
        department1.departmentID = 1;
        department1.departmentName = "IT_Nihonggo";

        Position position1 = new Position();
        Position position2 = new Position();
        Position position3 = new Position();

        //thêm dũ liệu cho position1
        position1.positionID = 1;
        position1.positionName = Position.PositionName.PM;

        Account account1 = new Account();
        Account acount2 = new Account();
        Account acount3 = new Account();

        //thêm dũ liệu cho account1
        account1.accountID = 1;
        account1.email = "duyen@gmail.com";
        account1.username = "Tua";
        account1.fullName = "Thảo Duyên";
        account1.department = department1;
        account1.position = position1;
        account1.position.positionName = position1.positionName;

        Group group1 = new Group();
        Group group2 = new Group();
        Group group3 = new Group();

        //thêm dữ liệu cho group1
        group1.groupName = "Dự án nghìn tỷ";
        group1.groupId = 1;
        group1.createDate = LocalDate.now();
        group1.creator = account1;


        GroupAccount groupAcount1 = new GroupAccount();
        GroupAccount groupAcount2 = new GroupAccount();
        GroupAccount groupAcount3 = new GroupAccount();

        //thêm dữ liệu cho groupAcount1
        groupAcount1.group = group1;

        TypeQuestion typeQuestion1 = new TypeQuestion();
        TypeQuestion typeQuestion2 = new TypeQuestion();
        TypeQuestion typeQuestion3 = new TypeQuestion();

        typeQuestion1.typeID = 1;
        typeQuestion1.typeName = TypeQuestion.TypeName.MULTIPLE_CHOICE;


        CategoryQuestion categoryQuestion1 = new CategoryQuestion();
        CategoryQuestion categoryQuestion2 = new CategoryQuestion();
        CategoryQuestion categoryQuestion3 = new CategoryQuestion();

        categoryQuestion1.categoryName = "JavaBE";


        Question question1 = new Question();
        Question question2 = new Question();
        Question question3 = new Question();
        question1.questionID = 1;
        question1.category = categoryQuestion1;
        question1.type = typeQuestion1;


        Answer answer1 = new Answer();
        Answer answer2 = new Answer();
        Answer answer3 = new Answer();

        answer1.answerID = 1;
        answer1.question = question1;
        answer1.isCorrect = false;
       // extracted(answer1);

        Exam exam1 = new Exam();
        Exam exam2 = new Exam();
        Exam exam3 = new Exam();

        exam1.title = "Thi kết thúc học phần JavaCore!";


        ExamQuestion examQuestion1 = new ExamQuestion();
        ExamQuestion examQuestion2 = new ExamQuestion();
        examQuestion1.exam =  exam1;
        examQuestion1.quesion = question1;

        Exercise1 exercise1 = new Exercise1();
        exercise1.question1(account1);

    }



    private static void extracted(Answer answer1) {
        if (answer1.isCorrect == false){
            System.out.println("Đây là câu trả lời sai!");
        }
        else
            System.out.println("Đây là câu trả lời đúng!");
    }
}