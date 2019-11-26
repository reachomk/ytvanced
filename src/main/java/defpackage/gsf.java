package defpackage;

import com.google.android.apps.youtube.app.extensions.upload.EditVideoActivity;
import com.google.android.youtube.R;

/* renamed from: gsf */
public final class gsf implements afsw {
    private final /* synthetic */ EditVideoActivity a;

    public gsf(EditVideoActivity editVideoActivity) {
        this.a = editVideoActivity;
    }

    public final void a(bqn bqn) {
        xtl.a("Error while making the metadata editor request.", (Throwable) bqn);
        this.a.finish();
        xpr.a(this.a, (int) R.string.error_generic, 1);
    }
}
