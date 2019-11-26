package defpackage;

/* renamed from: aeqm */
final class aeqm implements aeuy {
    private final aeqk a;
    private final aevc b;
    private final afez c;

    aeqm(aeqk aeqk, aevc aevc, afez afez) {
        this.a = aeqk;
        this.b = aevc;
        this.c = afez;
    }

    public final void j() {
    }

    public final void k() {
    }

    public final void a() {
        a("onPreparing()");
        this.a.b();
        try {
            this.b.a();
        } finally {
            this.a.c();
        }
    }

    public final void b() {
        a("onLoaded()");
        this.a.b();
        try {
            this.b.b();
        } finally {
            this.a.c();
        }
    }

    public final void c() {
        a("onPlaying()");
        this.a.b();
        try {
            this.b.c();
        } finally {
            this.a.c();
        }
    }

    public final void d() {
        a("onPaused()");
        this.a.b();
        try {
            this.b.d();
        } finally {
            this.a.c();
        }
    }

    public final void e() {
        a("onStopped()");
        this.a.b();
        try {
            this.b.e();
        } finally {
            this.a.c();
        }
    }

    public final void f() {
        a("onEnded()");
        this.a.b();
        try {
            this.b.f();
        } finally {
            this.a.c();
        }
    }

    public final void a(afif afif) {
        Object[] objArr = new Object[]{afif.a(), afif.c};
        a("onError(code=%s info=%s)");
        this.a.b();
        try {
            this.b.a(afif);
        } finally {
            this.a.c();
        }
    }

    public final void a(long j) {
        new Object[1][0] = Long.valueOf(j);
        a("onSeeking(positionMillis=%d)");
        this.a.b();
        try {
            this.b.a(j);
        } finally {
            this.a.c();
        }
    }

    public final void b(long j) {
        new Object[1][0] = Long.valueOf(j);
        a("onPausedSeeking(positionMillis=%d)");
        this.a.b();
        try {
            this.b.b(j);
        } finally {
            this.a.c();
        }
    }

    public final void g() {
        a("onBuffering()");
        this.a.b();
        try {
            this.b.g();
        } finally {
            this.a.c();
        }
    }

    public final void h() {
        a("onPausedBuffering()");
        this.a.b();
        try {
            this.b.h();
        } finally {
            this.a.c();
        }
    }

    public final void i() {
        a("onTransition()");
        this.a.b();
        try {
            this.b.i();
        } finally {
            this.a.c();
        }
    }

    public final void a(aetv aetv) {
        new Object[1][0] = aetv;
        a("onFormatStreamChange(%s)");
        this.a.b();
        try {
            this.b.a(aetv);
        } finally {
            this.a.c();
        }
    }

    public final void a(int i) {
        new Object[1][0] = Integer.valueOf(i);
        a("onSurfaceChange(opaqueMediaViewTypeOrdinal=%d)");
        this.a.b();
        try {
            this.b.a(i);
        } finally {
            this.a.c();
        }
    }

    public final void a(long j, long j2) {
        Object[] objArr = new Object[]{Long.valueOf(j), Long.valueOf(j2)};
        a("onMediaTimeRangeChange(beginTimeMs=%d endTimeMs=%d)");
        this.a.b();
        try {
            this.b.a(j, j2);
        } finally {
            this.a.c();
        }
    }

    public final void a(float f) {
        new Object[1][0] = Float.valueOf(f);
        a("onPlaybackRateChange(playbackRate=%f)");
        this.a.b();
        try {
            this.b.a(f);
        } finally {
            this.a.c();
        }
    }

    public final void a(String str, aevf aevf) {
        Object[] objArr = new Object[]{str, aevf.a(0)};
        a("onGenericKeyValue(key=%s value=%s)");
        this.a.b();
        try {
            this.b.a(str, aevf);
        } finally {
            this.a.c();
        }
    }

    public final void a(aett aett) {
        new Object[1][0] = aett;
        a("onCuePoint(cuePoint=%s)");
        this.a.b();
        try {
            this.b.a(aett);
        } finally {
            this.a.c();
        }
    }

    public final void b(int i) {
        afez afez = this.c;
        if (afez.b.i()) {
            int i2 = afez.d;
            if (i != i2) {
                if (i2 != -1) {
                    afez.a(i2);
                }
                afez.c.putExtra("android.media.extra.AUDIO_SESSION", i);
                afez.a.sendBroadcast(afez.c);
                afez.d = i;
            }
        }
    }

    public final void c(int i) {
        this.c.a(i);
    }

    private final void a(String str) {
        aepu.a((aeuy) this);
        String.valueOf(str).length();
    }
}
