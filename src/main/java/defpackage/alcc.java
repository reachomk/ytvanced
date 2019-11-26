package defpackage;

import android.view.View;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: alcc */
final class alcc extends WeakReference {
    public final String a;

    public alcc(View view, ReferenceQueue referenceQueue, String str) {
        super(view, referenceQueue);
        this.a = str;
    }
}
