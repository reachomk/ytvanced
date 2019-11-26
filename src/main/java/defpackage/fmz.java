package defpackage;

import android.view.View;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: fmz */
public final class fmz extends WeakReference {
    public final String a;

    public fmz(String str, View view, ReferenceQueue referenceQueue) {
        super(view, referenceQueue);
        this.a = str;
    }
}
