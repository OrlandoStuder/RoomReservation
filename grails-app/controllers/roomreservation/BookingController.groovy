package roomreservation

class BookingController {

    static scaffold = Booking

    // Todo: Task from Lectures 7 (Create an action that displays all bookings of a given person)
    def bookingsForOrlando() {
        Person orlando = Person.findByEmail("orlando.studer@students.fhnw.ch")
        List<Booking> result = Booking.findAllByBooker(orlando)

        // Ausführen der View
        render view: "OpenBookingsForOrlando", model: [bookings: result]
    }

    def all() {
        respond Booking.list()
    }



}
