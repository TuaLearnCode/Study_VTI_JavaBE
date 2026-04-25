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
        System.out.println("Phòng ban với ID = " + department1.departmentID
        + " có tên là " + department1.departmentName + "! ");

        Position position1 = new Position();
        Position position2 = new Position();
        Position position3 = new Position();

        //thêm dũ liệu cho position1
        position1.positionID = 1;
        position1.positionName = Position.PositionName.PM;
        System.out.println("Vị trí " + position1.positionName + " mà ai cũng muốn ngồi! ");

        Account acount1 = new Account();
        Account acount2 = new Account();
        Account acount3 = new Account();

        //thêm dũ liệu cho acount1
        acount1.accountID = 1;
        acount1.email = "duyen@gmail.com";
        acount1.username = "Tua";
        acount1.fullName = "Thảo Duyên";
        acount1.department = department1;
        acount1.position = position1;
        acount1.position.positionName = position1.positionName;
        System.out.println("Tài khoản với ID = " + acount1.accountID + " là của "
        + acount1.username + " thuộc phòng " + acount1.department.departmentName
        + " và đang là " + acount1.position.positionName);

        Group group1 = new Group();
        Group group2 = new Group();
        Group group3 = new Group();

        //thêm dữ liệu cho group1
        group1.groupName = "Dự án nghìn tỷ";
        group1.groupId = 1;
        group1.createDate = LocalDate.now();
        group1.creator = acount1;
        System.out.println(group1.groupName + " được tạo vào lúc " + group1.createDate
        + " bởi " + group1.creator.username);


        GroupAccount groupAcount1 = new GroupAccount();
        GroupAccount groupAcount2 = new GroupAccount();
        GroupAccount groupAcount3 = new GroupAccount();

        //thêm dữ liệu cho groupAcount1
        groupAcount1.group = group1;
        System.out.println(groupAcount1.group.groupName);

        TypeQuestion typeQuestion1 = new TypeQuestion();
        TypeQuestion typeQuestion2 = new TypeQuestion();
        TypeQuestion typeQuestion3 = new TypeQuestion();

        typeQuestion1.typeID = 1;
        typeQuestion1.typeName = TypeQuestion.TypeName.MULTIPLE_CHOICE;
        System.out.println("Loại câu hỏi: " + typeQuestion1.typeName);

        CategoryQuestion categoryQuestion1 = new CategoryQuestion();
        CategoryQuestion categoryQuestion2 = new CategoryQuestion();
        CategoryQuestion categoryQuestion3 = new CategoryQuestion();

        categoryQuestion1.categoryName = "JavaBE";
        System.out.println(categoryQuestion1.categoryName);

        Question question1 = new Question();
        Question question2 = new Question();
        Question question3 = new Question();
        question1.questionID = 1;
        question1.category = categoryQuestion1;
        question1.type = typeQuestion1;
        System.out.println("Câu hỏi " + question1.questionID
        + " thuộc lĩnh vực " + question1.category.categoryName
        + " là câu hỏi " + question1.type.typeName + "!");

        Answer answer1 = new Answer();
        Answer answer2 = new Answer();
        Answer answer3 = new Answer();

        answer1.answerID = 1;
        answer1.question = question1;
        answer1.isCorrect = false;
        extracted(answer1);

        Exam exam1 = new Exam();
        Exam exam2 = new Exam();
        Exam exam3 = new Exam();

        exam1.title = "Thi kết thúc học phần JavaCore!";
        System.out.println(exam1.title);

        ExamQuestion examQuestion1 = new ExamQuestion();
        ExamQuestion examQuestion2 = new ExamQuestion();
        examQuestion1.exam =  exam1;
        examQuestion1.quesion = question1;
        System.out.println(exam1.title + " gồm các câu hỏi thuộc lĩnh vực "
        + examQuestion1.quesion.category.categoryName);

    }

    private static void extracted(Answer answer1) {
        if (answer1.isCorrect == false){
            System.out.println("Đây là câu trả lời sai!");
        }
        else
            System.out.println("Đây là câu trả lời đúng!");
    }
}