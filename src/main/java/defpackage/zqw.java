package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.youtube.edit.geo.LocationSearchView;

/* renamed from: zqw */
public final /* synthetic */ class zqw implements OnClickListener {
    private final LocationSearchView a;

    public zqw(LocationSearchView locationSearchView) {
        this.a = locationSearchView;
    }

    public final void onClick(View view) {
        this.a.a.setText("");
    }
}
