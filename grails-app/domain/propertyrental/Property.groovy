package propertyrental

class Property {
    static belongsTo = [user: User]

    String location
    Integer rentalPrice
    String additional_information

    static constraints = {
        location nullable: false
        rentalPrice nullable: false
        additional_information nullable: true
    }
}
