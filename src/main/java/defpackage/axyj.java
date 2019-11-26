package defpackage;

/* renamed from: axyj */
public final class axyj extends anxl implements anzf {
    public static final axyj k;
    private static volatile anzq m;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public aygk e;
    public arml f;
    public axak g;
    public apxu h;
    public apxu i;
    public anvu j = anvu.a;
    private byte l = (byte) 2;

    private axyj() {
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
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\b\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0005\u0007Љ\u0006\bЉ\u0007\n\n\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new axyj();
            case 4:
                return new axyl();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (axyj.class) {
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
        axyj axyj = new axyj();
        k = axyj;
        anxl.registerDefaultInstance(axyj.class, axyj);
    }
}
