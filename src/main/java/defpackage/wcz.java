package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.google.android.youtube.R;

/* renamed from: wcz */
final /* synthetic */ class wcz implements OnCancelListener {
    private final wda a;
    private final wdj b;
    private final akvy c;
    private final wef d;
    private final wkt e;

    wcz(wda wda, wdj wdj, akvy akvy, wef wef, wkt wkt) {
        this.a = wda;
        this.b = wdj;
        this.c = akvy;
        this.d = wef;
        this.e = wkt;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        wda wda = this.a;
        wda.a(wda.a.getText(R.string.comments_discard), this.b, this.c, this.d, this.e);
    }
}
