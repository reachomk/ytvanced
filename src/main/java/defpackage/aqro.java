package defpackage;

/* renamed from: aqro */
public final class aqro extends anxl implements anzf {
    public static final aqro l;
    private static volatile anzq n;
    public int a;
    public aygk b;
    public aqrk c;
    public String d = "";
    public aqrm e;
    public boolean f;
    public boolean g;
    public apxu h;
    public apxu i;
    public aodx j;
    public aodx k;
    private byte m = (byte) 2;

    private aqro() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.m = b;
                return null;
            case 2:
                return anxl.newMessageInfo(l, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0004\u0001Љ\u0000\u0003\t\u0002\u0004\b\u0004\u0005\u0007\u0007\u0006\u0007\b\u0007Љ\t\bЉ\n\t\t\u000b\n\t\f\fЉ\u0006", new Object[]{"a", "b", "c", "d", "f", "g", "h", "i", "j", "k", "e"});
            case 3:
                return new aqro();
            case 4:
                return new aqrn();
            case 5:
                return l;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (aqro.class) {
                        obj3 = n;
                        if (obj3 == null) {
                            obj3 = new anxn(l);
                            n = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqro aqro = new aqro();
        l = aqro;
        anxl.registerDefaultInstance(aqro.class, aqro);
    }
}
