package defpackage;

import android.os.Bundle;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: xdb */
final class xdb implements thr {
    private final /* synthetic */ Bundle a;

    xdb(Bundle bundle) {
        this.a = bundle;
    }

    public final List b() {
        return null;
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.a.keySet()) {
            arrayList.add(Pair.create(str, this.a.getString(str, "")));
        }
        return arrayList;
    }
}
