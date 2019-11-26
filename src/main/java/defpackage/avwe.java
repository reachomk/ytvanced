package defpackage;

/* renamed from: avwe */
public enum avwe implements anxv {
    INVALID(0),
    ADDRESS_BOOK(1),
    NOTIFICATIONS(2),
    SEND_SMS(3),
    FINE_LOCATION(4),
    GET_ACCOUNTS(5),
    IOS_FINE_LOCATION_WHEN_IN_USE(6),
    IOS_FINE_LOCATION_ALWAYS_ON(7),
    WRITE_EXTERNAL_STORAGE(8),
    READ_MEDIA_AUDIO(9),
    ANDROID_CAMERA(10);
    
    public final int g;

    public final int getNumber() {
        return this.g;
    }

    public static avwe a(int i) {
        switch (i) {
            case 0:
                return INVALID;
            case 1:
                return ADDRESS_BOOK;
            case 2:
                return NOTIFICATIONS;
            case 3:
                return SEND_SMS;
            case 4:
                return FINE_LOCATION;
            case 5:
                return GET_ACCOUNTS;
            case 6:
                return IOS_FINE_LOCATION_WHEN_IN_USE;
            case 7:
                return IOS_FINE_LOCATION_ALWAYS_ON;
            case 8:
                return WRITE_EXTERNAL_STORAGE;
            case 9:
                return READ_MEDIA_AUDIO;
            case 10:
                return ANDROID_CAMERA;
            default:
                return null;
        }
    }

    public static anxx a() {
        return avwd.a;
    }

    private avwe(int i) {
        this.g = i;
    }

    public final String toString() {
        return Integer.toString(this.g);
    }
}
