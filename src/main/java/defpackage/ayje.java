package defpackage;

/* renamed from: ayje */
public final class ayje extends anxl implements anzf {
    public static final ayje e;
    private static volatile anzq g;
    public int a;
    public arml b;
    public String c = "";
    public arml d;
    private byte f = (byte) 2;

    private ayje() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001Љ\u0000\u0002\b\u0001\u0003Љ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new ayje();
            case 4:
                return new ayjg();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (ayje.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ayje ayje = new ayje();
        e = ayje;
        anxl.registerDefaultInstance(ayje.class, ayje);
    }
}
