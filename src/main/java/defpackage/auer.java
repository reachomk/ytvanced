package defpackage;

/* renamed from: auer */
public final class auer extends anxl implements anzf {
    public static final auer c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private auer() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.d = b;
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0002\u0001\u0000ﱃ᥯Ｖ䊽\u0002\u0000\u0000\u0002ﱃ᥯м\u0000Ｖ䊽м\u0000", new Object[]{"b", "a", aqwx.class, auct.class});
            case 3:
                return new auer();
            case 4:
                return new aueu();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (auer.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        auer auer = new auer();
        c = auer;
        anxl.registerDefaultInstance(auer.class, auer);
    }
}
