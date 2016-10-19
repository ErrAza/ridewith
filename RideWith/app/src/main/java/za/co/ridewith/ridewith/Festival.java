package za.co.ridewith.ridewith;

import android.media.Image;

/**
 * Created by erra_ on 10/19/2016.
 */

public class Festival {

    private String _name;
    private String _address;
    private Image _festivalFlyerImage;

    public Festival(String name, String address)
    {
        _name = name;
        _address = address;
    }

    public String GetName() {
        return _name;
    }

    public void SetName(String _name) {
        this._name = _name;
    }

    public String GetAddress() {
        return _address;
    }

    public void SetAddress(String _address) {
        this._address = _address;
    }

    public Image GetFlyerImage() {
        return _festivalFlyerImage;
    }

    public void SetFlyerImage(Image _festivalFlyerImage) {
        this._festivalFlyerImage = _festivalFlyerImage;
    }
}
