package defpackage;

/* renamed from: arml */
public final class arml extends anxl implements anzf {
    public static final arml f;
    private static volatile anzq h;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public String c = "";
    public boolean d;
    public armn e;
    private byte g = (byte) 2;

    private arml() {
    }

    public final void a() {
        if (!this.b.a()) {
            this.b = anxl.mutableCopy(this.b);
        }
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001Л\u0002\u0007\u0001\u0003\t\u0002\u0004\b\u0000", new Object[]{"a", "b", armp.class, "d", "e", "c"});
            case 3:
                return new arml();
            case 4:
                return new armk();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (arml.class) {
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
        arml arml = new arml();
        f = arml;
        anxl.registerDefaultInstance(arml.class, arml);
    }
}
