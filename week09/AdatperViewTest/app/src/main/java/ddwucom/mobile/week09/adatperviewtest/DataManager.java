package ddwucom.mobile.week09.adatperviewtest;

import java.util.ArrayList;

public class DataManager {
    private ArrayList<String> subjectList;

    public DataManager() {
        subjectList = new ArrayList();
        subjectList.add("모바일소프트웨어");
        subjectList.add("네트워크");
        subjectList.add("웹서비스");
        subjectList.add("운영체제");
        subjectList.add("웹프로그래밍2");
    }

    public ArrayList<String> getSubjectList() {
        return subjectList;
    }

    // 값 반환
    public String getDataByPos(int pos) { return subjectList.get(pos); }

    // 수정
    public void updateSubject(int pos, String subject) {
        subjectList.set(pos, subject);
    }

    // 추가
    public void addSubject(String subject) {
        subjectList.add(subject);
    }

    // 삭제
    public void removeSubject(int pos) {
        subjectList.remove(pos);
    }

}
