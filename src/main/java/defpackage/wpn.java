package defpackage;

import android.content.Intent;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: wpn */
final class wpn implements wxe {
    private final atqe a;
    private final byte[] b;
    private final /* synthetic */ wph c;

    wpn(wph wph, atqe atqe) {
        this.c = wph;
        this.a = atqe;
        this.b = atqe.m.d();
    }

    public final boolean a(int i, int i2, Intent intent) {
        int i3 = 0;
        if (i != 906) {
            return false;
        }
        Map map = null;
        acum acum;
        wpp wpp;
        if (i2 == -1) {
            wpl wpl = this.c.m;
            if (wpl != null) {
                wpl.a();
            }
            if (this.a.d != 12) {
                byte[] bArr;
                String str;
                byte[] bArr2;
                if (intent == null) {
                    bArr = null;
                    str = bArr;
                    bArr2 = str;
                } else {
                    bArr = intent.getByteArrayExtra(this.c.f.d());
                    str = intent.getStringExtra(this.c.f.a());
                    bArr2 = intent.getByteArrayExtra(this.c.f.c());
                }
                wph wph = this.c;
                atqe atqe = this.a;
                int isEmpty = (atqe.g.isEmpty() ^ 1) + (atqe.h.isEmpty() ^ 1);
                if (atqe.i.b() != 0) {
                    i3 = 1;
                }
                if (isEmpty + i3 != 1) {
                    xtl.c("More than one kind of offer params or none set. Complete transaction request aborted");
                    wph.a(null);
                } else {
                    abma b = wph.b.b();
                    b.a = aali.b(atqe.g);
                    b.b = aali.b(atqe.h);
                    b.e = atqe.i.d();
                    b.r = bArr2;
                    b.s = bArr;
                    if ((atqe.a & 64) == 0 || atqe.i.b() <= 0) {
                        b.c = aali.b(str);
                    } else {
                        b.d = str.getBytes();
                    }
                    wpk wpk = wph.k;
                    if (wpk != null) {
                        wpk.a(b);
                    }
                    b.a(atqe.k.d());
                    wph.b.a(b, new wpj(wph, atqe));
                }
            } else {
                aaas aaas = (aaas) this.c.i.get();
                atqe atqe2 = this.a;
                apxu apxu = atqe2.d == 12 ? (apxu) atqe2.e : apxu.d;
                if (intent != null) {
                    map = new HashMap();
                    map.put("FUNDS_GUARANTEE_CALLBACK_CLIENT_DATA", anar.a.a(intent.getByteArrayExtra(this.c.f.f())));
                    map.put("PAYMENTS_PAYLOAD", anar.a.a(intent.getByteArrayExtra(this.c.f.e())));
                    map.put("SERIALIZED_WALLET_EVENT_LOGS", intent.getByteArrayExtra(this.c.f.c()));
                    map.put("SERIALIZED_BACKEND_ANALYTICS_EVENT", intent.getByteArrayExtra(this.c.f.d()));
                }
                aaas.a(apxu, map);
            }
        } else if (i2 != 0) {
            if (i2 == this.c.f.b()) {
                this.c.a(new Error(this.c.d.getResources().getString(R.string.payment_wallet_processing_error)));
                afpf afpf = afpf.payment;
                String str2 = wph.a;
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 28);
                stringBuilder.append("youtubePayment::");
                stringBuilder.append(str2);
                stringBuilder.append(" ");
                stringBuilder.append(i2);
                afpc.a(1, afpf, stringBuilder.toString());
            } else {
                this.c.a(null);
            }
            if (this.b != null) {
                acum = this.c.h;
                wpp = new wpp();
                wpp.a(this.b);
                wpp.a = 5;
                acum.a(wpp.d());
            }
        } else {
            byte[] byteArrayExtra;
            this.c.a();
            if (intent != null) {
                byteArrayExtra = intent.getByteArrayExtra(this.c.f.d());
            }
            if (byteArrayExtra != null) {
                wph wph2 = this.c;
                atqe atqe3 = this.a;
                abkx abkx = wph2.c;
                aaml abky = new abky(abkx.c, abkx.d.c());
                abky.b = atqe3.g;
                abky.a = byteArrayExtra;
                abky.c = true;
                abky.a(atqe3.k.d());
                wph2.c.a.a(abky, new wpi());
            }
            if (this.b != null) {
                acum = this.c.h;
                wpp = new wpp();
                wpp.a(this.b);
                acum.a(wpp.b());
            }
        }
        return true;
    }
}
