package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.youtube.app.extensions.upload.EditVideoActivity;

/* renamed from: gsg */
final /* synthetic */ class gsg implements OnClickListener {
    private final EditVideoActivity a;
    private final asye b;

    gsg(EditVideoActivity editVideoActivity, asye asye) {
        this.a = editVideoActivity;
        this.b = asye;
    }

    public final void onClick(View view) {
        EditVideoActivity editVideoActivity = this.a;
        asye asye = this.b;
        aaas aaas = editVideoActivity.u;
        apxu apxu = asye.e;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, null);
    }
}
