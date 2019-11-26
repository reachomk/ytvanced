package defpackage;

/* renamed from: aqju */
public final class aqju extends anxl implements anzf {
    public static final aqju g;
    private static volatile anzq i;
    public int a;
    public arml b;
    public aygk c;
    public String d;
    public String e;
    public anvu f;
    private byte h = (byte) 2;

    private aqju() {
        String str = "";
        this.d = str;
        this.e = str;
        this.f = anvu.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.h = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0002\u0001Љ\u0000\u0002Љ\u0001\u0003\b\u0002\u0006\n\u0005\u0007\b\u0003", new Object[]{"a", "b", "c", "d", "f", "e"});
            case 3:
                return new aqju();
            case 4:
                return new aqjt();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (aqju.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqju aqju = new aqju();
        g = aqju;
        anxl.registerDefaultInstance(aqju.class, aqju);
    }
}
