public class ValidateUserInput {
    public static String validateUserInput(String input) throws InputException{
        String[] inputFields = input.split(" ");
        if(inputFields.length < 6){
            throw new InputException("недостаточное кол-во данных");
        }
        if(inputFields.length > 6){
            throw new InputException("избыточное кол-во данных");
        }
        for (int i = 0; i < 3; i++) {
            boolean isAllLetters = inputFields[i].chars().allMatch(Character::isLetter);
            if(!isAllLetters) throw new InputException("ФИО");
        }
        boolean isDateValid = inputFields[3].matches("\\d{2}.\\d{2}.\\d{4}");
        if(!isDateValid) throw new InputException("Дата");

        boolean isValidPhone = inputFields[4].chars().allMatch(Character::isDigit);
        if(!isValidPhone) throw new InputException("Номер телефона");

        boolean isValidSex = inputFields[5].equals("f") || inputFields[5].equals("m");
        if(!isValidSex) throw new InputException("Пол");
        return inputFields[0];
    }

}
