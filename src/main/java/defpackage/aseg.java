package defpackage;

/* renamed from: aseg */
public final class aseg extends anxl implements anzf {
    public static final aseg h;
    private static volatile anzq j;
    public int a;
    public ashy b;
    public String c;
    public String d;
    public boolean e;
    public aqje f;
    public int g;
    private byte i = (byte) 2;

    private aseg() {
        String str = "";
        this.c = str;
        this.d = str;
        this.e = true;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.i = b;
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0019\u0006\u0000\u0000\u0001\u0001Љ\u0000\u0002\b\u0001\u0003\b\u0002\u0004\u0007\u0003\u0017\t\u0004\u0019\f\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", avuq.a});
            case 3:
                return new aseg();
            case 4:
                return new asej();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (aseg.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aseg aseg = new aseg();
        h = aseg;
        anxl.registerDefaultInstance(aseg.class, aseg);
    }
}
