package org.example.o.solution;

public class PersonalLoanHandler extends LoanHandler {

    private Validator validator;

    public PersonalLoanHandler(Validator validator) {
        this.validator = validator;
    }

    @Override
    public void approveLoan(User user) {
        if(validator.isValid(user)){
            System.out.println("Loan Approved");
        }
    }
}
