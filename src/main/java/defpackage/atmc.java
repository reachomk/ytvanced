package defpackage;

/* renamed from: atmc */
public enum atmc implements anxv {
    UPLOAD_CONNECTION_TYPE_UNKNOWN(0),
    UPLOAD_CONNECTION_TYPE_WIFI(1),
    UPLOAD_CONNECTION_TYPE_CELLULAR_GPRS(2),
    UPLOAD_CONNECTION_TYPE_CELLULAR_EDGE(3),
    UPLOAD_CONNECTION_TYPE_CELLULAR_UMTS(4),
    UPLOAD_CONNECTION_TYPE_CELLULAR_CDMA(5),
    UPLOAD_CONNECTION_TYPE_CELLULAR_EVDO_0(6),
    UPLOAD_CONNECTION_TYPE_CELLULAR_EVDO_A(7),
    UPLOAD_CONNECTION_TYPE_CELLULAR_1XRTT(8),
    UPLOAD_CONNECTION_TYPE_CELLULAR_HSDPA(9),
    UPLOAD_CONNECTION_TYPE_CELLULAR_HSUPA(10),
    UPLOAD_CONNECTION_TYPE_CELLULAR_HSPA(11),
    UPLOAD_CONNECTION_TYPE_CELLULAR_IDEN(12),
    UPLOAD_CONNECTION_TYPE_CELLULAR_EVDO_B(13),
    UPLOAD_CONNECTION_TYPE_CELLULAR_LTE(14),
    UPLOAD_CONNECTION_TYPE_CELLULAR_EHRPD(15),
    UPLOAD_CONNECTION_TYPE_CELLULAR_HSPAP(16),
    UPLOAD_CONNECTION_TYPE_WIMAX(17),
    UPLOAD_CONNECTION_TYPE_ETHERNET(18),
    UPLOAD_CONNECTION_TYPE_BLUETOOTH(19);
    
    private final int u;

    public final int getNumber() {
        return this.u;
    }

    public static atmc a(int i) {
        switch (i) {
            case 0:
                return UPLOAD_CONNECTION_TYPE_UNKNOWN;
            case 1:
                return UPLOAD_CONNECTION_TYPE_WIFI;
            case 2:
                return UPLOAD_CONNECTION_TYPE_CELLULAR_GPRS;
            case 3:
                return UPLOAD_CONNECTION_TYPE_CELLULAR_EDGE;
            case 4:
                return UPLOAD_CONNECTION_TYPE_CELLULAR_UMTS;
            case 5:
                return UPLOAD_CONNECTION_TYPE_CELLULAR_CDMA;
            case 6:
                return UPLOAD_CONNECTION_TYPE_CELLULAR_EVDO_0;
            case 7:
                return UPLOAD_CONNECTION_TYPE_CELLULAR_EVDO_A;
            case 8:
                return UPLOAD_CONNECTION_TYPE_CELLULAR_1XRTT;
            case 9:
                return UPLOAD_CONNECTION_TYPE_CELLULAR_HSDPA;
            case 10:
                return UPLOAD_CONNECTION_TYPE_CELLULAR_HSUPA;
            case 11:
                return UPLOAD_CONNECTION_TYPE_CELLULAR_HSPA;
            case 12:
                return UPLOAD_CONNECTION_TYPE_CELLULAR_IDEN;
            case 13:
                return UPLOAD_CONNECTION_TYPE_CELLULAR_EVDO_B;
            case 14:
                return UPLOAD_CONNECTION_TYPE_CELLULAR_LTE;
            case 15:
                return UPLOAD_CONNECTION_TYPE_CELLULAR_EHRPD;
            case 16:
                return UPLOAD_CONNECTION_TYPE_CELLULAR_HSPAP;
            case 17:
                return UPLOAD_CONNECTION_TYPE_WIMAX;
            case 18:
                return UPLOAD_CONNECTION_TYPE_ETHERNET;
            case 19:
                return UPLOAD_CONNECTION_TYPE_BLUETOOTH;
            default:
                return null;
        }
    }

    public static anxx a() {
        return atmb.a;
    }

    private atmc(int i) {
        this.u = i;
    }

    public final String toString() {
        return Integer.toString(this.u);
    }
}
