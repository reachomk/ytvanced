package defpackage;

import android.content.Context;

/* renamed from: nvr */
public final class nvr implements nwb {
    private final nwb a;
    private final nwb b = new nvu((byte) 0);
    private final nwb c;
    private final nwb d;
    private nwb e;

    public nvr(Context context, String str) {
        this.a = (nwb) nwf.a(new nvs(str));
        this.c = new nvh(context);
        this.d = new nvm(context);
    }

    public final long a(nvq nvq) {
        nwf.b(this.e == null);
        String scheme = nvq.a.getScheme();
        if (nxf.a(nvq.a)) {
            if (nvq.a.getPath().startsWith("/android_asset/")) {
                this.e = this.c;
            } else {
                this.e = this.b;
            }
        } else if ("asset".equals(scheme)) {
            this.e = this.c;
        } else if ("content".equals(scheme)) {
            this.e = this.d;
        } else {
            this.e = this.a;
        }
        return this.e.a(nvq);
    }

    public final int a(byte[] bArr, int i, int i2) {
        return this.e.a(bArr, i, i2);
    }

    public final String a() {
        nwb nwb = this.e;
        return nwb != null ? nwb.a() : null;
    }

    public final void b() {
        nwb nwb = this.e;
        if (nwb != null) {
            try {
                nwb.b();
            } finally {
                this.e = null;
            }
        }
    }
}
