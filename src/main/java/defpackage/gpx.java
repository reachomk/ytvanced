package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.view.View;

/* renamed from: gpx */
final /* synthetic */ class gpx implements OnShowListener {
    private final View a;

    gpx(View view) {
        this.a = view;
    }

    public final void onShow(DialogInterface dialogInterface) {
        this.a.requestFocus();
    }
}
