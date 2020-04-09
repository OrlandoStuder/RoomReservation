package roomreservation

import grails.rest.Resource

@Resource(uri = "/people", superClass = SearchRestfulController)

class Person {

    String firstName
    String lastName
    String email

    // Um Person besser ausgeben zu können
    String toString() {
        return "$firstName  $lastName"
    }



    static constraints = {
        firstName(blank: false, nullable: false)
        lastName(blank: false, nullable: false)
        email(blank: false, email: true)
    }
}
