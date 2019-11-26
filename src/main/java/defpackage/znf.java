package defpackage;

import android.view.TextureView;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: znf */
final class znf implements zng {
    public final Set a = Collections.newSetFromMap(new HashMap());
    public final Set b = Collections.newSetFromMap(new HashMap());
    public final Map c = new ConcurrentHashMap();
    public final Map d = new ConcurrentHashMap();
    public List e;
    private final zmt f;
    private String g;
    private boolean h = true;

    znf(zmt zmt) {
        this.f = zmt;
    }

    private final String d() {
        return this.h ? this.g : null;
    }

    public final void a(String str) {
        if (str != null && !str.equals(d())) {
            this.g = str;
            b();
        }
    }

    public final boolean a() {
        return this.h;
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        if (this.h != z) {
            this.h = z;
            b();
        }
    }

    public final void b(String str) {
        a(amur.a(str, Integer.valueOf(2)));
    }

    public final void a(Map map) {
        zmt zmt = this.f;
        synchronized (zmt.i) {
            if (map != null) {
                if (!map.isEmpty()) {
                    if (zmt.j != null) {
                        for (Entry entry : map.entrySet()) {
                            zmt.a((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                        }
                        zmt.b();
                    } else {
                        for (Entry entry2 : map.entrySet()) {
                            zmt.i.put((String) entry2.getKey(), (Integer) entry2.getValue());
                        }
                    }
                }
            }
        }
    }

    public final void a(String str, TextureView textureView) {
        if (str == null || textureView == null) {
            String valueOf = String.valueOf(textureView);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 31) + valueOf.length());
            stringBuilder.append("Unexpected requestThumbnail(");
            stringBuilder.append(str);
            stringBuilder.append(", ");
            stringBuilder.append(valueOf);
            stringBuilder.append(")");
            xtl.a(stringBuilder.toString(), new Exception());
            return;
        }
        synchronized (this.c) {
            TextureView textureView2 = (TextureView) this.c.get(str);
            if (textureView2 != textureView) {
                if (textureView2 != null) {
                    textureView2.setSurfaceTextureListener(null);
                }
                this.c.put(str, textureView);
                textureView.setSurfaceTextureListener(new znn(str, this.c, this.d, new zni(this)));
            }
            c(str);
        }
    }

    public final void c(String str) {
        synchronized (this.c) {
            TextureView textureView = (TextureView) this.c.get(str);
            if (textureView != null && textureView.isAvailable()) {
                zmt zmt = this.f;
                znh znh = new znh(this, str, textureView);
                xsd xsd = zmt.h;
                if (xsd != null) {
                    xsd.a(new znl(str, textureView, znh));
                }
            }
        }
    }

    public final zmo a(zmq zmq) {
        return this.f.a(zmq);
    }

    public final zmo a(zmp zmp) {
        synchronized (this.a) {
            List list = this.e;
            if (list != null) {
                zmp.a(list);
            }
            znd.a(this.a, zmp);
        }
        return new znk(this, zmp);
    }

    public final zmo a(zmr zmr) {
        synchronized (this.b) {
            zjt a = zjt.a(this.e, this.g);
            if (a != null) {
                zmr.a(a);
            }
            znd.a(this.b, zmr);
        }
        return new znj(this, zmr);
    }

    public final void b() {
        zjt a = zjt.a(this.e, this.g);
        if (a != null) {
            znd.b(this.b, a);
        }
        zmt zmt = this.f;
        String d = zmt.b(ayza.EFFECT_SUBPACKAGE_ID_EXPRESSIVE).d();
        ayza ayza = ayza.EFFECT_SUBPACKAGE_ID_UNSPECIFIED;
        if (zjt.a(d)) {
            d = zmt.b(ayza.EFFECT_SUBPACKAGE_ID_PRESET).d();
            if (zjt.a(d)) {
                d = "NORMAL";
            } else {
                ayza = ayza.EFFECT_SUBPACKAGE_ID_PRESET;
            }
        } else {
            ayza = ayza.EFFECT_SUBPACKAGE_ID_EXPRESSIVE;
        }
        if (!d.equals(zmt.l) || zmt.m != ayza) {
            zmt.l = d;
            zmt.m = ayza;
            zmt.c();
        }
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        List list = this.e;
        if (list != null) {
            znd.b(this.a, list);
        }
    }
}
