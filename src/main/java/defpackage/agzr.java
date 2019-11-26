package defpackage;

/* renamed from: agzr */
public final class agzr extends agzk {
    public agzr(xsc xsc, xua xua, agqz agqz, agxz agxz, agzo agzo, agvz agvz, ahad ahad, agwa agwa) {
        super(agxz, xsc, xua, agqz, agzo, ahad, agvz, agwa, false);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(aakj aakj, int i) {
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(long j, double d, boolean z) {
        String.valueOf(this.c).length();
        this.f.h().b(this.d, agqf.ACTIVE);
        this.a.a(this.c, j, d, z);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(aakj aakj, agpw agpw) {
        String.valueOf(this.c).length();
        this.f.h().b(this.d, agqf.COMPLETE);
        this.a.a(this.c, agpw);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(agyc agyc, agpw agpw) {
        String str = "offline ad task[";
        String str2;
        String message;
        StringBuilder stringBuilder;
        if (agyc.a) {
            str2 = this.c;
            message = agyc.getMessage();
            stringBuilder = new StringBuilder((String.valueOf(str2).length() + 26) + String.valueOf(message).length());
            stringBuilder.append(str);
            stringBuilder.append(str2);
            stringBuilder.append("] failed: ");
            stringBuilder.append(message);
            xtl.a(stringBuilder.toString(), agyc.getCause());
            this.f.h().b(this.d, agyc.b);
        } else {
            str2 = this.c;
            message = agyc.getMessage();
            stringBuilder = new StringBuilder((String.valueOf(str2).length() + 19) + String.valueOf(message).length());
            stringBuilder.append(str);
            stringBuilder.append(str2);
            stringBuilder.append("]: ");
            stringBuilder.append(message);
            xtl.d(stringBuilder.toString());
        }
        this.a.a(this.c, agyc, agpw);
    }
}
