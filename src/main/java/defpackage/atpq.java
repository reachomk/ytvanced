package defpackage;

/* renamed from: atpq */
public final class atpq extends anxl implements anzf {
    public static final atpq e;
    private static volatile anzq g;
    public int a;
    public int b = 0;
    public Object c;
    public azpm d;
    private byte f = (byte) 2;

    private atpq() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0007\u0001\u0001ᯧ慨\u0007\u0000\u0000\u0007ᯧм\u0000ἻЉ\u0006ⵆм\u0000䴂м\u0000嶲м\u0000巛м\u0000慨м\u0000", new Object[]{"c", "b", "a", azns.class, "d", auus.class, ayjh.class, axtf.class, ayjj.class, axtd.class});
            case 3:
                return new atpq();
            case 4:
                return new atpp();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (atpq.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atpq atpq = new atpq();
        e = atpq;
        anxl.registerDefaultInstance(atpq.class, atpq);
    }
}
