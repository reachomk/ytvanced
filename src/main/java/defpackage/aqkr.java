package defpackage;

/* renamed from: aqkr */
public enum aqkr implements anxv {
    CONTACT_STATE_UNKNOWN(0),
    CONTACT_STATE_CONNECTED(1),
    CONTACT_STATE_UNCONNECTED(2),
    CONTACT_STATE_INVITE_SENT(3),
    CONTACT_STATE_INVITE_RECEIVED(4),
    CONTACT_STATE_BLOCKED(5),
    CONTACT_STATE_BLOCKER(7),
    CONTACT_STATE_INVITE_HIDDEN(6);
    
    private final int i;

    public final int getNumber() {
        return this.i;
    }

    public static aqkr a(int i) {
        switch (i) {
            case 0:
                return CONTACT_STATE_UNKNOWN;
            case 1:
                return CONTACT_STATE_CONNECTED;
            case 2:
                return CONTACT_STATE_UNCONNECTED;
            case 3:
                return CONTACT_STATE_INVITE_SENT;
            case 4:
                return CONTACT_STATE_INVITE_RECEIVED;
            case 5:
                return CONTACT_STATE_BLOCKED;
            case 6:
                return CONTACT_STATE_INVITE_HIDDEN;
            case 7:
                return CONTACT_STATE_BLOCKER;
            default:
                return null;
        }
    }

    public static anxx a() {
        return aqkq.a;
    }

    private aqkr(int i) {
        this.i = i;
    }

    public final String toString() {
        return Integer.toString(this.i);
    }
}
