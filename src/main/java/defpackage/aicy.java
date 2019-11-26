package defpackage;

import android.text.Spanned;
import com.google.android.youtube.R;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: aicy */
final /* synthetic */ class aicy implements Runnable {
    private final aicw a;

    aicy(aicw aicw) {
        this.a = aicw;
    }

    public final void run() {
        aicw aicw = this.a;
        aujh aujh = aicw.f;
        if (aujh != null) {
            arml arml;
            arml arml2 = null;
            if ((aujh.a & 4) != 0) {
                arml = aujh.d;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            CharSequence a = ajqy.a(arml);
            if ((aujh.a & 2) != 0) {
                if (aujh.b - TimeUnit.MILLISECONDS.toSeconds(aicw.e.a()) > 0) {
                    String a2 = aicw.c.a(String.format(Locale.getDefault(), "%02d:%02d", new Object[]{Long.valueOf(TimeUnit.SECONDS.toMinutes(r7)), Long.valueOf(r7 % 60)}));
                    a = aicw.b.getString(R.string.live_event_starts_in, new Object[]{a2});
                }
            }
            aphv a3 = aicw.a(aujh);
            if (a3 != null) {
                arml arml3;
                aicu aicu = aicw.a;
                if ((aujh.a & 8) != 0) {
                    arml3 = aujh.e;
                    if (arml3 == null) {
                        arml3 = arml.f;
                    }
                } else {
                    arml3 = null;
                }
                Spanned a4 = ajqy.a(arml3);
                boolean z = a3.b;
                if ((a3.a & 64) != 0) {
                    arml3 = a3.e;
                    if (arml3 == null) {
                        arml3 = arml.f;
                    }
                } else {
                    arml3 = null;
                }
                Spanned a5 = ajqy.a(arml3);
                arwf arwf = a3.d;
                if (arwf == null) {
                    arwf = arwf.c;
                }
                int a6 = aicw.a(arwf);
                if ((a3.a & 4096) != 0) {
                    arml2 = a3.k;
                    if (arml2 == null) {
                        arml2 = arml.f;
                    }
                }
                Spanned a7 = ajqy.a(arml2);
                arwf = a3.j;
                if (arwf == null) {
                    arwf = arwf.c;
                }
                aicu.a(a, a4, z, a5, a6, a7, aicw.a(arwf));
            } else {
                arml arml4;
                if ((aujh.a & 8) != 0) {
                    arml4 = aujh.e;
                    if (arml4 == null) {
                        arml4 = arml.f;
                    }
                } else {
                    arml4 = null;
                }
                Spanned a8 = ajqy.a(arml4);
                aicw.a.a(a, a8, false, null, 0, null, 0);
                aphg b = aicw.b(aujh);
                if (b != null) {
                    aicu aicu2 = aicw.a;
                    if ((b.a & 128) != 0) {
                        arml2 = b.g;
                        if (arml2 == null) {
                            arml2 = arml.f;
                        }
                    }
                    aicu2.a(a, a8, ajqy.a(arml2));
                }
            }
            aicw.g = true;
        }
    }
}
