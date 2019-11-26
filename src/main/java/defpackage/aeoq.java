package defpackage;

import java.util.HashMap;

/* renamed from: aeoq */
final class aeoq implements aajh {
    public boolean a;
    public final /* synthetic */ aeol b;
    private final aamk c;
    private final xhf d;
    private final aeoh e;

    public aeoq(aeol aeol, aamk aamk, xhf xhf, aeoh aeoh) {
        this.b = aeol;
        this.c = (aamk) amqw.a((Object) aamk);
        this.d = (xhf) amqw.a((Object) xhf);
        this.e = aeoh;
    }

    public final synchronized void a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        amqw.a((Object) bArr);
        amqw.a((Object) bArr2);
        amqw.a((Object) bArr3);
        if (this.e == null) {
            b("unexpected null onesiePlayerServiceCrypter");
        }
        try {
            a(this.e.a(bArr, bArr2, bArr3));
        } catch (aeok e) {
            b(aeol.a(e));
        }
    }

    public final synchronized void a(atbw atbw) {
        if (!this.a) {
            this.a = true;
            int a = atby.a(atbw.b);
            if (a != 0) {
                if (a == 2) {
                    int i = atbw.c;
                    if (i == 200) {
                        aamk aamk = this.c;
                        byte[] d = atbw.e.d();
                        HashMap hashMap = new HashMap();
                        for (atbs atbs : atbw.d) {
                            hashMap.put(atbs.b, atbs.c);
                        }
                        bqh a2 = aamk.a(new bqd(200, d, hashMap));
                        if (a2.a()) {
                            this.c.a((ajxu) a2.a);
                            return;
                        } else {
                            this.c.b(a2.c);
                            return;
                        }
                    }
                    StringBuilder stringBuilder = new StringBuilder(36);
                    stringBuilder.append("Non-200 Apiary response: ");
                    stringBuilder.append(i);
                    b(stringBuilder.toString());
                    return;
                }
            }
            int a3 = atby.a(atbw.b);
            if (a3 == 0) {
                a3 = 1;
            }
            StringBuilder stringBuilder2 = new StringBuilder(48);
            stringBuilder2.append("Non-OK Onesie proxy status received: ");
            stringBuilder2.append(a3 - 1);
            b(stringBuilder2.toString());
        }
    }

    public final synchronized void a(String str) {
        if (!this.a) {
            this.a = true;
            b(str);
        }
    }

    public final void b(String str) {
        aeol.a(this.d, this.c, str);
    }
}
