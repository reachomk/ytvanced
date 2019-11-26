package defpackage;

@Deprecated
/* renamed from: aqcs */
public final class aqcs extends anxl implements anzf {
    public static final aqcs d;
    private static volatile anzq f;
    public int a;
    public apxu b;
    public aqcw c;
    private byte e = (byte) 2;

    private aqcs() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.e = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\n\f\u0002\u0000\u0000\u0002\nЉ\n\fЉ\u000b", new Object[]{"a", "b", "c"});
            case 3:
                return new aqcs();
            case 4:
                return new aqcr();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (aqcs.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqcs aqcs = new aqcs();
        d = aqcs;
        anxl.registerDefaultInstance(aqcs.class, aqcs);
    }
}
