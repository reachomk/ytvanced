package defpackage;

/* renamed from: ayex */
public final class ayex extends anxl implements anzf {
    public static final ayex j;
    private static volatile anzq k;
    public int a;
    public boolean b;
    public int c;
    public String d = "";
    public int e;
    public int f;
    public float g;
    public int h;
    public boolean i;

    private ayex() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0004\u0001\u0003\b\u0002\u0005\u0004\u0004\u0006\u0004\u0005\u0007\u0001\u0006\t\u0004\b\n\u0007\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new ayex();
            case 4:
                return new ayfa();
            case 5:
                return j;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (ayex.class) {
                        obj3 = k;
                        if (obj3 == null) {
                            obj3 = new anxn(j);
                            k = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ayex ayex = new ayex();
        j = ayex;
        anxl.registerDefaultInstance(ayex.class, ayex);
    }
}
