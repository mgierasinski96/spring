package mgierasinski.validator;


import mgierasinski.domain.AppUser;
import org.apache.commons.validator.routines.EmailValidator;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class AppUserValidator implements Validator {

    EmailValidator emailValidator= EmailValidator.getInstance();

    @Override
    public boolean supports(Class clazz) {
        return AppUser.class.isAssignableFrom(clazz);
    }




    @Override
    public void validate(Object arg0, Errors errors) {
//        ValidationUtils.rejectIfEmpty(errors,"firstName","error.field.required");
//        ValidationUtils.rejectIfEmpty(errors,"lastName","error.field.required");
//        ValidationUtils.rejectIfEmpty(errors,"email","error.field.required");
//        ValidationUtils.rejectIfEmpty(errors,"telephone","error.field.required");



//        if(errors.getErrorCount()==0)
//        {
//            if(StringUtils.hasText(((AppUser)arg0).getEmail()) && emailValidator.isValid(((AppUser)arg0).getEmail()) == false)
//            errors.rejectValue("email","error.email.invalid");
//
//            if((((AppUser)arg0).getTelephone().matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{3}"))==false)
//            {
//                errors.rejectValue("telephone","error.telephone.invalid");
//            }
//
//            if((((AppUser)arg0).getFirstName().matches("[a-zA-Z]+"))==false)
//            {
//                errors.rejectValue("firstName","error.firstName.invalid");
//            }
//
//
//
//        }
    }
}
