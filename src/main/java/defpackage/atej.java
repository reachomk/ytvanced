package defpackage;

/* renamed from: atej */
public final class atej extends anxp implements anzf {
    public static final atej s;
    private static volatile anzq u;
    public int a;
    public int b;
    public asic c;
    public awdg d;
    public atdv e;
    public aten f;
    public avqc g;
    public apiz i;
    public axak j;
    public ater k;
    public aybc l;
    public atdn m;
    public ateb n;
    public arwl o;
    public aozu p;
    public axak q;
    public arnm r;
    private byte t = (byte) 2;

    private atej() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    public final boolean hasFrameworkUpdates() {
        return (this.b & 64) != 0;
    }

    public final arnm getFrameworkUpdates() {
        arnm arnm = this.r;
        return arnm == null ? arnm.a : arnm;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.t);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.t = b;
                return null;
            case 2:
                return anxl.newMessageInfo(s, "\u0001\u000f\u0000\u0002\u0001̉\u000f\u0000\u0000\u000f\u0001Љ\u0000\u0002Љ\u0002\u0004Љ\u0004\nЉ\b\u000eЉ\u0007\u000fЉ\u0001\u0011Љ\n\u001aЉ\u000f#Љ\u0017)Љ\u001b*Љ\u001c,Љ\u001d.Љ\u001e6Љ\"̉Љ&", new Object[]{"a", "b", "c", "e", "f", "i", "g", "d", "j", "k", "l", "m", "n", "o", "p", "q", "r"});
            case 3:
                return new atej();
            case 4:
                return new atem();
            case 5:
                return s;
            case 6:
                Object obj3 = u;
                if (obj3 == null) {
                    synchronized (atej.class) {
                        obj3 = u;
                        if (obj3 == null) {
                            obj3 = new anxn(s);
                            u = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atej atej = new atej();
        s = atej;
        anxl.registerDefaultInstance(atej.class, atej);
    }
}
