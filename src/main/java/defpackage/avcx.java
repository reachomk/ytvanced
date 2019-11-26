package defpackage;

/* renamed from: avcx */
public final class avcx extends anxl implements anzf {
    public static final avcx j;
    private static volatile anzq l;
    public int a;
    public aygk b;
    public arml c;
    public arml d;
    public apxu e;
    public avcv f;
    public avct g;
    public arml h;
    public anvu i = anvu.a;
    private byte k = (byte) 2;

    private avcx() {
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0007\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005\n\b\u0007Љ\u0004\bЉ\u0005\nЉ\u0007", new Object[]{"a", "b", "c", "d", "e", "i", "f", "g", "h"});
            case 3:
                return new avcx();
            case 4:
                return new avda();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (avcx.class) {
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
        avcx avcx = new avcx();
        j = avcx;
        anxl.registerDefaultInstance(avcx.class, avcx);
    }
}
