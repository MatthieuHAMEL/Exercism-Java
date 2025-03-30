import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public class DialingCodes {

    private Map<Integer, String> codes;

    DialingCodes() {
        this.codes = new HashMap<>();
    }

    public Map<Integer, String> getCodes() {
        return this.codes;
    }

    public void setDialingCode(Integer code, String country) {
        this.codes.put(code, country);
    }

    public String getCountry(Integer code) {
        return this.codes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (!this.codes.containsKey(code) && !this.codes.containsValue(country)) {
            this.codes.put(code, country);
        }
    }

    // Assuming the country is not found several times in the map ; 
    // If it is so, we return the first key that matches ...
    public Integer findDialingCode(String country) {
        for (var entry : this.codes.entrySet()) {
            if (country.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        var i = this.findDialingCode(country);
        if (i != null) {
            this.codes.remove(i);
            this.codes.put(code, country);
        }
    }
}
