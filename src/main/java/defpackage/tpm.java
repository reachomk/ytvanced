package defpackage;

import android.net.Uri;

/* renamed from: tpm */
public final class tpm implements anvb {
    private final Uri a;

    public tpm(Uri uri) {
        this.a = uri;
    }

    public final String a() {
        return this.a.getPath();
    }

    public final anvb a(String str) {
        return new tpm(this.a.buildUpon().encodedPath(str).build());
    }

    public final String toString() {
        return this.a.toString();
    }

    public final /* bridge */ /* synthetic */ Object b() {
        return this.a;
    }
}
