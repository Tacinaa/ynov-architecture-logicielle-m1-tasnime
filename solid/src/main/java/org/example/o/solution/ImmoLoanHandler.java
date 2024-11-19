package org.example.o.solution;

public class ImmoLoanHandler extends LoanHandler {

    private Validator validator;


    public ImmoLoanHandler(Validator validator) {
        this.validator = validator;
    }

    @Override
    public void approveLoan(User user) {
        if(validator.isValid(user)) {
            System.out.println("Approved loan");
        }
    }
}
