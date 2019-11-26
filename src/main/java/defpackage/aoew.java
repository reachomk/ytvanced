package defpackage;

/* renamed from: aoew */
public final class aoew extends anxl implements anzf {
    public static final aoew c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private aoew() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.d = b;
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0002\u0001\u0000Ｈᶾ▻\u0002\u0000\u0000\u0002Ｈᶾм\u0000▻м\u0000", new Object[]{"b", "a", aoer.class, aqeq.class});
            case 3:
                return new aoew();
            case 4:
                return new aoez();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aoew.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aoew aoew = new aoew();
        c = aoew;
        anxl.registerDefaultInstance(aoew.class, aoew);
    }
}
