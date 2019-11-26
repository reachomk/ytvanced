package defpackage;

/* renamed from: apyk */
public final class apyk extends anxl implements anzf {
    public static final apyk f;
    private static volatile anzq h;
    public int a;
    public int b = 0;
    public Object c;
    public String d = "";
    public apye e;
    private byte g = (byte) 2;

    private apyk() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001<\u0000\u0003\t\u0003\u0004м\u0000\u0005\b\u0002", new Object[]{"c", "b", "a", arwf.class, "e", aygk.class, "d"});
            case 3:
                return new apyk();
            case 4:
                return new apyn();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (apyk.class) {
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
        apyk apyk = new apyk();
        f = apyk;
        anxl.registerDefaultInstance(apyk.class, apyk);
    }
}
