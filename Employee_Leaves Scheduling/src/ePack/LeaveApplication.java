package ePack;

public class LeaveApplication {
    public static void main(String[] args) {
        Employee emp = new Employee(9); // Initial leave balance
        Manager mgr = new Manager();
        Boss boss = new Boss();

        int totalRequests = 8; // Number of leave requests

        for (int i = 0; i < totalRequests; i++) {
            boss.processLeaveRequest(emp, mgr);
        }
    }
}