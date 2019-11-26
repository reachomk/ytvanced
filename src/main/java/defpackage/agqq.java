package defpackage;

/* renamed from: agqq */
public enum agqq {
    OFFLINE_IMMEDIATELY(0),
    DEFER_FOR_DISCOUNTED_DATA(1),
    OFFLINE_SHARING(2),
    SIDELOAD(3),
    AUTO_OFFLINE(4);
    
    private static final amur g = null;
    public final int c;

    private agqq(int i) {
        this.c = i;
    }

    public static agqq a(int i) {
        return (agqq) g.get(Integer.valueOf(i));
    }

    static {
        amuu e = amur.e();
        agqq[] values = agqq.values();
        int length = values.length;
        int i;
        while (i < length) {
            agqq agqq = values[i];
            e.b(Integer.valueOf(agqq.c), agqq);
            i++;
        }
        g = e.b();
    }

    public final int a() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return 2;
        }
        if (ordinal == 1) {
            return 3;
        }
        if (ordinal == 2) {
            return 4;
        }
        if (ordinal != 3) {
            return ordinal != 4 ? 1 : 6;
        } else {
            return 5;
        }
    }
}
