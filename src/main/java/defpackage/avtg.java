package defpackage;

/* renamed from: avtg */
public final class avtg extends anxl implements anzf {
    public static final avtg k;
    private static volatile anzq m;
    public int a;
    public anvu b = anvu.a;
    public anvu c = anvu.a;
    public long d;
    public avte e;
    public anxz f = anxl.emptyIntList();
    public anxz g = anxl.emptyIntList();
    public boolean h;
    public boolean i;
    public anvu j = anvu.a;
    private byte l = (byte) 2;

    private avtg() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.l = b;
                return null;
            case 2:
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\u0010\t\u0000\u0002\u0001\u0001\n\u0000\u0002\n\u0001\u0003\u0002\u0002\n\u0016\u000b\u0016\fЉ\u0006\u000e\u0007\u000b\u000f\u0007\f\u0010\n\r", new Object[]{"a", "b", "c", "d", "f", "g", "e", "h", "i", "j"});
            case 3:
                return new avtg();
            case 4:
                return new avtj();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (avtg.class) {
                        obj3 = m;
                        if (obj3 == null) {
                            obj3 = new anxn(k);
                            m = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avtg avtg = new avtg();
        k = avtg;
        anxl.registerDefaultInstance(avtg.class, avtg);
    }
}
