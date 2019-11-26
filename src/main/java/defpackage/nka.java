package defpackage;

/* renamed from: nka */
public final class nka extends anxl implements anzf {
    public static final nka l;
    private static volatile anzq m;
    public int a;
    public String b;
    public String c;
    public anvu d = anvu.a;
    public long e;
    public String f;
    public long g;
    public int h;
    public String i;
    public boolean j;
    public int k;

    private nka() {
        String str = "";
        this.b = str;
        this.c = str;
        this.f = str;
        this.i = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\n\u0002\u0004\u0002\u0003\u0005\b\u0004\u0006\u0002\u0005\u0007\u0004\u0006\b\b\u0007\t\u0007\b\n\f\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", aqui.a()});
            case 3:
                return new nka();
            case 4:
                return new njz();
            case 5:
                return l;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (nka.class) {
                        obj3 = m;
                        if (obj3 == null) {
                            obj3 = new anxn(l);
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
        nka nka = new nka();
        l = nka;
        anxl.registerDefaultInstance(nka.class, nka);
    }
}
