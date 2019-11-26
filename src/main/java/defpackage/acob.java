package defpackage;

import java.util.List;

/* renamed from: acob */
final class acob implements acfm {
    public final /* synthetic */ acnc a;
    private int b = 5;

    acob(acnc acnc) {
        this.a = acnc;
    }

    public final void a(avaw avaw, List list) {
        if (aclo.a(this.a)) {
            acnc acnc = this.a;
            acnc.bc = avaw;
            acnc.a(list);
            String.valueOf(avaw).length();
            acek acek = this.a.aa;
            int i = acek.a;
            boolean z = i == 9 || i == 8 || i == 11 || i == 10;
            amqw.b(z);
            acek.e = true;
            acek.f();
        }
    }

    public final void a(int i, String str) {
        if (aclo.a(this.a)) {
            if (i != 33) {
                int i2 = this.b - 1;
                this.b = i2;
                StringBuilder stringBuilder = new StringBuilder(69);
                stringBuilder.append("Stop stream failed: status=");
                stringBuilder.append(i);
                stringBuilder.append(", attemptsRemaining=");
                stringBuilder.append(i2);
                xtl.c(stringBuilder.toString());
                if (this.b <= 0) {
                    this.a.h(false);
                    return;
                } else {
                    this.a.ai.postDelayed(new acoe(this, this), 400);
                    return;
                }
            }
            this.a.h(false);
            this.a.a(33, str, false);
        }
    }
}
