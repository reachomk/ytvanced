package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.net.Uri;
import android.util.SparseArray;
import defpackage.ngm;
import defpackage.ngo;
import java.lang.ref.WeakReference;

public class BitmapKeyHolderRegistry {
    private static int a = 1;
    private final SparseArray b = new SparseArray();

    public final synchronized int a(ngo ngo) {
        SparseArray sparseArray = this.b;
        int i = a + 1;
        a = i;
        sparseArray.append(i, new WeakReference(ngo));
        return a;
    }

    public final synchronized Uri a(ngm ngm) {
        WeakReference weakReference = (WeakReference) this.b.get(ngm.a);
        ngo ngo = weakReference != null ? (ngo) weakReference.get() : null;
        if (ngo == null) {
            return null;
        }
        return ngo.a(ngm.b);
    }
}
