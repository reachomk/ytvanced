package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: ekj */
public final class ekj extends ekk implements ajkk, eib, vwy, xcp {
    public final Map a = new HashMap();
    private final ajjz b;
    private final Map c = new HashMap();
    private final xci d;
    private final eic e;
    private final adqf f;
    private final vwu g;
    private String h;
    private float i = 1.777f;
    private boolean j;

    public ekj(elm elm, ajjz ajjz, xci xci, eic eic, adqf adqf, vwu vwu) {
        super(elm);
        this.b = ajjz;
        this.d = xci;
        this.e = eic;
        this.f = adqf;
        this.g = vwu;
    }

    public final float a(String str) {
        if (str == null || (this.j && TextUtils.equals(this.h, str))) {
            return 1.777f;
        }
        Float f = (Float) this.c.get(str);
        if (f != null) {
            return f.floatValue();
        }
        return 1.777f;
    }

    private final float c() {
        return a(this.h);
    }

    public final void A_() {
        this.d.a((Object) this);
        this.e.a(this);
        this.b.a((ajkk) this);
        this.g.d.add(this);
    }

    public final void ar_() {
        this.d.b(this);
        this.e.b(this);
        this.b.b(this);
        this.g.d.remove(this);
    }

    public final void a(eja eja) {
        String str;
        if (eja == null) {
            str = null;
        } else {
            String b = eja.b();
            if (TextUtils.isEmpty(b)) {
                str = eja.c();
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("PlaybackToken must have valid video id or playlist id");
                }
            }
            str = b;
        }
        this.h = str;
        this.j = false;
    }

    public final void a(int i, int i2) {
        float f = ((float) i) / ((float) i2);
        this.i = f;
        a(this.h, f);
    }

    public final void a(boolean z) {
        if (this.j != z) {
            float c = c();
            this.j = z;
            float c2 = c();
            if (!fnz.a(c, c2)) {
                b(this.h, c2);
            }
        }
    }

    private final void a(String str, float f) {
        if (str != null) {
            float c = c();
            this.c.put(str, Float.valueOf(f));
            f = c();
            if (!fnz.a(c, f)) {
                b(str, f);
            }
        }
    }

    private final void b(String str, float f) {
        Set<ekm> set = (Set) this.a.get(str);
        if (set != null) {
            for (ekm a : set) {
                a.a(str, f);
            }
        }
    }

    private final boolean d() {
        return this.f.c() != null;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{vpa.class, ahkn.class};
        } else if (i != 0) {
            if (i != 1) {
                StringBuilder stringBuilder = new StringBuilder(32);
                stringBuilder.append("unsupported op code: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (((ahkn) obj).a == airi.VIDEO_PLAYING && !d()) {
                a(this.h, this.i);
                return null;
            }
        } else if (((vpa) obj).a == vpb.AD_VIDEO_PLAYING && !d()) {
            a(this.h, this.i);
            return null;
        }
        return clsArr;
    }
}
