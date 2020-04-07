package roomreservation

import grails.rest.Resource
import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class PersonSpec extends Specification implements DomainUnitTest<Person> {

//    def setup() {
//    }
//
//    def cleanup() {
//    }

    void "First name can NEITHER be null NOR blank"() {
        expect:
        domain != null
        when:
        domain.firstName = null
        then:
        !domain.validate(['firstName'])
        domain.errors['firstName'].code == 'nullable'
    }
}
