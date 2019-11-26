package defpackage;

/* renamed from: aqeg */
public final class aqeg extends anxl implements anzf {
    public static final aqeg k;
    private static volatile anzq m;
    public int a;
    public aygk b;
    public arml c;
    public int d;
    public int e;
    public apxu f;
    public anvu g = anvu.a;
    public anyd h = anxl.emptyProtobufList();
    public axak i;
    public boolean j;
    private byte l = (byte) 2;

    private aqeg() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.l = b;
                return null;
            case 2:
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0005\u0001Љ\u0000\u0002Љ\u0001\u0003\u000b\u0002\u0004\u000b\u0003\u0005Љ\u0004\u0007\n\u0006\bЛ\tЉ\u0007\n\u0007\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", apxu.class, "i", "j"});
            case 3:
                return new aqeg();
            case 4:
                return new aqef();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (aqeg.class) {
                        obj3 = m;
                        if (obj3 == null) {
                            obj3 = new anxn(k);
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
        aqeg aqeg = new aqeg();
        k = aqeg;
        anxl.registerDefaultInstance(aqeg.class, aqeg);
    }
}
