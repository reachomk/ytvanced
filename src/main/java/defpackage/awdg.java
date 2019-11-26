package defpackage;

/* renamed from: awdg */
public final class awdg extends anxl implements anzf {
    public static final awdg J;
    private static volatile anzq L;
    public aouk A;
    public axur B;
    public aoui C;
    public axbf D;
    public aokk E;
    public awgg F;
    public aujb G;
    public apxl H;
    public aqry I;
    private byte K = (byte) 2;
    public int a;
    public int b;
    public aqhl c;
    public arhh d;
    public aoxy e;
    public awcc f;
    public awaz g;
    public aokb h;
    public aosb i;
    public aoth j;
    public avjo k;
    public awdi l;
    public atzk m;
    public aokw n;
    public axvc o;
    public aoki p;
    public aoku q;
    public axou r;
    public aury s;
    public aywv t;
    public aqti u;
    public azfe v;
    public aopp w;
    public awgk x;
    public awtu y;
    public aqsq z;

    private awdg() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.K);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.K = b;
                return null;
            case 2:
                return anxl.newMessageInfo(J, "\u0001!\u0000\u0002ᩫ曣!\u0000\u0000\u0001ᩫ\t\u0006ᮒ\t\u0001Შ\t\u0007₱\t\f₴\t\u000f™\t\u000e⎗\t\u0014ﱡ┤\t\u0015▦\t\r⢵\t\u0016⪙\t\u0018ﻤ⬎\t\u0019ⱈ\t\u001c鬒Ⳮ\t\u0011⺷Љ ⼗\t\u001f﵃ら\t!ㄞ\t\"㓖\t%ﲬ㟵\t&㠘\t(﹊㡎\t'㤁\t)㥳\t*㮀\t,ﭑ㯕\t.㹳\t0䉪\t1䉴\t-䧻\t3䪟\t\b圭\t5曣\t\u0000", new Object[]{"a", "b", "e", "d", "f", "h", "k", "j", "m", "n", "i", "o", "p", "q", "r", "l", "t", "s", "u", "v", "w", "x", "z", "y", "A", "B", "C", "E", "F", "G", "D", "H", "g", "I", "c"});
            case 3:
                return new awdg();
            case 4:
                return new awdf();
            case 5:
                return J;
            case 6:
                Object obj3 = L;
                if (obj3 == null) {
                    synchronized (awdg.class) {
                        obj3 = L;
                        if (obj3 == null) {
                            obj3 = new anxn(J);
                            L = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        awdg awdg = new awdg();
        J = awdg;
        anxl.registerDefaultInstance(awdg.class, awdg);
    }
}
