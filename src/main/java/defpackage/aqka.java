package defpackage;

/* renamed from: aqka */
public final class aqka extends anxl implements anzf {
    public static final aqka h;
    private static volatile anzq j;
    public int a;
    public arml b;
    public String c;
    public String d;
    public anyd e;
    public arml f;
    public anvu g;
    private byte i = (byte) 2;

    private aqka() {
        String str = "";
        this.c = str;
        this.d = str;
        this.e = anxl.emptyProtobufList();
        this.g = anvu.a;
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0003\u0001Љ\u0000\u0002\b\u0001\u0003Л\u0004Љ\u0003\u0006\n\u0005\u0007\b\u0002", new Object[]{"a", "b", "c", "e", aygk.class, "f", "g", "d"});
            case 3:
                return new aqka();
            case 4:
                return new aqjz();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (aqka.class) {
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
        aqka aqka = new aqka();
        h = aqka;
        anxl.registerDefaultInstance(aqka.class, aqka);
    }
}
