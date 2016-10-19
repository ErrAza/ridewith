package za.co.ridewith.ridewith;

/**
 * Created by erra_ on 10/19/2016.
 */

public class Ride
{
    private String _destination;
    private String _driverName;
    private boolean _isVerified;
    private int _seatsAvailable;

    public Ride(String destination, String driverName, boolean verified, int availableSeats)
    {
        _destination = destination;
        _driverName = driverName;
        _isVerified = verified;
        _seatsAvailable = availableSeats;
    }

    public String GetDestination() {
        return _destination;
    }

    public void SetDestination(String _destination) {
        this._destination = _destination;
    }

    public String GetDriverName() {
        return _driverName;
    }

    public void SetDriverName(String _driverName) {
        this._driverName = _driverName;
    }

    public boolean IsVerified() {
        return _isVerified;
    }

    public void Verify() {
        _isVerified = true;
    }

    public void Unverify()
    {
        _isVerified = false;
    }

    public int GetSeatsAvailable() {
        return _seatsAvailable;
    }

    public void SetSeatsAvailable(int _seatsAvailable) {
        this._seatsAvailable = _seatsAvailable;
    }
}
