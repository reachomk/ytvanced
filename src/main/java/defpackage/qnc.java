package defpackage;

/* renamed from: qnc */
public enum qnc implements rfd {
    UNKNOWN_PRIORITY(0),
    LOW(1),
    MEDIUM(2),
    HIGH(3);
    
    public final int a;

    public final int a() {
        return this.a;
    }

    public static qnc a(int i) {
        if (i == 0) {
            return UNKNOWN_PRIORITY;
        }
        if (i == 1) {
            return LOW;
        }
        if (i != 2) {
            return i != 3 ? null : HIGH;
        } else {
            return MEDIUM;
        }
    }

    private qnc(int i) {
        this.a = i;
    }

    static {
        qnb qnb = new qnb();
    }
}
