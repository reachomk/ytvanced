package defpackage;

/* renamed from: atyk */
public final class atyk extends anxl implements anzf {
    public static final atyk i;
    private static volatile anzq j;
    public int a;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public boolean f;
    public long g;
    public boolean h;

    private atyk() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\r\u0007\u0000\u0000\u0000\u0001\u0004\u0000\u0004\f\u0003\u0007\u0004\u0006\n\b\t\u000b\u0007\n\f\u0002\u000b\r\u0007\f", new Object[]{"a", "b", "c", atyy.a, "d", "e", "f", "g", "h"});
            case 3:
                return new atyk();
            case 4:
                return new atyn();
            case 5:
                return i;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (atyk.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(i);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atyk atyk = new atyk();
        i = atyk;
        anxl.registerDefaultInstance(atyk.class, atyk);
    }
}
