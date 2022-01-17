package Homework_3;

import java.util.*;

public class Phonebook {
    private Map<String, List<String>> phonebook = new HashMap<>();
    private List<String> phoneNumber;

    public void add(String surname, String phone){
        if(phonebook.containsKey(surname)){
            phoneNumber = phonebook.get(surname);
            phoneNumber.add(phone);
            phonebook.put(surname, phoneNumber);
        }else{
            phoneNumber = new ArrayList<>();
            phoneNumber.add(phone);
            phonebook.put(surname, phoneNumber);
        }
    }
    public List<String> get(String surname){
        return phonebook.get(surname);
    }
}
