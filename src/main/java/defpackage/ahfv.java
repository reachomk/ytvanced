package defpackage;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.Executor;

/* renamed from: ahfv */
public final class ahfv implements xcp {
    public final Context a;
    public final aiqf b;
    public final AudioManager c;
    public final ahga d;
    public final bcud e;
    public final ahfx f;
    public ahfz g = this;
    public ahgc h;
    public int i = 0;
    private final aajk j;
    private final Executor k;
    private aakj l;

    public ahfv(Context context, aiqf aiqf, aajk aajk, Executor executor, bcud bcud) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (aiqf) amqw.a((Object) aiqf);
        this.j = (aajk) amqw.a((Object) aajk);
        this.k = (Executor) amqw.a((Object) executor);
        this.e = bcud;
        this.c = (AudioManager) context.getSystemService("audio");
        this.d = new ahga(this);
        this.f = new ahfx(this);
        this.f.a();
        this.h = new ahgc();
    }

    public final void a(ahkn ahkn) {
        if (ahkn.a == airi.VIDEO_REQUESTED) {
            this.l = ahkn.b;
        } else if (ahkn.a == airi.INTERSTITIAL_REQUESTED) {
            this.l = ahkn.c;
        } else if (ahkn.a == airi.PLAYBACK_LOADED) {
            this.f.a();
        }
    }

    public final void a(ahkr ahkr) {
        if (ahkr.a == 2) {
            this.f.a();
            if (this.i == 0) {
                aakj aakj = this.l;
                aajj n;
                if (aakj != null) {
                    n = aakj.n();
                } else {
                    n = (aajj) this.j.get();
                }
                if (!(this.b.a() == 0.0f || this.b.q == 2 || ((n != null && (n.m() || (n.n() && this.b.q == 1))) || !this.h.a))) {
                    this.k.execute(new ahfy(this));
                }
            }
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkn.class, ahkr.class};
        } else if (i == 0) {
            a((ahkn) obj);
            return null;
        } else if (i == 1) {
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
