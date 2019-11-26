package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.youtube.edit.geo.LocationSearchView;

/* renamed from: zqt */
public final /* synthetic */ class zqt implements OnClickListener {
    private final LocationSearchView a;

    public zqt(LocationSearchView locationSearchView) {
        this.a = locationSearchView;
    }

    public final void onClick(View view) {
        LocationSearchView locationSearchView = this.a;
        xpr.a(locationSearchView.a);
        zqm zqm = locationSearchView.b;
        if (zqm != null) {
            zqm.b.a();
        }
    }
}
