package ru.kpfu.itis.hotel.exceptions;

public class DuplicateEntryException extends HotelApplicationException {

    public static final String DEFAULT_MESSAGE = "Duplicate Entry Exception";

    public DuplicateEntryException() {
        super(DEFAULT_MESSAGE);
    }

    public DuplicateEntryException(String message) {
        super(message);
    }
}
