package defpackage;

/* renamed from: yjz */
public final class yjz extends yku {
    public String a;
    private Boolean b;
    private Long c;

    public final yku a(boolean z) {
        this.b = Boolean.valueOf(z);
        return this;
    }

    public final yku a(long j) {
        this.c = Long.valueOf(j);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final ykr a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" contactEntityKey");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" active");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" lastActivityTime");
        }
        if (str.isEmpty()) {
            return new yka(this.a, this.b.booleanValue(), this.c.longValue());
        }
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }

    /* synthetic */ yjz(ykr ykr) {
        yka yka = (yka) ykr;
        this.a = yka.a;
        this.b = Boolean.valueOf(yka.b);
        this.c = Long.valueOf(yka.c);
    }
}
