package model;

public abstract class Applience {
    private int id;
    private String name;

        public Applience(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String applienceName) {
            this.name = applienceName;
        }
}
