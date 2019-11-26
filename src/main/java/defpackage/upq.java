package defpackage;

import android.os.Handler;
import android.os.Message;
import com.google.android.libraries.video.trim.VideoTrimView;

/* renamed from: upq */
public final class upq extends Handler {
    private float a = Float.NaN;
    private final /* synthetic */ VideoTrimView b;

    public final void handleMessage(Message message) {
        if (message.what == 0) {
            VideoTrimView videoTrimView = this.b;
            if (videoTrimView.k && videoTrimView.a() && !this.b.i()) {
                videoTrimView = this.b;
                if (!videoTrimView.u) {
                    videoTrimView.c();
                }
                upe upe = this.b;
                if (upe.j) {
                    uhy.b(upe.i() ^ 1);
                    uhy.b(upe.a());
                    if (upe.p.b > upe.m) {
                        long g;
                        if (upe.t != upu.Begin) {
                            g = upe.g();
                        } else {
                            g = upe.f();
                        }
                        double a = (double) upe.p.a(g);
                        double d = (double) g;
                        double d2 = (double) upe.m;
                        Double.isNaN(a);
                        Double.isNaN(d2);
                        double d3 = a * d2;
                        Double.isNaN(d);
                        long j = (long) (d - d3);
                        Double.isNaN(a);
                        double d4 = 1.0d - a;
                        Double.isNaN(d2);
                        d4 *= d2;
                        Double.isNaN(d);
                        g = (long) (d + d4);
                        upe.s = new uph(upe.q);
                        upe.s.a(j, g);
                        upe.s.a(upe);
                        uja uja = upe.p;
                        uhy.b(uja.c ^ 1);
                        boolean z = false;
                        uhy.a(j >= 0);
                        uhy.a(g <= uja.b);
                        if (j < g) {
                            z = true;
                        }
                        uhy.a(z);
                        uja.a(new ujb(j, g), true);
                        upe.d();
                        upe.b();
                        upe.a(upe.c);
                        upe.requestLayout();
                    }
                }
            }
        }
    }

    public final void a(long j, float f) {
        boolean isNaN = Float.isNaN(this.a);
        float abs = Math.abs(f - this.a);
        float f2 = (float) (this.b.d / 2);
        if (isNaN || abs > f2) {
            removeMessages(0);
            sendEmptyMessageDelayed(0, j);
            this.a = f;
        }
    }

    public final void a() {
        removeMessages(0);
        this.a = Float.NaN;
    }

    public /* synthetic */ upq(VideoTrimView videoTrimView) {
        this.b = videoTrimView;
    }
}
