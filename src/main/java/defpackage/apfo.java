package defpackage;

/* renamed from: apfo */
public final class apfo extends anxl implements anzf {
    public static final apfo i;
    private static volatile anzq k;
    public int a;
    public arml b;
    public boolean c;
    public arml d;
    public apxu e;
    public apxu f;
    public apxu g;
    public apxu h;
    private byte j = (byte) 2;

    private apfo() {
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0006\u0001Љ\u0000\u0003\u0007\u0002\u0005Љ\u0004\u0006Љ\u0005\u0007Љ\u0006\bЉ\u0007\tЉ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new apfo();
            case 4:
                return new apfr();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (apfo.class) {
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
        apfo apfo = new apfo();
        i = apfo;
        anxl.registerDefaultInstance(apfo.class, apfo);
    }
}
