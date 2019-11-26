package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: adov */
final class adov {
    public final adow a;
    public final SparseArray b;
    public final SparseArray c;
    public final adiw d;
    public final adpa e;
    public final boolean f;
    public final adpa g;
    public final List h;
    public final List i;
    public final Set j;
    public final Set k;
    public final List l;

    /* synthetic */ adov(adow adow, SparseArray sparseArray, SparseArray sparseArray2, adiw adiw, adpa adpa, boolean z, adpa adpa2, List list, List list2, Set set, Set set2, List list3) {
        this.a = adow;
        this.b = sparseArray.clone();
        this.c = sparseArray2.clone();
        this.d = adiw;
        this.e = adpa;
        this.f = z;
        this.g = adpa2;
        this.h = new ArrayList(list);
        this.i = new ArrayList(list2);
        this.j = new HashSet(set);
        this.k = new HashSet(set2);
        this.l = new ArrayList(list3);
    }
}
