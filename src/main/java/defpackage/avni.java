package defpackage;

/* renamed from: avni */
public final class avni extends anxl implements anzf {
    public static final avni k;
    private static volatile anzq l;
    public int a;
    public String b = "";
    public anyd c = anxl.emptyProtobufList();
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    private avni() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001\b\u0000\u0002\u001a\u0003\u0004\u0001\u0004\u0004\u0002\u0005\u0004\u0003\u0006\u0004\u0004\u0007\u0004\u0005\b\u0004\u0006\t\f\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", avsi.a()});
            case 3:
                return new avni();
            case 4:
                return new avnl();
            case 5:
                return k;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (avni.class) {
                        obj3 = l;
                        if (obj3 == null) {
                            obj3 = new anxn(k);
                            l = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avni avni = new avni();
        k = avni;
        anxl.registerDefaultInstance(avni.class, avni);
    }
}
