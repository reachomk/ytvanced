package defpackage;

/* renamed from: aomb */
public final class aomb extends anxl implements anzf {
    public static final aomb k;
    private static volatile anzq m;
    public int a;
    public aomh b;
    public aygk c;
    public arml d;
    public arml e;
    public arml f;
    public aphj g;
    public aphj h;
    public aphj i;
    public aphj j;
    private byte l = (byte) 2;

    private aomb() {
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
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\u000f\t\u0000\u0000\t\u0001Љ\u0001\u0002Љ\u0006\u0003Љ\u0007\u0004Љ\b\u0005Љ\t\u0006Љ\u000b\u0007Љ\f\u000bЉ\u0000\u000fЉ\n", new Object[]{"a", "c", "d", "e", "f", "g", "i", "j", "b", "h"});
            case 3:
                return new aomb();
            case 4:
                return new aome();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (aomb.class) {
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
        aomb aomb = new aomb();
        k = aomb;
        anxl.registerDefaultInstance(aomb.class, aomb);
    }
}
