package ePack;

class Employee {
    private int bal_EmployeeLeaves;

    public Employee(int initialLeaves) {
        this.bal_EmployeeLeaves = initialLeaves;
    }

    public int getRequestForLeave() {
        if (bal_EmployeeLeaves > 0) {
            bal_EmployeeLeaves--;
            return 1; // Leave requested
        } else {
            return 0; // No leave balance
        }
    }

    public int getBal_EmployeeLeaves() {
        return bal_EmployeeLeaves;
    }
}




