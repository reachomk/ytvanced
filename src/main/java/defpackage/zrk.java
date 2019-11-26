package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import com.google.android.libraries.video.preview.VideoWithPreviewView;
import java.util.Locale;

/* renamed from: zrk */
final /* synthetic */ class zrk implements Runnable {
    private final zrg a;
    private final ujf b;
    private final Uri c;
    private final uoz d;

    zrk(zrg zrg, ujf ujf, Uri uri, uoz uoz) {
        this.a = zrg;
        this.b = ujf;
        this.c = uri;
        this.d = uoz;
    }

    public final void run() {
        zrg zrg = this.a;
        ujf ujf = this.b;
        Uri uri = this.c;
        uoz uoz = this.d;
        ujk ujk = zrg.at;
        xak.a();
        ujf ujf2 = ujk.f;
        if (ujf2 != null) {
            ujf2.b(ujk);
        }
        umr umr = ujk.h;
        if (umr != null) {
            umr.f();
            ujk.j = null;
        }
        ujk.f = ujf;
        ujk.e = uri;
        ujk.n = uoz;
        if (ujf != null) {
            ukz ukz = ujf.b;
            if (ukz.d <= 1920 && ukz.e <= 1080 && ujk.a.a < ujk.k) {
                xtl.d(String.format(Locale.getDefault(), "Increase media codec permits to %d (make:%s, model:%s, osVersion:%s)", new Object[]{Integer.valueOf(ujk.k), Build.MANUFACTURER, Build.MODEL, VERSION.RELEASE}));
                ujk.a.a(ujk.k);
            }
            ujf.a(ujk);
            double q = ujf.q();
            double r = ujf.r();
            double o = ujf.o();
            double p = ujf.p();
            double a = (double) ukz.a();
            q = (1.0d - q) - r;
            Double.isNaN(a);
            a *= q;
            double b = (double) ukz.b();
            q = (1.0d - o) - p;
            Double.isNaN(b);
            b *= q;
            q = a / b;
            VideoWithPreviewView videoWithPreviewView = ujk.c;
            float f = (float) q;
            if (videoWithPreviewView.e != f) {
                videoWithPreviewView.e = f;
                videoWithPreviewView.b();
            }
            if (a < 360.0d) {
                b = 360.0d / q;
                a = 360.0d;
            }
            if (b < 360.0d) {
                a = q * 360.0d;
                b = 360.0d;
            }
            ujk.b.b((int) Math.round(Math.max(a, b)));
            b = (ujf.q() + (1.0d - ujf.r())) / 2.0d;
            q = (ujf.o() + (1.0d - ujf.p())) / 2.0d;
            Object obj = (Math.abs(ujf.o()) >= 0.01d || Math.abs(ujf.p()) >= 0.01d) ? null : 1;
            Object obj2 = (Math.abs(ujf.q()) >= 0.01d || Math.abs(ujf.r()) >= 0.01d) ? null : 1;
            amqw.a(Math.abs(b + -0.5d) < 0.01d);
            amqw.a(Math.abs(q + -0.5d) < 0.01d);
            boolean z = (obj == null && obj2 == null) ? false : true;
            amqw.a(z);
            amqw.a(ujf.q() >= 0.0d);
            amqw.a(ujf.r() >= 0.0d);
            amqw.a(ujf.o() >= 0.0d);
            amqw.a(ujf.p() >= 0.0d);
            ujk.b.a(ujf.b.c());
        }
        ujk.g();
        if (zrg.at.c() && zrg.aC()) {
            zrg.b(ujf != null ? ujf.d() : null);
        }
    }
}
