package defpackage;

/* renamed from: aqjk */
public final class aqjk extends anxl implements anzf {
    public static final aqjk k;
    public static final anxr l;
    private static volatile anzq n;
    public int a;
    public auuz b;
    public auuz c;
    public auuz d;
    public auuz e;
    public auuz f;
    public auuz g;
    public auuz h;
    public auuz i;
    public auuz j;
    private byte m = (byte) 2;

    private aqjk() {
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
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\t\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0006\u0007Љ\u0007\bЉ\u0005\tЉ\b", new Object[]{"a", "b", "c", "d", "e", "f", "h", "i", "g", "j"});
            case 3:
                return new aqjk();
            case 4:
                return new aqjj();
            case 5:
                return k;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (aqjk.class) {
                        obj3 = n;
                        if (obj3 == null) {
                            obj3 = new anxn(k);
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
        aqjk aqjk = new aqjk();
        k = aqjk;
        anxl.registerDefaultInstance(aqjk.class, aqjk);
        aqta aqta = aqta.d;
        aqjk aqjk2 = k;
        l = anxl.newSingularGeneratedExtension(aqta, aqjk2, aqjk2, null, 146552955, aobm.MESSAGE, aqjk.class);
    }
}
