package defpackage;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.youtube.upload.developer.DebugUploadActivity;

/* renamed from: alzs */
public final /* synthetic */ class alzs implements OnClickListener {
    private final DebugUploadActivity a;

    public alzs(DebugUploadActivity debugUploadActivity) {
        this.a = debugUploadActivity;
    }

    public final void onClick(View view) {
        DebugUploadActivity debugUploadActivity = this.a;
        try {
            debugUploadActivity.startActivity(new Intent(debugUploadActivity, Class.forName("com.google.android.libraries.youtube.edit.gallery.GalleryActivity")));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
