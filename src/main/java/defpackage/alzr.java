package defpackage;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.google.android.libraries.youtube.upload.developer.DebugUploadActivity;

/* renamed from: alzr */
public final /* synthetic */ class alzr implements OnCheckedChangeListener {
    private final DebugUploadActivity a;
    private final bbns b;

    public alzr(DebugUploadActivity debugUploadActivity, bbns bbns) {
        this.a = debugUploadActivity;
        this.b = bbns;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        DebugUploadActivity debugUploadActivity = this.a;
        try {
            this.b.a(debugUploadActivity.a, Boolean.valueOf(z));
            debugUploadActivity.a();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
