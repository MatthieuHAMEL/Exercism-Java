class Badge {
    public String print(Integer id, String name, String department) {
        String res = (id != null) ? "[" + Integer.toString(id) + "] - " : "";
        res += name + " - " + ((department == null) ? "OWNER" : department.toUpperCase());
        return res;
    }
}
