package defpackage;

/* renamed from: zxf */
public final class zxf implements aala {
    private final bqa a;
    private final zxe b;

    public zxf(bqa bqa, zxe zxe) {
        this.a = (bqa) amqw.a((Object) bqa);
        this.b = (zxe) amqw.a((Object) zxe);
    }

    public final /* synthetic */ void a(Object obj) {
        apxu apxu = (apxu) obj;
        if (this.b.a(apxu)) {
            asic a;
            byte[] c = this.b.c(apxu);
            String b = this.b.b(apxu);
            try {
                a = abmj.a(c);
            } catch (anyg e) {
                String valueOf = String.valueOf(e.getLocalizedMessage());
                String str = "Failed to parse inlined prefetch data: ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                xtl.d(valueOf);
                a = null;
            }
            bpz a2 = abmj.a(c, a);
            if (a2 != null) {
                this.a.a(b, a2);
                this.b.a();
            }
        }
    }
}
