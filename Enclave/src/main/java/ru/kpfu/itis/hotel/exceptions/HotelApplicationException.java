package ru.kpfu.itis.hotel.exceptions;

public class HotelApplicationException extends RuntimeException {
    public HotelApplicationException(String message) {
        super(message);
    }
}
