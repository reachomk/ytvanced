package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.MediaStore.Images.Media;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import com.google.android.libraries.video.preview.VideoWithPreviewView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: zrv */
public final class zrv implements SurfaceTextureListener, nlu, ujk, una {
    public final ukm a = new ukm();
    public final zle b;
    public final VideoWithPreviewView c;
    public final umo d;
    public Uri e;
    public ujf f;
    public int g;
    public umr h;
    public final umw i = new umw(this.a);
    public nnj j;
    public final int k;
    public zsb l;
    public zet m;
    public uoz n;
    private volatile boolean o;
    private nnj p;
    private ukw q;
    private long r = -1;
    private final int s;
    private final boolean t;
    private final zle u = new zry();

    public zrv(VideoWithPreviewView videoWithPreviewView, umo umo, zet zet, long j, int i, boolean z, int i2) {
        zle zld;
        this.c = (VideoWithPreviewView) amqw.a((Object) videoWithPreviewView);
        this.d = (umo) amqw.a((Object) umo);
        this.m = zet;
        this.r = j;
        this.k = i;
        this.t = z;
        videoWithPreviewView.j = this;
        if (i2 == 1 && !zld.a) {
            i2 = 0;
        }
        this.s = i2;
        if (i2 == 1) {
            zld = new zld(this.c.getContext().getApplicationContext(), new zrw(this), null);
        } else {
            zld = this.u;
        }
        this.b = zld;
        this.b.f();
        videoWithPreviewView.k = this.b.e();
        this.i.b.add(this);
    }

    public final void a() {
    }

    public final void a(ujf ujf, Set set) {
    }

    public final void b(ujf ujf, Set set) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final boolean c() {
        return this.s == 1;
    }

    public final long d() {
        umr umr = this.h;
        if (umr == null || umr.b() == 1) {
            return this.r;
        }
        return this.h.i();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (c()) {
            this.b.a(surfaceTexture, i, i2);
        } else {
            a(surfaceTexture, false);
        }
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.s == 1 && i > 0 && i2 > 0) {
            this.b.a(i, i2);
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        if (c()) {
            return this.b.g();
        }
        a(surfaceTexture, true);
        return false;
    }

    public final void a(boolean z, int i) {
        if (i == 4) {
            this.g = 0;
        }
    }

    public final void a(nlq nlq) {
        if (nlq.getCause() instanceof nmm) {
            xtl.c("ExoPlayer: onPlayerError: DecoderInitializationException - attempt retry");
            int i = this.a.a;
            int i2 = i > 1 ? 3 : 5;
            int i3 = this.g;
            StringBuilder stringBuilder;
            if (i3 < i2) {
                stringBuilder = new StringBuilder(86);
                stringBuilder.append("ExoPlayer: onPlayerError: maybeRetryEnablePlayback - retry: ");
                stringBuilder.append(i3 + 1);
                stringBuilder.append(" of ");
                stringBuilder.append(i2);
                xtl.c(stringBuilder.toString());
                f();
                this.c.postDelayed(new zrx(this), ((long) this.g) * 100);
            } else if (i <= 1) {
                xtl.c("ExoPlayer: onPlayerError: maybeRetryEnablePlayback - unable to play");
                b(nlq);
            } else {
                stringBuilder = new StringBuilder(88);
                stringBuilder.append("ExoPlayer: onPlayerError: maybeRetryEnablePlayback - try reduce decoders to: ");
                stringBuilder.append(i - 1);
                xtl.c(stringBuilder.toString());
                f();
                this.a.a(new zrz(this), Integer.MAX_VALUE);
            }
            this.g++;
            return;
        }
        b(nlq);
    }

    public final void a(ujf ujf, ujh ujh) {
        int ordinal = ujh.ordinal();
        if (ordinal == 0 || ordinal == 3) {
            i();
            return;
        }
        if (ordinal == 4 || ordinal == 5) {
            h();
        }
    }

    public final void b() {
        this.c.post(new zru(this));
    }

