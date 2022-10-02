package menghitungLuas;

public class luasSegitigadanLingkaran {

    static class Segitiga {
        private int alas;
        private int tinggi;

        public void setAlas(int Alas) {
            this.alas = Alas;
        }

        public void setTinggi(int Tinggi) {
            this.tinggi = Tinggi;
        }

        public double hitungLuas() {

            return 0.5 * this.alas * this.tinggi;
        }
    }

    static class Lingkaran {
        private int jarijari;
        public void setJariJari(int r) {
            this.jarijari = r;
        }

        public double hitungLuas() {
            return Math.PI*jarijari*jarijari;
        }
    }
}
