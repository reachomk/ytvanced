package defpackage;

import android.view.View;

/* renamed from: cti */
final class cti implements cto {
    private cti() {
    }

    public final String a() {
        return "scale";
    }

    public final float a(Object obj) {
        View a = cte.a(obj, (cto) this);
        float scaleX = a.getScaleX();
        if (scaleX == a.getScaleY()) {
            return scaleX;
        }
        throw new RuntimeException("Tried to get scale of view, but scaleX and scaleY are different");
    }

    public final float a(clm clm) {
        return clm.e() ? clm.b() : 1.0f;
    }

    public final void a(Object obj, float f) {
        View a = cte.a(obj, (cto) this);
        a.setScaleX(f);
        a.setScaleY(f);
    }

    public final void b(Object obj) {
        View a = cte.a(obj, (cto) this);
        a.setScaleX(1.0f);
        a.setScaleY(1.0f);
    }

    /* synthetic */ cti(byte b) {
    }
}
