package defpackage;

/* renamed from: atym */
public final class atym extends anxl implements anzf {
    public static final atym i;
    private static volatile anzq j;
    public int a;
    public String b;
    public String c;
    public long d;
    public long e;
    public atys f;
    public int g;
    public int h;

    private atym() {
        String str = "";
        this.b = str;
        this.c = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\t\u0004\u0006\u0004\u0005\u0007\u0004\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new atym();
            case 4:
                return new atyp();
            case 5:
                return i;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (atym.class) {
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
        atym atym = new atym();
        i = atym;
        anxl.registerDefaultInstance(atym.class, atym);
    }
}
