package defpackage;

/* renamed from: awra */
public final class awra extends anxl implements anzf {
    public static final awra k;
    private static volatile anzq m;
    public int a;
    public axak b;
    public arml c;
    public arml d;
    public arml e;
    public arml f;
    public arml g;
    public axak h;
    public apxu i;
    public axak j;
    private byte l = (byte) 2;

    private awra() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0003\u0012\t\u0000\u0000\t\u0003Љ\u0002\u0005Љ\u0004\u0006Љ\u0005\bЉ\b\tЉ\t\nЉ\n\u000bЉ\f\rЉ\r\u0012Љ\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "i", "j", "h"});
            case 3:
                return new awra();
            case 4:
                return new awrd();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (awra.class) {
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
        awra awra = new awra();
        k = awra;
        anxl.registerDefaultInstance(awra.class, awra);
    }
}
