package app.model;

public class User {
    private Integer id;
    private String nombre;
    private String userName;
    private String email;
    private String direccion;
    private String telefono;
    private String rol;
    private String password;

    public User(){}
    
    @Override
    public String toString() {
        return "User [id=" + id + ", nombre=" + nombre + ", userName=" + userName + ", email=" + email + ", direccion="
                + direccion + ", telefono=" + telefono + ", rol=" + rol + ", password=" + password + "]";
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Integer getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getUserName() {
        return userName;
    }
    public String getEmail() {
        return email;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getRol() {
        return rol;
    }
    public String getPassword() {
        return password;
    }

    
}
