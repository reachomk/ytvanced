package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: jwp */
public final class jwp extends akyg implements ajan, alfl, OnItemClickListener, xcp {
    private static final amqv ar = jwt.a;
    public xci Z;
    public aizy aa;
    public akvp ab;
    public hxh ac;
    public hwt ad;
    public hxr ae;
    public hxn af;
    public hwq ag;
    public hya ah;
    public hwv ai;
    public hxd aj;
    public hxc ak;
    public alfi al;
    public zyw am;
    public ajam an;
    public eif ao;
    public jwv ap;
    private final bdfu as = new bdfu();
    private List at = Collections.EMPTY_LIST;
    private List au;
    private String av;
    private akpk aw;
    private aknc ax;
    private aknu ay;

    /* Access modifiers changed, original: protected|final */
    public final int W() {
        return 0;
    }

    /* Access modifiers changed, original: protected|final */
    public final String X() {
        return null;
    }

    /* Access modifiers changed, original: protected|final */
    public final OnItemClickListener Y() {
        return this;
    }

    public final long e() {
        return 1;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        bundle = this.j;
        if (bundle != null) {
            String str = "FEED_MENU_ITEMS_KEY";
            if (bundle.containsKey(str)) {
                try {
                    this.au = ((auvn) aobp.a(bundle, str, auvn.l, anxa.c())).b;
                } catch (anyg e) {
                    String valueOf = String.valueOf(e.toString());
                    String str2 = "unable to decode menu items: ";
                    throw new RuntimeException(valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
                }
            }
            this.au = new ArrayList();
            this.av = bundle.getString("VIDEO_ID_KEY");
        }
    }

    public final void a(Activity activity) {
        ((jws) xse.a((Object) activity)).a(this);
        if (this.ao.c() == ejd.INLINE || this.ao.c() == ejd.INLINE_FULLSCREEN) {
            this.at = Arrays.asList(new hwr[]{this.ac.h(), this.ae.b, this.af.c, this.ag.b, this.aj.b, this.ai.a(), this.ad.a()});
        } else {
            this.at = Arrays.asList(new hwr[]{this.ak.a, this.ac.h(), this.ae.b, this.af.c, this.ag.b, this.aj.b, this.ai.a(), this.ah.a, this.ad.a()});
        }
        super.a(activity);
    }

    public final void W_() {
        super.W_();
        ab();
        if (foh.x(this.am)) {
            this.as.a();
            this.as.a(a(this.an));
        } else {
            this.Z.a((Object) this);
        }
        this.al.a(this);
    }

    public final void N_() {
        super.N_();
        if (foh.x(this.am)) {
            this.as.a();
        } else {
            this.Z.b(this);
        }
        this.al.b(this);
    }

    public final void aa() {
        f();
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ufk ufk = (ufk) ((ufg) ((akyn) this.aq).getItem(i));
        jwv jwv = this.ap;
        if (jwv == null) {
            dismiss();
            return;
        }
        if (ufk instanceof akyr) {
            auvj auvj = ((akyr) ufk).a;
            if (auvj != null) {
                jwv.a(auvj, this.av);
            }
        } else if (ufk instanceof hwr) {
            ((hwr) ufk).a.a();
        }
        dismiss();
    }

    public final void a(ahkn ahkn) {
        if (ahkn.a.a(airi.PLAYBACK_LOADED) && ahkn.b != null) {
            ab();
        }
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.f().a(emg.a(this.am, 512, 1)).a(new jwo(this), jwr.a)};
    }

    /* Access modifiers changed, original: final */
    public final void ab() {
        aizy aizy = this.aa;
        if (aizy != null) {
            boolean equals = TextUtils.equals(aizy.k(), this.av);
            this.ax.b(!equals ? 0 : Integer.MAX_VALUE);
            if (equals && F_()) {
                this.ax.b();
            }
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ ListAdapter Z() {
        this.aw = new akpk();
        for (auvj auvj : this.au) {
            akpk akpk = this.aw;
            akyr akyr = new akyr(abmk.a(auvj).toString(), auvj);
            if (abmk.b(auvj) != null) {
                akvp akvp = this.ab;
                arwh a = arwh.a(abmk.b(auvj).b);
                if (a == null) {
                    a = arwh.UNKNOWN;
                }
                int a2 = akvp.a(a);
                if (a2 > 0) {
                    akyr.d = q().getDrawable(a2);
                }
            }
            akpk.add(akyr);
        }
        akpk akpk2 = new akpk();
        this.ax = new aknc(akpk2);
        for (akyp akyp : this.at) {
            akpk2.add(akyp);
            Object jwq = new jwq(this);
            amqw.a(jwq);
            akyp.f.add(jwq);
        }
        akoh akoh = new akoh();
        akoh.a(this.aw);
        akoh.a(this.ax);
        this.ay = new aknu(akoh, ar);
        return new akyn(p(), this.ay);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkn.class};
        } else if (i == 0) {
            a((ahkn) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
