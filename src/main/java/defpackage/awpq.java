package defpackage;

/* renamed from: awpq */
public final class awpq extends anxl implements anzf {
    public static final awpq j;
    private static volatile anzq l;
    public int a;
    public axak b;
    public axak c;
    public awqw d;
    public awqw e;
    public apxu f;
    public aygk g;
    public apxu h;
    public arml i;
    private byte k = (byte) 2;

    private awpq() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.k = b;
                return null;
            case 2:
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0006\u0001Љ\u0000\u0002Љ\u0001\u0003\t\u0002\u0004Љ\u0005\u0005Љ\u0006\u0006Љ\u0007\u0007\t\u0003\bЉ\u0004", new Object[]{"a", "b", "c", "d", "g", "h", "i", "e", "f"});
            case 3:
                return new awpq();
            case 4:
                return new awpt();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (awpq.class) {
                        obj3 = l;
                        if (obj3 == null) {
                            obj3 = new anxn(j);
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
        awpq awpq = new awpq();
        j = awpq;
        anxl.registerDefaultInstance(awpq.class, awpq);
    }
}
