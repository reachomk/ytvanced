package defpackage;

/* renamed from: atkk */
public final class atkk extends anxl implements anzf {
    public static final atkk f;
    private static volatile anzq h;
    public int a;
    public ashy b;
    public String c = "";
    public atki d;
    public anxz e = anxl.emptyIntList();
    private byte g = (byte) 2;

    private atkk() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001Љ\u0000\u0002\b\u0001\u0003\t\u0002\u0004\u001e", new Object[]{"a", "b", "c", "d", "e", awxh.a});
            case 3:
                return new atkk();
            case 4:
                return new atkj();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (atkk.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atkk atkk = new atkk();
        f = atkk;
        anxl.registerDefaultInstance(atkk.class, atkk);
    }
}
