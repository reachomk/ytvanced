package defpackage;

import android.content.Intent;
import com.google.android.apps.youtube.app.MainLiveCreationActivity;

/* renamed from: lxn */
public final /* synthetic */ class lxn implements lye {
    private final nn a;

    public lxn(nn nnVar) {
        this.a = nnVar;
    }

    public final Intent a(apxu apxu) {
        Intent intent = new Intent(this.a, MainLiveCreationActivity.class);
        intent.putExtra("navigation_endpoint", apxu.toByteArray());
        return intent;
    }
}
