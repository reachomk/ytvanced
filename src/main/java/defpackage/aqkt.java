package defpackage;

/* renamed from: aqkt */
public enum aqkt implements anxv {
    CONTACT_STATUS_UNKNOWN(0),
    CONTACT_STATUS_CONNECTED(1),
    CONTACT_STATUS_UNCONNECTED(2),
    CONTACT_STATUS_INVITE_SENT(3),
    CONTACT_STATUS_INVITE_RECEIVED(4),
    CONTACT_STATUS_BLOCKED(5),
    CONTACT_STATUS_BLOCKER(7),
    CONTACT_STATUS_INVITE_HIDDEN(6);
    
    private final int i;

    public final int getNumber() {
        return this.i;
    }

    public static aqkt a(int i) {
        switch (i) {
            case 0:
                return CONTACT_STATUS_UNKNOWN;
            case 1:
                return CONTACT_STATUS_CONNECTED;
            case 2:
                return CONTACT_STATUS_UNCONNECTED;
            case 3:
                return CONTACT_STATUS_INVITE_SENT;
            case 4:
                return CONTACT_STATUS_INVITE_RECEIVED;
            case 5:
                return CONTACT_STATUS_BLOCKED;
            case 6:
                return CONTACT_STATUS_INVITE_HIDDEN;
            case 7:
                return CONTACT_STATUS_BLOCKER;
            default:
                return null;
        }
    }

    public static anxx a() {
        return aqks.a;
    }

    private aqkt(int i) {
        this.i = i;
    }

    public final String toString() {
        return Integer.toString(this.i);
    }
}
