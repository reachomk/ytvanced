package defpackage;

import android.os.AsyncTask;
import android.os.Handler;
import com.google.protos.youtube.api.innertube.LightweightCameraEndpointOuterClass$LightweightCameraEndpoint;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: gff */
final class gff extends AsyncTask {
    public final gfc a;
    public final Handler b;
    public final znv c;
    public final znv d;
    public final AtomicBoolean e;
    private final asru f = ((asru) asrr.e.createBuilder());
    private final abgv g;
    private final afpu h;

    gff(gfc gfc, Handler handler, abgv abgv, znv znv, znv znv2, afpu afpu, AtomicBoolean atomicBoolean, apxu apxu) {
        this.a = gfc;
        this.b = handler;
        this.g = abgv;
        this.c = znv;
        this.d = znv2;
        this.h = afpu;
        this.e = atomicBoolean;
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                Object obj;
                access$000 = anxl.checkIsLite(LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    obj = access$000.b;
                } else {
                    obj = access$000.a(b);
                }
                if ((((LightweightCameraEndpointOuterClass$LightweightCameraEndpoint) obj).a & 16) != 0) {
                    access$000 = anxl.checkIsLite(LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint);
                    apxu.a(access$000);
                    b = apxu.h.b(access$000.d);
                    if (b == null) {
                        obj = access$000.b;
                    } else {
                        obj = access$000.a(b);
                    }
                    LightweightCameraEndpointOuterClass$LightweightCameraEndpoint lightweightCameraEndpointOuterClass$LightweightCameraEndpoint = (LightweightCameraEndpointOuterClass$LightweightCameraEndpoint) obj;
                    asru asru = this.f;
                    String str = lightweightCameraEndpointOuterClass$LightweightCameraEndpoint.e;
                    asru.copyOnWrite();
                    asrr asrr = (asrr) asru.instance;
                    if (str != null) {
                        asrr.a |= 4;
                        asrr.d = str;
                        return;
                    }
                    throw new NullPointerException();
                }
            }
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        try {
            abgv abgv = this.g;
            asru asru = this.f;
            aaml abgs = new abgs(abgv.c, this.h.c(), asru);
            abgs.g();
            abgs.h = abgv.j.p();
            abgv.g.a(abgs, new gfe(this));
        } catch (aanq e) {
            xtl.a("Failed to get camera info", e);
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        ayyw a = this.d.a();
        if (a != null) {
            asru asru = this.f;
            asru.copyOnWrite();
            asrr asrr = (asrr) asru.instance;
            asrr.c = a;
            asrr.a |= 2;
        } else {
            asru asru2 = this.f;
            asru2.copyOnWrite();
            asrr asrr2 = (asrr) asru2.instance;
            asrr2.c = null;
            asrr2.a &= -3;
        }
        return null;
    }
}
