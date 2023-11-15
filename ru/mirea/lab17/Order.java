package ru.mirea.lab17;

public class Order {
    private String clientFullName;
    private String clientINN;

    public void setClientINN(String number) throws INNIsNotCorrectException {
        if (isINNCorrect(number)) {
            clientINN = number;
        }

        else {
            throw new INNIsNotCorrectException("The INN must consist of 12 characters. Cannot start from 0.");
        }
    }

    public void setClientFullName(String fullname) throws FullnameIsNotCorrectException {
        if (isFullnameCorrect(fullname)) {
            clientFullName = fullname;
        }

        else {
            throw new FullnameIsNotCorrectException("The full name must consist of three parts. Only letters are allowed.");
        }
    }

    private boolean isINNCorrect(String number) {
        if (number.length() != 12 || number.charAt(0) == '0')
            return false;

        for (char ch: number.toCharArray()) {
            if (!Character.isDigit(ch))
                return false;
        }

        return true;
    }

    private boolean isFullnameCorrect(String fullname) {
        if (fullname.isEmpty()) return false;

        String[] names = fullname.split(" ");
        if (names.length != 3) return false;

        for (String name: names) {
            for (char ch: name.toCharArray()) {
                if (!Character.isAlphabetic(ch)) return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        return "Order{" +
                "clientFullName='" + clientFullName + '\'' +
                ", clientINN='" + clientINN + '\'' +
                '}';
    }
}
