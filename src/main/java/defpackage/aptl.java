package defpackage;

/* renamed from: aptl */
public final class aptl extends anxl implements anzf {
    public static final aptl i;
    private static volatile anzq k;
    public int a;
    public int b = 0;
    public Object c;
    public aptn d;
    public arml e;
    public apxu f;
    public boolean g;
    public anvu h = anvu.a;
    private byte j = (byte) 2;

    private aptl() {
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0001\u0001\u0001\t\u0007\u0000\u0000\u0003\u0001\t\u0000\u0002Љ\u0001\u0003Љ\u0004\u0005\n\b\u0006м\u0000\u0007<\u0000\t\u0007\u0006", new Object[]{"c", "b", "a", "d", "e", "f", "h", aygk.class, arwf.class, "g"});
            case 3:
                return new aptl();
            case 4:
                return new aptk();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (aptl.class) {
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
        aptl aptl = new aptl();
        i = aptl;
        anxl.registerDefaultInstance(aptl.class, aptl);
    }
}
