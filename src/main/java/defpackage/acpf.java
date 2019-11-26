package defpackage;

import android.view.View;
import com.google.android.libraries.youtube.edit.geo.LocationSearchView;
import com.google.android.youtube.R;

/* renamed from: acpf */
final /* synthetic */ class acpf implements xsd {
    private final acpe a;

    acpf(acpe acpe) {
        this.a = acpe;
    }

    public final void a(Object obj) {
        acpe acpe = this.a;
        View view = (View) obj;
        if (acpe.Z == null) {
            acpe.Z = acpe.ax.a((LocationSearchView) view, new acpo(acpe));
        }
        acpe.Z.a();
        acpe.c = R.id.pre_stream_location_search;
    }
}
