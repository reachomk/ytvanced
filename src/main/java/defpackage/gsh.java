package defpackage;

import com.google.android.apps.youtube.app.extensions.upload.EditVideoActivity;
import com.google.android.youtube.R;

/* renamed from: gsh */
public final class gsh implements afsw {
    private final /* synthetic */ asxv a;
    private final /* synthetic */ EditVideoActivity b;

    public gsh(EditVideoActivity editVideoActivity, asxv asxv) {
        this.b = editVideoActivity;
        this.a = asxv;
    }

    public final void a(bqn bqn) {
        this.b.C.a(true);
        xtl.a("Error updating video metadata", (Throwable) bqn);
        xpr.a(this.b, (int) R.string.edit_video_error_failed, 0);
    }
}
