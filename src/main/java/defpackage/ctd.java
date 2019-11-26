package defpackage;

import android.view.View;

/* renamed from: ctd */
final class ctd implements cto {
    private ctd() {
    }

    public final String a() {
        return "alpha";
    }

    public final float a(Object obj) {
        if (obj instanceof View) {
            return ((View) obj).getAlpha();
        }
        String valueOf = String.valueOf(obj);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 49);
        stringBuilder.append("Tried to get alpha of unsupported mount content: ");
        stringBuilder.append(valueOf);
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    public final float a(clm clm) {
        return clm.f() ? clm.c() : 1.0f;
    }

    public final void a(Object obj, float f) {
        if (obj instanceof View) {
            ((View) obj).setAlpha(f);
            return;
        }
        String valueOf = String.valueOf(obj);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 44);
        stringBuilder.append("Setting alpha on unsupported mount content: ");
        stringBuilder.append(valueOf);
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    public final void b(Object obj) {
        a(obj, 1.0f);
    }

    /* synthetic */ ctd(byte b) {
    }
}
