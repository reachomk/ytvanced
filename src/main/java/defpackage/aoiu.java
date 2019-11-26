package defpackage;

/* renamed from: aoiu */
public final class aoiu extends anxl implements anzf {
    public static final aoiu m;
    private static volatile anzq o;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public apxu e;
    public aois f;
    public aygk g;
    public arml h;
    public apxu i;
    public aoiw j;
    public apxu k;
    public apxu l;
    private byte n = (byte) 2;

    private aoiu() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.n = b;
                return null;
            case 2:
                return anxl.newMessageInfo(m, "\u0001\u000b\u0000\u0001\u0001\u0010\u000b\u0000\u0000\u000b\u0001Љ\u0000\u0002Љ\u0003\u0003Љ\u0004\u0004Љ\u0006\u0005Љ\u000b\tЉ\r\nЉ\u000e\u000bЉ\u000f\fЉ\u0002\rЉ\u0005\u0010Љ\t", new Object[]{"a", "b", "d", "e", "g", "i", "j", "k", "l", "c", "f", "h"});
            case 3:
                return new aoiu();
            case 4:
                return new aoit();
            case 5:
                return m;
            case 6:
                Object obj3 = o;
                if (obj3 == null) {
                    synchronized (aoiu.class) {
                        obj3 = o;
                        if (obj3 == null) {
                            obj3 = new anxn(m);
                            o = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aoiu aoiu = new aoiu();
        m = aoiu;
        anxl.registerDefaultInstance(aoiu.class, aoiu);
    }
}
