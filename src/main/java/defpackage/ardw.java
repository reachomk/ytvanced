package defpackage;

/* renamed from: ardw */
public final class ardw extends anxl implements anzf {
    public static final ardw f;
    public static final anxr g;
    private static volatile anzq i;
    public int a;
    public String b = "";
    public anyd c = anxl.emptyProtobufList();
    public aygk d;
    public boolean e;
    private byte h = (byte) 2;

    private ardw() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.h = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0001\u0001\b\u0000\u0002\u001a\u0005Љ\u0002\u0006\u0007\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new ardw();
            case 4:
                return new ardv();
            case 5:
                return f;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (ardw.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ardw ardw = new ardw();
        f = ardw;
        anxl.registerDefaultInstance(ardw.class, ardw);
        armp armp = armp.m;
        ardw ardw2 = f;
        g = anxl.newSingularGeneratedExtension(armp, ardw2, ardw2, null, 152040444, aobm.MESSAGE, ardw.class);
    }
}
