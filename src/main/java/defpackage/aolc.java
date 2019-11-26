package defpackage;

/* renamed from: aolc */
public final class aolc extends anxl implements anzf {
    public static final aolc h;
    private static volatile anzq j;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public float c;
    public axak d;
    public int e;
    public boolean f;
    public aole g;
    private byte i = (byte) 2;

    private aolc() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0001\u0003\u0001Л\u0004\u0001\u0002\u0005Љ\u0003\u0006\f\u0004\u0007\u0007\u0005\bЉ\u0006", new Object[]{"a", "b", aolg.class, "c", "d", "e", aold.a, "f", "g"});
            case 3:
                return new aolc();
            case 4:
                return new aolf();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (aolc.class) {
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
        aolc aolc = new aolc();
        h = aolc;
        anxl.registerDefaultInstance(aolc.class, aolc);
    }
}
