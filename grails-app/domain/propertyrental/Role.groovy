package propertyrental

class Role {
    static belongsTo = [user: User]
    String type

    static constraints = {
        type inList: ['Landlord', 'Tenant', 'Admin']
    }
}
