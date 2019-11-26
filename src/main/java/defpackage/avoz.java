package defpackage;

/* renamed from: avoz */
public final class avoz extends anxl implements anzf {
    public static final avoz m;
    private static volatile anzq o;
    public int a;
    public int b = 0;
    public Object c;
    public aygk d;
    public aygo e;
    public aygk f;
    public arml g;
    public arml h;
    public aphj i;
    public aphj j;
    public anyd k = anxl.emptyProtobufList();
    public anvu l = anvu.a;
    private byte n = (byte) 2;

    private avoz() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.n = b;
                return null;
            case 2:
                return anxl.newMessageInfo(m, "\u0001\u000b\u0001\u0001\u0001\u000e\u000b\u0000\u0001\n\u0001Љ\u0000\u0002Љ\u0003\u0003м\u0000\u0004Љ\u0007\u0005Љ\b\t\n\n\nЉ\u0002\u000bЛ\fЉ\u0001\rм\u0000\u000eЉ\u0004", new Object[]{"c", "b", "a", "d", "g", arml.class, "i", "j", "l", "f", "k", avsk.class, "e", axak.class, "h"});
            case 3:
                return new avoz();
            case 4:
                return new avoy();
            case 5:
                return m;
            case 6:
                Object obj3 = o;
                if (obj3 == null) {
                    synchronized (avoz.class) {
                        obj3 = o;
                        if (obj3 == null) {
                            obj3 = new anxn(m);
                            o = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avoz avoz = new avoz();
        m = avoz;
        anxl.registerDefaultInstance(avoz.class, avoz);
    }
}
