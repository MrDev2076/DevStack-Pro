package ePack;


class Boss {
    public void processLeaveRequest(Employee emp, Manager mgr) {
        int requestStatus = emp.getRequestForLeave();

        if (requestStatus == 1) {
            int max_Leaves = 7;
            int managerResult = mgr.checkLeaves(emp.getBal_EmployeeLeaves(), max_Leaves);

            if (managerResult == 1) {
                System.out.println("GRANTED");
            } else {
                System.out.println("REJECTED");
            }
        } else {
            System.out.println("REJECTED");
        }
    }
}

