package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* renamed from: aiuu */
public class aiuu implements abfg {
    public boolean a;
    public boolean b;
    public aiuy c;
    private final Context d;
    private final aiqf e;

    public aiuu(Context context, aiqf aiqf) {
        this.d = context;
        this.e = aiqf;
    }

    /* Access modifiers changed, original: protected */
    public void a(atdv atdv) {
    }

    public final void a(atdv atdv, wxg wxg, String str) {
        if (atdv == null) {
            aiuz.a(wxg, a(str));
        } else if (aiqr.a(atdv) || aiqr.f(atdv)) {
            airc k = this.e.k();
            if (aiqr.d(atdv) || k != airc.BACKGROUND) {
                wxg.a(null, aiuz.b);
            } else {
                aiuz.a(wxg, new ahjc(13, this.d.getString(R.string.audio_unavailable), str));
            }
        } else if (aiqr.c(atdv)) {
            aiuy aiuy = this.c;
            if (aiuy == null) {
                aiuz.a(wxg, aiuu.a(atdv, str));
            } else {
                aiuy.a(atdv.d, atdv.c, new aiux(this, atdv, wxg), aiqr.g(atdv));
            }
        } else {
            aiuz.a(wxg, aiuu.a(atdv, str));
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(atdv atdv, wxg wxg) {
        aiuz.a(wxg, aiuu.b(atdv));
    }

    public final void a(abfj abfj) {
        abfj.p = this.a;
        abfj.e = this.b;
    }

    public static ahjc b(atdv atdv) {
        return aiuu.a(atdv, null);
    }

    private static ahjc a(atdv atdv, String str) {
        ahjh ahjh;
        int a = awah.a(atdv.b);
        if (a == 0) {
            a = 1;
        }
        int i = 3;
        boolean z = false;
        if (a == 2) {
            i = 2;
        } else if (!(a == 3 || a == 7)) {
            if (aiqr.c(atdv)) {
                a = awah.a(atdv.b);
                if (a == 0) {
                    a = 1;
                }
                i = a == 5 ? 6 : 5;
                z = true;
            } else {
                i = 1;
            }
        }
        atdr atdr = atdv.e;
        if (atdr == null) {
            atdr = atdr.c;
        }
        if (atdr.a == 109608350) {
            awaf awaf;
            atdr = atdv.e;
            if (atdr == null) {
                atdr = atdr.c;
            }
            if (atdr.a == 109608350) {
                awaf = (awaf) atdr.b;
            } else {
                awaf = awaf.c;
            }
            if (awaf.b) {
                ahjh = ahjh.SKIP_IF_POSSIBLE;
            } else {
                ahjh = ahjh.STAY_ON_VIDEO;
            }
        } else {
            ahjh = ahjh.UNKNOWN;
        }
        return new ahjc(i, z, ahjh, atdv.c, null, str);
    }

    public final ahjc a(String str) {
        return new ahjc(1, this.d.getString(R.string.unplayable_reason_unknown), str);
    }
}
