package defpackage;

/* renamed from: auol */
public final class auol extends anxl implements anzf {
    public static final auol f;
    private static volatile anzq h;
    public int a;
    public String b = "";
    public arml c;
    public boolean d;
    public int e;
    private byte g = (byte) 2;

    private auol() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001\b\u0000\u0002Љ\u0001\u0003\u0007\u0002\u0004\u0004\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new auol();
            case 4:
                return new auoo();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (auol.class) {
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
        auol auol = new auol();
        f = auol;
        anxl.registerDefaultInstance(auol.class, auol);
    }
}
