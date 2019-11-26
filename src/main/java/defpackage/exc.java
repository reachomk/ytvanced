package defpackage;

import android.text.Spanned;
import android.view.LayoutInflater;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: exc */
public final class exc extends ekk implements xcp {
    private final ewz a;
    private final xci b;
    private final ajam c;
    private final zyw d;
    private final bdfu e = new bdfu();

    public exc(elm elm, ewz ewz, xci xci, ajam ajam, zyw zyw) {
        super(elm);
        this.a = (ewz) amqw.a((Object) ewz);
        this.b = xci;
        this.c = ajam;
        this.d = zyw;
    }

    public final void A_() {
        if (foh.x(this.d)) {
            bdfu bdfu = this.e;
            ajam ajam = this.c;
            bdfu.a(ajam.n().f().a(emg.a(this.d, 2147483648L, 0)).a(new exb(this), exe.a), ajam.t().f().a(emg.a(this.d, 2147483648L, 1)).a(new exd(this), exg.a), ajam.Q().d.f().a(emg.a(this.d, 2147483648L, 1)).a(new exf(this), exi.a));
            return;
        }
        this.b.a((Object) this);
    }

    public final void ar_() {
        if (foh.x(this.d)) {
            this.e.a();
        } else {
            this.b.b(this);
        }
    }

    public final void c() {
        this.a.c();
    }

    public final void a(ahkf ahkf) {
        aakj aakj = ahkf.b;
        if (aakj != null) {
            atdv atdv = aakj.a.a;
            if (atdv != null && (atdv.a & 65536) != 0) {
                atet atet = atdv.l;
                if (atet == null) {
                    atet = atet.c;
                }
                if (((atet.a == 86428467 ? (azoq) atet.b : azoq.f).a & 2) != 0) {
                    ewz ewz = this.a;
                    atet atet2 = atdv.l;
                    if (atet2 == null) {
                        atet2 = atet.c;
                    }
                    arml arml = (atet2.a == 86428467 ? (azoq) atet2.b : azoq.f).c;
                    if (arml == null) {
                        arml = arml.f;
                    }
                    Spanned a = ajqy.a(arml);
                    if (ewz.a == null) {
                        ewz.a = (YouTubeTextView) LayoutInflater.from(ewz.getContext()).inflate(R.layout.rental_activation_overlay, ewz).findViewById(R.id.rental_activation_message);
                        ewz.setVisibility(8);
                    }
                    ewz.a.setText(a);
                    ewz.setVisibility(0);
                }
            }
        }
    }

    public final void a(ahkr ahkr) {
        if (ahkr.a == 2) {
            this.a.c();
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkd.class, ahkf.class, ahkr.class};
        } else if (i == 0) {
            c();
            return null;
        } else if (i == 1) {
            a((ahkf) obj);
            return null;
        } else if (i == 2) {
            a((ahkr) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
