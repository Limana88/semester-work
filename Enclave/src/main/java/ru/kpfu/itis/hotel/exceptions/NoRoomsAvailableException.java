package ru.kpfu.itis.hotel.exceptions;

public class NoRoomsAvailableException extends HotelApplicationException {
    public static final String DEFAULT_MESSAGE = "No Rooms Available Exception";

    public NoRoomsAvailableException() {
        super(DEFAULT_MESSAGE);
    }

    public NoRoomsAvailableException(String message) {
        super(message);
    }
}
