import java.util.*;


public class test {
    private Map<String, Set<String>> synonymsDatabase;
    
    public static void main(String[] args) {
        HashMap<String, HashSet<String>> synonymsDatabase = new HashMap<>();
        synonymsDatabase.put("mengambil", new HashSet<>(Arrays.asList("mengganti", "mendapatkan", "menerima")));
        synonymsDatabase.put("pengguna", new HashSet<>(Arrays.asList("pemakai", "user", "orang")));
        synonymsDatabase.put("sedih", new HashSet<>(Arrays.asList("malu", "kecewa", "berduka")));
        synonymsDatabase.put("mengambil", new HashSet<>(Arrays.asList("mengganti", "mendapatkan", "menerima")));
        synonymsDatabase.put("pengguna", new HashSet<>(Arrays.asList("pemakai", "user", "orang")));
        synonymsDatabase.put("memilah", new HashSet<>(Arrays.asList("memisah", "membagi", "memiak")));
        synonymsDatabase.put("polusi", new HashSet<>(Arrays.asList("pencemaran", "pengkotoran")));
        synonymsDatabase.put("prediksi", new HashSet<>(Arrays.asList("ramalan", "ditandangkan", "menandang")));
        synonymsDatabase.put("relevan", new HashSet<>(Arrays.asList("sesuai", "saling kaik", "bersangkutan dengan", "berguna")));
        synonymsDatabase.put("respon", new HashSet<>(Arrays.asList("tanggapan", "jawaban")));
        synonymsDatabase.put("revisi", new HashSet<>(Arrays.asList("memperbaiki", "membarui")));
        synonymsDatabase.put("seleksi", new HashSet<>(Arrays.asList("menyaring", "memilah", "menapis")));
        synonymsDatabase.put("donasi", new HashSet<>(Arrays.asList("bantuan")));
        synonymsDatabase.put("diskusi", new HashSet<>(Arrays.asList("obrolan", "pembahasan")));

        String test = "memilah prediksi revisi";
        List<String> temp = new ArrayList<>();

        String[] words = test.split(" ");
        for (String word : words) {
            for (Map.Entry<String, HashSet<String>> entry : synonymsDatabase.entrySet()) {
                if (entry.getKey().equals(word)) {
                    temp.addAll(entry.getValue());
                    break;
                }
            }
        }
        String kata = "saya membagi dua ramalan";
        
        String[] kataArr = kata.split(" ");
        int count = 0;
        for (String word : kataArr) {
            if (temp.contains(word)) {
                count++;
            }
        }
        double presentase = (double)count / kataArr.length*100;
        

        System.out.println(temp);
        System.out.println(count);
        System.out.println(kataArr.length);
        System.out.println(presentase);
    }
    
    double testPlagiasi(String word1,String word2){
        HashMap<String, HashSet<String>> synonymsDatabase = new HashMap<>();
        synonymsDatabase.put("mengambil", new HashSet<>(Arrays.asList("mengganti", "mendapatkan", "menerima")));
        synonymsDatabase.put("pengguna", new HashSet<>(Arrays.asList("pemakai", "user", "orang")));
        synonymsDatabase.put("sedih", new HashSet<>(Arrays.asList("malu", "kecewa", "berduka")));
        synonymsDatabase.put("mengambil", new HashSet<>(Arrays.asList("mengganti", "mendapatkan", "menerima")));
        synonymsDatabase.put("pengguna", new HashSet<>(Arrays.asList("pemakai", "user", "orang")));
        synonymsDatabase.put("memilah", new HashSet<>(Arrays.asList("memisah", "membagi", "memiak")));
        synonymsDatabase.put("polusi", new HashSet<>(Arrays.asList("pencemaran", "pengkotoran")));
        synonymsDatabase.put("prediksi", new HashSet<>(Arrays.asList("ramalan", "ditandangkan", "menandang")));
        synonymsDatabase.put("relevan", new HashSet<>(Arrays.asList("sesuai", "saling kaik", "bersangkutan dengan", "berguna")));
        synonymsDatabase.put("respon", new HashSet<>(Arrays.asList("tanggapan", "jawaban")));
        synonymsDatabase.put("revisi", new HashSet<>(Arrays.asList("memperbaiki", "membarui")));
        synonymsDatabase.put("seleksi", new HashSet<>(Arrays.asList("menyaring", "memilah", "menapis")));
        synonymsDatabase.put("donasi", new HashSet<>(Arrays.asList("bantuan")));
        synonymsDatabase.put("diskusi", new HashSet<>(Arrays.asList("obrolan", "pembahasan")));

        String test = word1;
        List<String> temp = new ArrayList<>();

        String[] words = test.split(" ");
        for (String word : words) {
            for (Map.Entry<String, HashSet<String>> entry : synonymsDatabase.entrySet()) {
                if (entry.getKey().equals(word)) {
                    temp.addAll(entry.getValue());
                    break;
                }
            }
        }
        String kata = word2;
        
        String[] kataArr = kata.split(" ");
        int count = 0;
        for (String word : kataArr) {
            if (temp.contains(word)) {
                count++;
            }
        }
        double presentase = (double)count / kataArr.length*100;
        

        System.out.println(temp);
        System.out.println(count);
        System.out.println(kataArr.length);
        System.out.println(presentase);
        
        return presentase;
    }
}
