package defpackage;

/* renamed from: apwe */
public final class apwe extends anxl implements anzf {
    public static final apwe g;
    private static volatile anzq i;
    public int a;
    public String b = "";
    public boolean c;
    public apwo d;
    public boolean e;
    public apwg f;
    private byte h = (byte) 2;

    private apwe() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001\b\u0000\u0002\u0007\u0001\u0003\t\u0002\u0004\u0007\u0003\u0005Љ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new apwe();
            case 4:
                return new apwd();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (apwe.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
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
        apwe apwe = new apwe();
        g = apwe;
        anxl.registerDefaultInstance(apwe.class, apwe);
    }
}