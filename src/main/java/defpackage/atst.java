package defpackage;

/* renamed from: atst */
public final class atst extends anxl implements anzf {
    public static final atst q;
    private static volatile anzq r;
    public int a;
    public int b;
    public atsl c;
    public anyd d = anxl.emptyProtobufList();
    public atth e;
    public atsv f;
    public atsx g;
    public atsz h;
    public atsp i;
    public atsj j;
    public atsh k;
    public atsn l;
    public atsr m;
    public atsd n;
    public attb o;
    public atsf p;

    private atst() {
    }

    public final void a() {
        if (!this.d.a()) {
            this.d = anxl.mutableCopy(this.d);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(q, "\u0001\u000e\u0000\u0002\u0001\"\u000e\u0000\u0001\u0000\u0001\t\u0000\u0004\u001b\u0005\t\u0003\u0006\t\u0004\u0007\t\u0005\b\t\u0006\n\t\u000b\u000b\t\f\f\t\r\u000e\t\u000f\u0017\t\u0018\u001d\t\u001c\u001f\t\u001e\"\t ", new Object[]{"a", "b", "c", "d", attd.class, "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
            case 3:
                return new atst();
            case 4:
                return new atss();
            case 5:
                return q;
            case 6:
                Object obj3 = r;
                if (obj3 == null) {
                    synchronized (atst.class) {
                        obj3 = r;
                        if (obj3 == null) {
                            obj3 = new anxn(q);
                            r = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atst atst = new atst();
        q = atst;
        anxl.registerDefaultInstance(atst.class, atst);
    }
}
