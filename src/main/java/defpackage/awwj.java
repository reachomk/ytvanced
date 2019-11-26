package defpackage;

/* renamed from: awwj */
public final class awwj extends anxl implements anzf {
    public static final awwj i;
    private static volatile anzq k;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public arml e;
    public aphj f;
    public arml g;
    public arml h;
    private byte j = (byte) 2;

    private awwj() {
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0002\n\u0007\u0000\u0000\u0007\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0005\u0007Љ\u0006\nЉ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new awwj();
            case 4:
                return new awwi();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (awwj.class) {
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
        awwj awwj = new awwj();
        i = awwj;
        anxl.registerDefaultInstance(awwj.class, awwj);
    }
}
