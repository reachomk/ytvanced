package defpackage;

/* renamed from: aozk */
public final class aozk extends anxl implements anzf {
    public static final aozk c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private aozk() {
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
                return anxl.newMessageInfo(c, "\u0001\u0007\u0001\u0000ᠤ㙱\u0007\u0000\u0000\u0007ᠤм\u0000啕᳉м\u0000⢇м\u0000ﵫ⫪м\u0000ヾм\u0000︟㔺м\u0000㙱м\u0000", new Object[]{"b", "a", aqgs.class, arss.class, aoze.class, awad.class, auqt.class, aozd.class, aozq.class});
            case 3:
                return new aozk();
            case 4:
                return new aozn();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aozk.class) {
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
        aozk aozk = new aozk();
        c = aozk;
        anxl.registerDefaultInstance(aozk.class, aozk);
    }
}
