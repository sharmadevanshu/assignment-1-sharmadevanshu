class Fields {

    private String f_name;
    private String s_name;
    private String ph_no;
    private String email_id;

    public String getPh_no() {
        return ph_no;
    }

    public void setPh_no(String ph_no) {
        this.ph_no = ph_no;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    @Override
    public String toString()
    {
        return "f_name = " + f_name + "\n" + "s_name = " + s_name + "\n" + "ph_no = " + ph_no + "\n"
                + "email_id = " + email_id +"\n"+"\n";
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }
}
