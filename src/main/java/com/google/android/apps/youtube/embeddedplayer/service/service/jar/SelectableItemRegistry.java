package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.util.SparseArray;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISelectableItemRegistryService.Stub;
import defpackage.nhh;
import defpackage.nhj;
import java.lang.ref.WeakReference;

public class SelectableItemRegistry extends Stub {
    private static int a = 1;
    private final SparseArray b = new SparseArray();

    public final synchronized int a(nhj nhj) {
        SparseArray sparseArray = this.b;
        int i = a + 1;
        a = i;
        sparseArray.append(i, new WeakReference(nhj));
        return a;
    }

    private final synchronized void b(nhh nhh) {
        WeakReference weakReference = (WeakReference) this.b.get(nhh.a);
        nhj nhj = weakReference != null ? (nhj) weakReference.get() : null;
        if (nhj != null) {
            nhj.a(nhh.b);
        }
    }

    public final void a(nhh nhh) {
        b(nhh);
    }
}
