package defpackage;

/* renamed from: aoer */
public final class aoer extends anxl implements anzf {
    public static final aoer k;
    private static volatile anzq m;
    public int a;
    public anvu b = anvu.a;
    public arml c;
    public arml d;
    public aygk e;
    public boolean f;
    public apxu g;
    public arml h;
    public aoen i;
    public aygk j;
    private byte l = (byte) 2;

    private aoer() {
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
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0002\u000f\t\u0000\u0000\u0007\u0002\n\u0001\u0004Љ\u0002\u0005Љ\n\u0006Љ\u0004\u0007\u0007\u0005\tЉ\u000b\fЉ\u0007\rЉ\u0003\u000fЉ\b", new Object[]{"a", "b", "c", "i", "e", "f", "j", "g", "d", "h"});
            case 3:
                return new aoer();
            case 4:
                return new aoeq();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (aoer.class) {
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
        aoer aoer = new aoer();
        k = aoer;
        anxl.registerDefaultInstance(aoer.class, aoer);
    }
}
