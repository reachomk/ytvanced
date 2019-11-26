package defpackage;

/* renamed from: arpk */
public final class arpk extends anxl implements anzf {
    public static final arpk f;
    private static volatile anzq h;
    public int a;
    public aqei b;
    public aqdy c;
    public aqeq d;
    public aqfe e;
    private byte g = (byte) 2;

    private arpk() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001ᠸ⢵\u0004\u0000\u0000\u0004ᠸЉ\u0001ﾾ‶Љ\u0003▻Љ\u0002⢵Љ\u0000", new Object[]{"a", "c", "e", "d", "b"});
            case 3:
                return new arpk();
            case 4:
                return new arpn();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (arpk.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        arpk arpk = new arpk();
        f = arpk;
        anxl.registerDefaultInstance(arpk.class, arpk);
    }
}
