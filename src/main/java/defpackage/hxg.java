package defpackage;

import com.google.android.youtube.R;

/* renamed from: hxg */
final class hxg implements hwu {
    private final /* synthetic */ hxd a;

    public final void a() {
        hxd hxd = this.a;
        if (hxd.d) {
            aeg aeg = new aeg(hxd.a, R.style.f535Theme.YouTube.Light.Dialog);
            aeg.a((int) R.string.varispeed_unavailable_title);
            aeg.b(R.string.varispeed_unavailable_message);
            aeg.a(R.string.ok, null);
            aeg.a().show();
            return;
        }
        hxd.c.a(hxd.a);
    }

    /* synthetic */ hxg(hxd hxd) {
        this.a = hxd;
    }
}
