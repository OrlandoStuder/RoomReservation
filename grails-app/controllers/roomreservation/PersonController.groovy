package roomreservation

import grails.plugin.springsecurity.annotation.Secured

@Secured(Role.ADMIN)
class PersonController {

    static scaffold = Person

}
