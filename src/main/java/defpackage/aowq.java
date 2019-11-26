package defpackage;

/* renamed from: aowq */
public final class aowq extends anxl implements anzf {
    public static final aowq i;
    private static volatile anzq k;
    public int a;
    public aphj b;
    public arml c;
    public arml d;
    public float e;
    public int f;
    public int g;
    public int h;
    private byte j = (byte) 2;

    private aowq() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.j = b;
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0003\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004\u0001\u0003\u0005\u000b\u0004\u0006\u000b\u0005\u0007\f\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", aohi.a});
            case 3:
                return new aowq();
            case 4:
                return new aowp();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (aowq.class) {
                        obj3 = k;
                        if (obj3 == null) {
                            obj3 = new anxn(i);
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
        aowq aowq = new aowq();
        i = aowq;
        anxl.registerDefaultInstance(aowq.class, aowq);
    }
}
