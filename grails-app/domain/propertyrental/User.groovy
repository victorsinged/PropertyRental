package propertyrental

class User {
    static hasOne = [role: Role, profile: Profile]

    String email
    String password

    static constraints = {
        email blank: false, unique: true
        password size: 8..20, blank: false
    }
}
