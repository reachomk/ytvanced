package defpackage;

/* renamed from: awjr */
public final class awjr extends anxl implements anzf {
    public static final awjr j;
    private static volatile anzq l;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public axak e;
    public boolean f;
    public axak g;
    public axak h;
    public anvu i = anvu.a;
    private byte k = (byte) 2;

    private awjr() {
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0000\u0006\u0001Љ\u0000\u0002Љ\u0001\u0005Љ\u0003\u0007\n\t\bЉ\u0002\n\u0007\u0005\u000bЉ\u0006\fЉ\u0007", new Object[]{"a", "b", "c", "e", "i", "d", "f", "g", "h"});
            case 3:
                return new awjr();
            case 4:
                return new awjq();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (awjr.class) {
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

    public static anzq a() {
        return j.getParserForType();
    }

    static {
        awjr awjr = new awjr();
        j = awjr;
        anxl.registerDefaultInstance(awjr.class, awjr);
    }
}
