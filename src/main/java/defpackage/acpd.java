package defpackage;

import com.google.android.youtube.R;

/* renamed from: acpd */
final /* synthetic */ class acpd implements xsd {
    private final acpe a;

    acpd(acpe acpe) {
        this.a = acpe;
    }

    public final void a(Object obj) {
        acpe acpe = this.a;
        if (acpe.ab.isShown()) {
            acpe.ab.requestFocus();
        }
        acpe.c = R.id.pre_stream_content;
    }
}
