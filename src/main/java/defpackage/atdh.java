package defpackage;

/* renamed from: atdh */
public final class atdh extends anxl implements anzf {
    public static final atdh h;
    private static volatile anzq i;
    public int a;
    public String b;
    public long c;
    public long d;
    public String e;
    public boolean f;
    public boolean g;

    private atdh() {
        String str = "";
        this.b = str;
        this.e = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0005\b\u0003\u0006\u0007\u0004\u0007\u0007\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new atdh();
            case 4:
                return new atdk();
            case 5:
                return h;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (atdh.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
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
        atdh atdh = new atdh();
        h = atdh;
        anxl.registerDefaultInstance(atdh.class, atdh);
    }
}
