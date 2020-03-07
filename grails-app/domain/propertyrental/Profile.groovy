package propertyrental

class Profile {
    static belongsTo = [user: User]
    String name
    String street
    String neighborhood
    String number
    String additional_details
    String city
    String state
    String nickname
    Integer age

    static constraints = {
        name maxSize: 50, blank: false
        nickname maxSize: 10, nullable: true
        street nullable: false
        age(range: 18..65)
        number nullable: false
        additional_details nullable: false
        city nullable: false
        state nullable: false
    }
}
