package service;

import model.Dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryServiceImpl {
    private static Map<Integer, Dictionary> dictionaries = new HashMap<>();

    static {
        dictionaries.put(1, new Dictionary("Hello", "Xin chào"));
        dictionaries.put(2, new Dictionary("Bye", "Tạm biệt"));
        dictionaries.put(3, new Dictionary("Say", "Nói"));
        dictionaries.put(4, new Dictionary("Program", "Chương trình"));
        dictionaries.put(5, new Dictionary("Developer", "Lập trình viên"));
        dictionaries.put(6, new Dictionary("Language", "Ngôn ngữ"));
        dictionaries.put(7, new Dictionary("Money", "Tiền"));
        dictionaries.put(8, new Dictionary("How", "Thế nào"));
    }

    public List<Dictionary> findAll() {
        return new ArrayList<>(dictionaries.values());
    }
}
