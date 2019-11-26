package defpackage;

/* renamed from: aqyf */
public final class aqyf extends anxl implements anzf {
    public static final aqyf k;
    private static volatile anzq m;
    public int a;
    public int b = 0;
    public Object c;
    public arml d;
    public arml e;
    public String f = "";
    public boolean g;
    public aodv h;
    public axak i;
    public apxu j;
    private byte l = (byte) 2;

    private aqyf() {
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
                return anxl.newMessageInfo(k, "\u0001\t\u0001\u0001\u0001\f\t\u0000\u0000\u0004\u0001Љ\u0000\u0002\b\u0002\u0003\u0007\u0006\u0004\t\u0007\u00067\u0000\u0007;\u0000\bЉ\u0001\nЉ\t\fЉ\u000b", new Object[]{"c", "b", "a", "d", "f", "g", "h", "e", "i", "j"});
            case 3:
                return new aqyf();
            case 4:
                return new aqye();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (aqyf.class) {
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
        aqyf aqyf = new aqyf();
        k = aqyf;
        anxl.registerDefaultInstance(aqyf.class, aqyf);
    }
}