    public final void e() {
        this.h = new umr();
        this.o = false;
        this.h.a((nlu) this);
        this.d.a(this.h);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(0));
        arrayList.add(Integer.valueOf(1));
        arrayList.add(Integer.valueOf(4));
        this.i.a(this.h, arrayList);
        long j = this.r;
        if (j != -1) {
            this.h.a(j);
            this.r = -1;
        }
        g();
        nlu nlu = this.c;
        nlp nlp = this.h;
        nlu.i = 0;
        nlp nlp2 = nlu.h;
        if (nlp2 != nlp) {
            if (nlp2 != null) {
                nlp2.b(nlu);
            }
            nlu.h = nlp;
            nlp2 = nlu.h;
            if (nlp2 != null) {
                nlu.a(nlp2.b());
                nlu.h.a(nlu);
                return;
            }
            nlu.a(5);
        }
    }

    public final void f() {
        umw umw = this.i;
        umw.c.d(umw);
        umw.f = null;
        umw.i = null;
        umw.h = null;
        if (this.h != null) {
            this.r = d();
            this.h.g();
            this.h = null;
            this.o = false;
        }
        this.j = null;
        this.p = null;
        this.b.i();
    }

    private final void b(nlq nlq) {
        this.c.c.setVisibility(0);
        this.d.setVisibility(4);
        zsb zsb = this.l;
        if (zsb != null) {
            zsb.a(nlq);
        }
    }

    public final void g() {
        xak.a();
        if (this.e != null && this.h != null && this.i.c() && !this.o) {
            boolean z = true;
            this.o = true;
            Context applicationContext = this.c.getContext().getApplicationContext();
            if (this.f.b.b) {
                try {
                    this.b.a(Media.getBitmap(applicationContext.getContentResolver(), this.e));
                } catch (IOException e) {
                    xtl.a("error retrieving image from uri", e);
                }
                this.j = new nln();
                this.p = new nln();
            } else {
                nne nly;
                if (this.t) {
                    nne nrd = new nrd(this.e, new nvr(applicationContext, nxf.a(applicationContext, "VideoMPEG")), new nvp(65536), 16777216, new nrc[0]);
                } else {
                    nly = new nly(applicationContext, this.e);
                }
                this.j = new umz(this.i, applicationContext, nly);
                this.p = new nlz(nly, nmg.a);
            }
            umt umt = new umt(applicationContext, this.c, this.n);
            nnj[] nnjArr = new nnj[]{this.j, this.p, new ump(this.d), umt, new nln()};
            if (this.m != null) {
                nne nne = null;
                String str = "AudioMPEG";
                if (this.t) {
                    nne = new nrd(this.m.d, new nvr(applicationContext, nxf.a(applicationContext, str)), new nvp(65536), 1310720, new nrc[0]);
                } else {
                    nvr nvr = new nvr(applicationContext, nxf.a(applicationContext, str));
                    int a = new ukb(applicationContext).a(this.m.d);
                    nrd nrd2;
                    if (a == 1) {
                        nsc nsc = new nsc();
                        nrd2 = new nrd(this.m.d, nvr, new nvp(65536), 1310720, nsc);
                    } else if (a == 2) {
                        nst nst = new nst();
                        nrd2 = new nrd(this.m.d, nvr, new nvp(65536), 1310720, nst);
                    } else if (a == 3 || a == 4) {
                        nne = new nly(applicationContext, this.m.d);
                    } else {
                        zsb zsb = this.l;
                        if (zsb != null) {
                            zsb.aB();
                        }
                    }
                    nne = r6;
                }
                if (nne != null) {
                    this.q = new ukw(nne);
                    nnjArr[4] = this.q;
                    i();
                }
            }
            amqw.b(true);
            this.h.a(nnjArr);
            if (c()) {
                boolean z2 = (this.h == null || this.j == null) ? false : true;
                amqw.b(z2);
                if (this.b.k()) {
                    unj h = this.b.h();
                    if (h != null) {
                        this.d.a(h);
                    }
                }
            } else {
                SurfaceTexture surfaceTexture = this.c.b.getSurfaceTexture();
                if (surfaceTexture != null) {
                    a(surfaceTexture, false);
                }
            }
            if (this.f != null) {
                if (VERSION.SDK_INT < 21) {
                    int i = this.f.b.f;
                    if (c()) {
                        this.b.a(i);
                    } else {
                        VideoWithPreviewView videoWithPreviewView = this.c;
                        i = ((i % 360) + 360) % 360;
                        if (i % 90 != 0) {
                            z = false;
                        }
                        uhy.a(z);
                        if (videoWithPreviewView.g != i) {
                            videoWithPreviewView.g = i;
                            videoWithPreviewView.d();
                        }
                    }
                }
                ukz ukz = this.f.b;
                this.b.b(Math.min((!ukz.b ? ((float) ukz.d()) / (((float) this.f.b.g) / 1000000.0f) : 30.0f) * 0.85f, 24.0f));
                h();
            }
        }
    }

    private final void h() {
        try {
            nnj nnj = this.p;
            float f = 0.0f;
            if (nnj != null) {
                nnj.a(1, Float.valueOf(!this.f.i() ? 1.0f - this.f.v() : 0.0f));
            }
            ukw ukw = this.q;
            if (ukw != null) {
                if (!this.f.i()) {
                    f = this.f.v();
                }
                ukw.a(1, Float.valueOf(f));
            }
        } catch (nlq e) {
            xtl.a("Couldn't update audio volume.", e);
        }
    }

    private final void i() {
        umr umr = this.h;
        if (this.q != null && umr != null) {
            umr.b(false);
            umr.a(this.q, 1001, Long.valueOf(this.f.u() + this.f.j()));
            umr.b(true);
        }
    }

    public final void a(SurfaceTexture surfaceTexture, boolean z) {
        if (!(this.h == null || this.j == null)) {
            Object surface = surfaceTexture != null ? new Surface(surfaceTexture) : null;
            if (z) {
                this.h.b(this.j, 1, surface);
                return;
            }
            this.h.a(this.j, 1, surface);
        }
    }
}
