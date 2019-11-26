package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import com.google.android.libraries.youtube.mdx.mediaroute.RemotePlaybackControlsService;

/* renamed from: adhk */
public final class adhk {
    private static final String c = xtl.b("MDX.RemoteStarter");
    public boolean a;
    public boolean b;
    private final Context d;
    private final bcaa e;
    private final Handler f;
    private final Runnable g;
    private boolean h;
    private boolean i;
    private final ServiceConnection j = new adhm();
    private final adqh k = new adhl(this);
    private final adqi l = new adho(this);

    public adhk(Context context, bcaa bcaa) {
        this.d = context;
        this.e = bcaa;
        this.f = new Handler();
        this.g = new adhj(this);
    }

    public final void a() {
        if (!this.i) {
            adqf adqf = (adqf) this.e.get();
            adqf.a(this.k);
            adqf.a(this.l);
            this.i = true;
        }
    }

    public final void b() {
        a(0);
    }

    public final void a(long j) {
        this.f.removeCallbacks(this.g);
        Intent intent = new Intent(this.d, RemotePlaybackControlsService.class);
        if (this.a || this.b) {
            if (!this.h) {
                boolean bindService = this.d.bindService(intent, this.j, 1);
                this.h = bindService;
                if (!bindService) {
                    xtl.a(c, "failed binding to remote playback control service");
                }
            }
        } else if (this.h) {
            if (j > 0) {
                this.f.postDelayed(this.g, j);
            } else {
                c();
            }
        }
    }

    public final void c() {
        this.d.unbindService(this.j);
        this.h = false;
    }
}
