package ePack;

class Manager {
    public int checkLeaves(int bal_EmployeeLeaves, int max_Leaves) {
        if (bal_EmployeeLeaves >= max_Leaves) {
            return 1; // Sufficient leaves
        } else {
            return 0; // Insufficient leaves
        }
    }
}
