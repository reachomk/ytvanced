package defpackage;

/* renamed from: aqja */
public final class aqja extends anxl implements anzf {
    public static final aqja i;
    private static volatile anzq k;
    public int a;
    public arml b;
    public aphj c;
    public aphj d;
    public aphj e;
    public arml f;
    public arml g;
    public apxu h;
    private byte j = (byte) 2;

    private aqja() {
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0003\u000f\u0007\u0000\u0000\u0007\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\nЉ\u0005\u000bЉ\u0006\fЉ\u0007\u000fЉ\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new aqja();
            case 4:
                return new aqiz();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (aqja.class) {
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
        aqja aqja = new aqja();
        i = aqja;
        anxl.registerDefaultInstance(aqja.class, aqja);
    }
}
