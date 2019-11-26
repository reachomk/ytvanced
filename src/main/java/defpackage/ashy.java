package defpackage;

/* renamed from: ashy */
public final class ashy extends anxl implements anzf {
    public static final ashy l;
    private static volatile anzq n;
    public int a;
    public ashl b;
    public ashl c;
    public asik d;
    public ashh e;
    public asia f;
    public ashj g;
    public String h = "";
    public asii i;
    public ashf j;
    public ashw k;
    private byte m = (byte) 2;

    private ashy() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.m = b;
                return null;
            case 2:
                return anxl.newMessageInfo(l, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0003\u0001\t\u0000\u0003\t\u0002\u0004\t\u0003\u0005Љ\u0004\u0006\t\u0005\u0007\t\u0007\b\t\u0001\tЉ\b\nЉ\t\u000b\b\u0006", new Object[]{"a", "b", "d", "e", "f", "g", "i", "c", "j", "k", "h"});
            case 3:
                return new ashy();
            case 4:
                return new asib();
            case 5:
                return l;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (ashy.class) {
                        obj3 = n;
                        if (obj3 == null) {
                            obj3 = new anxn(l);
                            n = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ashy ashy = new ashy();
        l = ashy;
        anxl.registerDefaultInstance(ashy.class, ashy);
    }
}
