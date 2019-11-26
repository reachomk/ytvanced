package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: bax */
public final class bax {
    public final List a;
    public final boolean b;

    bax(List list, boolean z) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.a = list;
        this.b = z;
    }

    public final boolean a() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            bam bam = (bam) this.a.get(i);
            if (bam == null || !bam.s()) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MediaRouteProviderDescriptor{ routes=");
        stringBuilder.append(Arrays.toString(this.a.toArray()));
        stringBuilder.append(", isValid=");
        stringBuilder.append(a());
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

    public static bax a(Bundle bundle) {
        List list = null;
        if (bundle == null) {
            return null;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (!(parcelableArrayList == null || parcelableArrayList.isEmpty())) {
            int size = parcelableArrayList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(bam.a((Bundle) parcelableArrayList.get(i)));
            }
            list = arrayList;
        }
        return new bax(list, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }
}
