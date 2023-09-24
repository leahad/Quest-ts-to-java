import java.time.LocalDate;

public class User {
    private LocalDate birthdate;
    private int size;
    private Photo[] photos;
    private Address address;
    
    public User(LocalDate birthdate, int size, Photo[] photos, Address address) {
        this.birthdate = birthdate;
        this.size = size;
        this.photos = photos;
        this.address = address;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setPhotos(Photo[] photos) {
        this.photos = photos;
    }

    public Photo[] getPhotos() {
        return photos;
    }

    public void setAddresses(Address address) {
        this.address = address;
    }

    public Address getAddresses() {
        return address;
    }
}