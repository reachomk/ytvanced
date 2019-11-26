package defpackage;

import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;

/* renamed from: hdi */
public final class hdi implements xcp {
    private final hdc a;
    private final hdm b;
    private final eif c;

    hdi(hdm hdm, hdc hdc, eif eif) {
        this.b = hdm;
        this.a = hdc;
        this.c = eif;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{aeaj.class};
        } else if (i == 0) {
            aeaj aeaj = (aeaj) obj;
            ejd c = this.c.c();
            if (c.c() || c == ejd.WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED) {
                if (!aeaj.a) {
                    this.a.h();
                    return null;
                }
            } else if (aeaj.a) {
                hdm hdm = this.b;
                if (hdm.e != null) {
                    hdm.b.a(((alco) ((alco) ((alco) ((alco) ((alco) ((alco) ((alco) ((alco) hdm.b.a()).a(hdm.e)).e(2)).d(2)).d(hdm.e.getContext().getString(R.string.mdx_tv_sign_in_tooltip_text))).g(1)).c(hdm.a)).a(new hdo(hdm))).a(new hdl(hdm)).a());
                    return null;
                }
            } else {
                hdc hdc = this.a;
                if (!hdc.b.getBoolean("MdxDisableMdxAssistedSignInTvBlacklist", false)) {
                    String concat = "mdx.mdx_assisted_tv_sign_in_last_shown_time_ms_".concat(aeaj.b);
                    auqv auqv = hdc.c.a().m;
                    if (auqv == null) {
                        auqv = auqv.e;
                    }
                    long toMillis = TimeUnit.DAYS.toMillis((long) auqv.c);
                    if (hdc.b.contains(concat)) {
                        long j = hdc.b.getLong(concat, 0);
                        if (j != 0 && hdc.d.a() - j < toMillis) {
                            hdc.h();
                        }
                    }
                    hdc.b.edit().putLong(concat, hdc.d.a()).apply();
                }
                hdc.f();
                if (hdc.e() == null) {
                    aeab aeab = hdc.a;
                    hda hda = new hda();
                    hda.ab = aeab;
                    hdc.a(hda);
                    return null;
                }
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
