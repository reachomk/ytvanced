package defpackage;

/* renamed from: avae */
public enum avae implements anxv {
    MOBILE_CONNECTION_TYPE_UNKNOWN(0),
    MOBILE_CONNECTION_TYPE_OTHER(1),
    MOBILE_CONNECTION_TYPE_OFFLINE(2),
    MOBILE_CONNECTION_TYPE_WIFI(3),
    MOBILE_CONNECTION_TYPE_CELLULAR_2G(4),
    MOBILE_CONNECTION_TYPE_CELLULAR_3G(5),
    MOBILE_CONNECTION_TYPE_CELLULAR_4G(6),
    MOBILE_CONNECTION_TYPE_CELLULAR_UNKNOWN(7);
    
    public final int b;

    public final int getNumber() {
        return this.b;
    }

    public static avae a(int i) {
        switch (i) {
            case 0:
                return MOBILE_CONNECTION_TYPE_UNKNOWN;
            case 1:
                return MOBILE_CONNECTION_TYPE_OTHER;
            case 2:
                return MOBILE_CONNECTION_TYPE_OFFLINE;
            case 3:
                return MOBILE_CONNECTION_TYPE_WIFI;
            case 4:
                return MOBILE_CONNECTION_TYPE_CELLULAR_2G;
            case 5:
                return MOBILE_CONNECTION_TYPE_CELLULAR_3G;
            case 6:
                return MOBILE_CONNECTION_TYPE_CELLULAR_4G;
            case 7:
                return MOBILE_CONNECTION_TYPE_CELLULAR_UNKNOWN;
            default:
                return null;
        }
    }

    public static anxx a() {
        return avah.a;
    }

    private avae(int i) {
        this.b = i;
    }

    public final String toString() {
        return Integer.toString(this.b);
    }
}
