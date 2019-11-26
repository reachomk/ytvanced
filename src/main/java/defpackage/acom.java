package defpackage;

import java.util.List;

/* renamed from: acom */
final class acom implements acfm {
    private final /* synthetic */ int a;
    private final /* synthetic */ String b;
    private final /* synthetic */ acnc c;

    acom(acnc acnc, int i, String str) {
        this.c = acnc;
        this.a = i;
        this.b = str;
    }

    public final void a(avaw avaw, List list) {
        if (aclo.a(this.c)) {
            this.c.bc = avaw;
            String.valueOf(avaw).length();
            this.c.al();
            this.c.a(this.a, null);
            this.c.a(list);
        }
    }

    public final void a(int i, String str) {
        if (aclo.a(this.c)) {
            i = this.a;
            StringBuilder stringBuilder = new StringBuilder(38);
            stringBuilder.append("Stop stream failed: status=");
            stringBuilder.append(i);
            xtl.c(stringBuilder.toString());
            this.c.al();
            this.c.a(this.a, this.b);
        }
    }
}
