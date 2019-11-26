package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: ovp */
public final class ovp implements ovi {
    private final Context a;
    private final List b = new ArrayList();
    private final ovi c;
    private ovi d;
    private ovi e;
    private ovi f;
    private ovi g;
    private ovi h;
    private ovi i;
    private ovi j;

    public ovp(Context context, ovi ovi) {
        this.a = context.getApplicationContext();
        this.c = (ovi) oxz.a((Object) ovi);
    }

    public final void a(owt owt) {
        this.c.a(owt);
        this.b.add(owt);
        ovp.a(this.d, owt);
        ovp.a(this.e, owt);
        ovp.a(this.f, owt);
        ovp.a(this.g, owt);
        ovp.a(this.h, owt);
        ovp.a(this.i, owt);
    }

    public final long a(ovm ovm) {
        oxz.b(this.j == null);
        String scheme = ovm.a.getScheme();
        if (ozp.a(ovm.a)) {
            scheme = ovm.a.getPath();
            if (scheme == null || !scheme.startsWith("/android_asset/")) {
                if (this.d == null) {
                    this.d = new ovw();
                    a(this.d);
                }
                this.j = this.d;
            } else {
                this.j = d();
            }
        } else if ("asset".equals(scheme)) {
            this.j = d();
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                this.f = new ovb(this.a);
                a(this.f);
            }
            this.j = this.f;
        } else if ("rtmp".equals(scheme)) {
            if (this.g == null) {
                try {
                    this.g = (ovi) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    a(this.g);
                } catch (ClassNotFoundException unused) {
                    oyp.a("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating RTMP extension", e);
                }
                if (this.g == null) {
                    this.g = this.c;
                }
            }
            this.j = this.g;
        } else if ("data".equals(scheme)) {
            if (this.h == null) {
                this.h = new ovd();
                a(this.h);
            }
            this.j = this.h;
        } else if ("rawresource".equals(scheme)) {
            if (this.i == null) {
                this.i = new owp(this.a);
                a(this.i);
            }
            this.j = this.i;
        } else {
            this.j = this.c;
        }
        return this.j.a(ovm);
    }

    public final int a(byte[] bArr, int i, int i2) {
        return ((ovi) oxz.a(this.j)).a(bArr, i, i2);
    }

    public final Uri b() {
        ovi ovi = this.j;
        return ovi != null ? ovi.b() : null;
    }

    public final Map c() {
        ovi ovi = this.j;
        return ovi != null ? ovi.c() : Collections.emptyMap();
    }

    public final void a() {
        ovi ovi = this.j;
        if (ovi != null) {
            try {
                ovi.a();
            } finally {
                this.j = null;
            }
        }
    }

    private final ovi d() {
        if (this.e == null) {
            this.e = new ouv(this.a);
            a(this.e);
        }
        return this.e;
    }

    private final void a(ovi ovi) {
        for (int i = 0; i < this.b.size(); i++) {
            ovi.a((owt) this.b.get(i));
        }
    }

    private static void a(ovi ovi, owt owt) {
        if (ovi != null) {
            ovi.a(owt);
        }
    }
}
