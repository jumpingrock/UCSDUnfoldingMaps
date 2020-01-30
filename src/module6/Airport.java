package module6;

import java.util.Collections;
import java.util.Comparator;

public class Airport implements Comparable<Airport>  {
    private String city;
    private String country;
    private String code3;

    public String getCity() {
        return city;
    }

    public int compareTo(Airport o) {
        return this.getCity().compareTo(o.getCity());
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCode3() {
        return code3;
    }

    public void setCode3(String code3) {
        this.code3 = code3;
    }

    public static String findAirportCode (String toFind, Airport[] airports) {
        for (Airport airport : airports) {
            if(toFind.equals(airport.getCity())) {
                return airport.getCode3();
            }
        }

        return null;
    }
    public static String findAirportCodeBinary (String toFind, Airport[] airports) {
        int high = airports.length;
        int low = 0;
        int mid;

        // compareTo return -1 if toFind variable is smaller than airports[mid].getCity()
        // compareTo return 0 if toFind is equal to airports[mid].getCity()
        // compareTo return 1 if toFind is bigger than airports[mid].getCity()

        while (low <= high) {
//            mid = (low + high)/2;
            mid = low + ((high - low)/2);
            int compare = toFind.compareTo(airports[mid].getCity());
            if (compare < 0) {
                high = mid-1;
            } else if (compare > 0) {
                low = mid+1;
            }else {
                return airports[mid].getCode3();
            }
        }
        return null;
    }

    public static void insertionSort (int[] vals) {

//        Collections.sort(vals);
        int currInd;
        for (int pos=1; pos<vals.length; pos++) {
            currInd = pos;
            while (currInd > 0 && vals[currInd] < vals[currInd-1]){
                vals = swap(vals, currInd, currInd-1);
                currInd -=1;
            }
        }
    }
    public static void selectionSort (int[] vals) {
        int indexMin;
        boolean shuffle = false;
        for (int i=0; i<vals.length-1; i++) {
            indexMin = i;
            for (int j=i+1; j<vals.length; j++) {
                if(vals[j] < vals[indexMin]) {
                    indexMin = j;
                    shuffle = true;
                }
            }
            if (shuffle) {
                vals = swap(vals, indexMin, i);
                shuffle = false;
            }

        }
    }

    public static int[] swap(int[] vals, int indexMin, int i){
        int temp = vals[i];
        vals[i] = vals[indexMin];
        vals[indexMin] = temp;
        return vals;
    }

}




