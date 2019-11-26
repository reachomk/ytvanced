package defpackage;

/* renamed from: agzv */
public final class agzv extends agzk {
    private final aajx h;

    public agzv(xsc xsc, xua xua, agqz agqz, agxz agxz, agzo agzo, ajgv ajgv, agvz agvz, aajx aajx, ahad ahad, agwa agwa) {
        super(agxz, xsc, xua, agqz, agzo, ahad, agvz, agwa, true);
        amqw.a((Object) ajgv);
        this.h = (aajx) amqw.a((Object) aajx);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a() {
        return this.f.h().i(this.d) != null;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(aakj aakj, int i) {
        this.f.m().a(this.d, aakj, ahdl.a(i), zzp.b, agxj.o(this.b.f));
        this.e.a(this.c, this.d, aakj, this.f.h(), this.g.a(), this.h);
        this.e.a(this.c, this.d, this.f.h(), this.a);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(long j, double d, boolean z) {
        this.a.a(this.c, j, d, z);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(aakj aakj, agpw agpw) {
        ahad.a(aakj, this.f.i(), this.f.h());
        String.valueOf(this.c).length();
        this.a.a(this.c, agpw);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(agyc agyc, agpw agpw) {
        String str = "pudl task[";
        String str2;
        String message;
        StringBuilder stringBuilder;
        if (agyc.a) {
            str2 = this.c;
            message = agyc.getMessage();
            stringBuilder = new StringBuilder((String.valueOf(str2).length() + 20) + String.valueOf(message).length());
            stringBuilder.append(str);
            stringBuilder.append(str2);
            stringBuilder.append("] failed: ");
            stringBuilder.append(message);
            xtl.a(stringBuilder.toString(), agyc.getCause());
        } else {
            str2 = this.c;
            message = agyc.getMessage();
            stringBuilder = new StringBuilder((String.valueOf(str2).length() + 13) + String.valueOf(message).length());
            stringBuilder.append(str);
            stringBuilder.append(str2);
            stringBuilder.append("]: ");
            stringBuilder.append(message);
            xtl.d(stringBuilder.toString());
        }
        this.a.a(this.c, agyc, agpw);
    }
}
