package defpackage;

import android.content.res.TypedArray;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: fe */
final class fe implements OnClickListener {
    private final /* synthetic */ ff a;

    fe(ff ffVar) {
        this.a = ffVar;
    }

    public final void onClick(View view) {
        ff ffVar = this.a;
        if (ffVar.a && ffVar.isShowing()) {
            ffVar = this.a;
            if (!ffVar.c) {
                TypedArray obtainStyledAttributes = ffVar.getContext().obtainStyledAttributes(new int[]{16843611});
                ffVar.b = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
                ffVar.c = true;
            }
            if (ffVar.b) {
                this.a.cancel();
            }
        }
    }
}
